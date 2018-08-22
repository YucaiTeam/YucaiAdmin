//是否在进行搜索操作
var isSearching = false;
// 记录排序的列的索引 0 1 2
var orderCol = 0;
// 记录排序的顺序 asc desc
var orderArgs = 'asc';
// 当前正在修改的dormManId
var nowDormManId = "";


//记录   点击查号进行查询所有

$(function() {
	var $table = $('#table');
	// 进行dataTables的初始化
	var _table = $table.DataTable(defaultOption);

	//jsp页面需要此_table，所以使用此方法进行返回
	$.fn.getTable_ = function() {
		return _table;
	}
	
	/**
	 * 鼠标在移动到标题列的时候，显示详细内容
	 */
	$('#table tbody').on('mouseenter', 'tr td:nth-child(2)', function(){
		//bug---在鼠标移入的时候不能简单的获取其中的数值
		//而是获取item中的值
		var item = _table.row($(this).closest('tr')).data();
		//获取到内容
		var cont = item.newstitle;
		//获取到该div的顶部、左部、高、宽
        var top = $(this).offset().top;
        var left = $(this).offset().left;
        var width = $(this).width();
        var height = $(this).height();
        //从而计算出右下角的坐标
        var right = left + width;
        var bottom = top + height;
        //将浮动的小窗显示在指定坐标处
        $(".tableShow").offset({ top: bottom, left: right });
        $(".tableShow").html(cont);
        //显示
        $(".tableShow").css("opacity","1");
	});
	
	/**
	 * 鼠标在移出标题列的时候，显示内容
	 */
	$('#table tbody').on('mouseout', 'tr td:nth-child(2)', function(){
		$(".tableShow").css("opacity","0");
	});
	
	
	/**
	 * 搜索按钮点击事件
	 * 会刷新表格，重新调用服务端
	 * 传入参数  进行条件查询
	 */
	$('body').on('click', '.searchButton', function(e) {
		// 进行列表draw更新操作的话，会进行search参数的获取，传入后台，进行查询
		var table = $('#table').DataTable();
		//绘制图标
		table.draw(true);
	});

	//声明变量记录当前点击行 $(this).closest('tr')
	var delMsg;
	/**
	 * 表格中的删除按钮点击事件
	 */
	$('#table tbody').on('click', '.btnDel', function(e) {
		e.preventDefault();
		// 获取到当前行的数据data json格式
		var item = _table.row($(this).closest('tr')).data();
		console.log(item);
		delMsg = $(this).closest('tr');
		// 将行的name传入模态框 变红 警告
		$(".delFont").html(item.name);
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">确定要删除该<br><span style="color:red">'+item.newstitle+'</span><br>新闻纪录吗？</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 6
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				    //按钮【确定】的回调
					  //调用AJAX进行数据库的删除
					  //根据返回的参数  
					  //true   --删除成功
					  //false  --删除失败
					  //根据删除结果进行弹窗显示
					  delAJAX(item.newsid);
					  layer.close(index);
				  }
				  ,btn2: function(index, layero){
				    //按钮【取消】的回调
				    
				    //return false 开启该代码可禁止点击该按钮关闭
				  }
				  ,cancel: function(){ 
				    //右上角关闭回调
				    
				    //return false 开启该代码可禁止点击该按钮关闭
				  }
				});
			}); 
	});
	
	/**
	 * 删除的AJAX
	 */
	function delAJAX(newsid){
		$.ajax({
			type : "POST",
			url : url+"YucaiAdmin/delnews.action",
			cache : false, // 禁用缓存
			data : {
				"newsid":newsid
			},
			success : function(data) {
				console.log(data);
				var table = $('#table').DataTable();
				table.draw(false);
			},
			error : function(data) {
				console.log(data);
			}
		});
	}

	/**
	 * 点击X号的时候 进行搜索框的文字的清除
	 */
	$('body').on('click', '.inputArgsClear', function(e) {
		$(".inputArgs").val("");
		$(".inputArgsClear").hide();
		
		//消除完之后进行页面更新
		var table = $('#table').DataTable();
		//绘制图标
		table.draw(true);
	});


	/**
	 * 搜索框进行文字输入的时候，进行 x号  的显示
	 */
	$('body').on('input', '.inputArgs', function(e) {
		$(".inputArgsClear").show();
	});

	

	/**
	 * 执行自定义控件   覆盖原控件
	 */
	changeControls();
	function changeControls() {
		//先获取到div
		//不能在底下获取，否则被覆盖就找不到了
		var parent = $("#table_filter").parent().parent();
		var page = '<div class="myControl">'
					+'<div class="dates">'
						+'<div class="input-group date form_date startDate" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1">'
				             +'<input class="form-control inputDateStart"  type="text" value="" placeholder="起始日期">'
			                 +'<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>'
			                 +'<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>'
			            +'</div>'
			            +'<div class="input-group date form_date endDate" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1">'
			                 +'<input class="form-control inputDateEnd"  type="text" value="" placeholder="结束日期">'
		                     +'<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>'
		                     +'<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>'
		                +'</div>'
                	+'<div class="args">'
						+ '<input class="form-control inputArgs" type="text"  value="" name="inputArgs" placeholder="搜索内容">'
						+ '<font class="inputArgsClear">X</font>'
						+ '<button type="button" class="btn  searchButton">搜索</button></div>'
				+'</div>';
		//设置相关样式		
		$("#table_filter").parent().parent().css({
			"marginBottom":"-10px",
			"marginTop":"15px",
			});
		$("#table_filter").parent().html(page);
		//先将X号隐藏
		$(".inputArgsClear").hide();
		//设置行的布局col6
		parent.children("div:first-child").removeClass("mdl-cell--6-col").addClass("mdl-cell--3-col");
		parent.children("div:last-child").removeClass("mdl-cell--6-col").addClass("mdl-cell--9-col");
		//设置时间
		$('.startDate').datetimepicker({
			language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			minView: 2,
			forceParse: 0
	    }).on('changeDate',function(ev){
	    	DateAJAX();
        }); 
		$('.endDate').datetimepicker({
			language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			minView: 2,
			forceParse: 0
	    }).on('changeDate',function(ev){
	    	DateAJAX();
        }); 
		
		//时间设置完毕   隐藏动画
		setTimeout(function(){
			$(".spinner").css("visibility","hidden");
		},800);
	}
	
	/**
	 * 根据时间请求后台
	 */
	function DateAJAX(){
		var  sTime=$(".inputDateStart").val()==""? "2017-1-1":$(".inputDateStart").val();
		var  eTime=$(".inputDateEnd").val()==""?getNowFormatDate():$(".inputDateEnd").val();
		//进行时间的判断--起始日期，终止日期大小问题
	    var start = Date.parse(sTime);
	    var end = Date.parse(eTime);
		
	    if(start>end){
	    	alert("结束日期不能小于起始日期，请重新选择~");
	    	$(".inputDateEnd").val("");
	    	var table = $('#table').DataTable();
			//绘制图标
			table.draw(true);	
	    	return;
	    }
	    //将form表单的值设置为获取的时间
	    $(".startdate").val(sTime);
	    $(".enddate").val(eTime);
	    
	    var table = $('#table').DataTable();
		//绘制图标
		table.draw(true);		
	}

	/**
	 * 检测是否是移动设备
	 */
	function checkPhone() {
		// 判断是否是移动设备
		if (/Android|webOS|iPhone|iPod|BlackBerry/i.test(navigator.userAgent)) {
			return true;
		} else {
			return false;
		}
	}
})

//假数据
var data = [
            	{
            	'newstitle':'这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题',
            	'newssource':'666',
            	'newsauthor':'777',
            	'editdate':'888',
            	'areaname':'999',
            	'bankname':'5656',
            	},
            	{
                	'newstitle':'这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题',
                	'newssource':'666',
                	'newsauthor':'777',
                	'editdate':'888',
                	'areaname':'999',
                	'bankname':'5656',
                	},
                	{
                    	'newstitle':'这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题',
                    	'newssource':'666',
                    	'newsauthor':'777',
                    	'editdate':'888',
                    	'areaname':'999',
                    	'bankname':'5656',
                    	},
                    	{
                        	'newstitle':'这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题',
                        	'newssource':'666',
                        	'newsauthor':'777',
                        	'editdate':'888',
                        	'areaname':'999',
                        	'bankname':'5656',
                        	},
                        	{
                            	'newstitle':'这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题这是标题',
                            	'newssource':'666',
                            	'newsauthor':'777',
                            	'editdate':'888',
                            	'areaname':'999',
                            	'bankname':'5656',
                            	},
            	
            ];
// 默认配置
var defaultOption = {
	// 设置列
	columnDefs : [ {
		targets : [ 0, 1, 2, 3, 4, 5, 6, 7],
		className: 'mdl-data-table__cell--non-numeric'
	} ],
	//data:data,
	// 设置语言--国际化
	language : {
		"sProcessing" : "处理中...",
		"sLengthMenu" : "显示 _MENU_ 项结果",
		"sZeroRecords" : "没有匹配结果",
		"sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
		"sInfoEmpty" : "显示第 0 至 0 项结果，共 0 项",
		"sInfoFiltered" : "(由 _MAX_ 项结果过滤)",
		"sInfoPostFix" : "",
		"sSearch" : "搜索:",
		"sUrl" : "",
		"sEmptyTable" : "表中数据为空",
		"sLoadingRecords" : "载入中...",
		"sInfoThousands" : ",",
		"oPaginate" : {
			"sFirst" : "首页",
			"sPrevious" : "上页",
			"sNext" : "下页",
			"sLast" : "末页"
		},
		"oAria" : {
			"sSortAscending" : ": 以升序排列此列",
			"sSortDescending" : ": 以降序排列此列"
		}
	},
	"pagingType" : "full",
	autoWidth : false, // 禁用自动调整列宽
	stripeClasses : [ "odd", "even" ],// 为奇偶行加上样式，兼容不支持CSS伪类的场合
	//order : [], // 取消默认排序查询,否则复选框一列会出现小箭头
	processing : false, // 隐藏加载提示,自行处理
	serverSide : true, // 启用服务器端分页（在启动之后就会检测ajax返回值）
	// searching: false, //禁用原生搜索
	"ordering": false,
	"bDestroy" : true,
	ajax : function(data, callback, settings) {
		// 封装请求参数
		var form = $("#search");
		
		$(".startindex").val(data.start);
		$(".pagesize").val(data.length);
		$(".textcontent").val($(".inputArgs").val());
		$(".draw").val(data.draw);
		
		if($(".inputArgs").val()!="" || $(".inputDateStart").val()!="" ||$(".inputDateEnd").val()!=""){
			$(".isSearching").val("true");
		}else{
			$(".isSearching").val("false");
		}
		
		
		var param = userManage.getQueryCondition(data);
		// 表格在初始化的时候就会走这一步 进行向后台进行数据的请求 展现在页面上
		$.ajax({
			type : "POST",
			url : url+"YucaiAdmin/list.action",
			cache : false, // 禁用缓存
			data : form.serialize(),
			dataType : "json",
			success : function(result) {
				console.log(result);
				
				// 查询成功
				// 异常判断与处理
				if (result.errorCode) {
					alert("查询失败");
					return;
				}
				// 封装返回数据
				var returnData = {};
				returnData.draw = result.draw;// 这里直接自行返回了draw计数器,应该由后台返回
				returnData.recordsTotal = result.totals;// 总记录数
				returnData.recordsFiltered = result.totals;// 后台不实现过滤功能，每次查询均视作全部结果
				
				//将json转换为字符串
				var newsString = JSON.stringify(result.newsList);
				
				//将字符串进行过滤
				if($(".inputArgs").val()!=""){
					var reg=new RegExp("("+$(".inputArgs").val()+")","g");   
					newsString = newsString.replace(reg,"<font color=red>$1</font>"); 
				}

				//将字符串进行转换为JSON
				var newsJson = JSON.parse(newsString);

				//将处理过的JSON对象进行注入
				returnData.data = newsJson;
				isSearching = false;
				callback(returnData);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log(XMLHttpRequest);
			}
		});
	},
	// 数据的绑定
	columns : [
		// 序号  0
		{
			sTitle : '序号',
			data : null,
			className : 'text-center whiteSpace',
			render : function(data, type, row, meta) {
				return meta.row + 1 + meta.settings._iDisplayStart;
			}
		},
		// 新闻题目
		{
			data : "newstitle",// 字段名
		},
		// 新闻来源
		{
			data : "newssource",// 字段名
		},
		// 作者
		{
			data : "newsauthor",// 字段名
		},
		// 修改时间
		{
			data : "editdate",// 字段名,
			render : function(data, type, row, meta) {
				return (format(data));
			}
		},
		// 地区
		{
			data : "areaname",// 字段名
		},
		// 银行
		{
			data : "bankname",// 字段名
		},
		// 操作字段
		{
			data : null,// 字段名
			defaultContent : "",// 无默认值
			orderable : false
		},
	],
	// 进行 编辑 删除 按钮的添加
	"createdRow" : function(row, data, index) {
		// 不使用render，改用jquery文档操作呈现单元格
		/*var $btnEdit = $('<button type="button" class="btn btn-edit">修改</button>');*/
		var $btnEdit = $('<div class="btnEdit"></div>');
		var $btnDel = $('<div class="btnDel"></div>');
		/*var $btnDel = $('<button type="button" class="btn btn-danger btn-del">删除</button>');*/
		$('td', row).eq(7).append($btnEdit).append($btnDel);
	}
};

/**
 * 格式化时间    供页面显示
 * @param m
 * @returns
 */
function add0(m){return m<10?'0'+m:m }
function format(shijianchuo)
{
	//shijianchuo是整数，否则要parseInt转换
	var time = new Date(shijianchuo);
	var y = time.getFullYear();
	var m = time.getMonth()+1;
	var d = time.getDate();
	var h = time.getHours();
	var mm = time.getMinutes();
	var s = time.getSeconds();
	return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
}

// 我的一个管理 获取查询的参数
var userManage = {
	getQueryCondition : function(data) {
		var param = {};
		// 组装分页参数
		param.inputArgs = $(".inputArgs").val();// 查询条件
		param.startIndex = data.start;//数据起始点
		param.pageSize = data.length;//数据长度
		param.draw = data.draw;//固定参数
		return param;
	},
};
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
    return currentdate;
} 