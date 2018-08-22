$(function(){
	//加载页面数据
	getPageData();
	
	//loading动画
	function showLoading(){
		$(".spinner").css("visibility","visible");
	}
	function hideLoading(){
		$(".spinner").css("visibility","hidden");
	}
	
	/**
	 * 添加SeriesPanel
	 */
	$(".addSeriesPanel").unbind("click").click(function(){
		console.log("click");
		$("#addSeriesModal").modal("show");
	})
	
	//模态框内添加Series提交按钮
	$(".addSeriesBtn").click(function(){
		showLoading();
		var form = $("#addSeriesForm");
		//进行请求并传入数据
		$.ajax({
			url : url+"YucaiAdmin/addSeries.action",
			type : 'POST',
			data : form.serialize(),
			success : function(data) {
				hideLoading();
				//将值进行一个回显到页面
				console.log(data);
				if(data=="true"){
					//添加成功
					showTips_addSeries();
				}else{
					//添加失败
					showTips_edit("添加失败");
				}
			},
			error : function(data) {
				hideLoading();
				//提示失败
				showTips_edit("添加失败");
			}
		});
	})
	
	
	/**
	 * 添加点击图片事件--添加该体系下的课程
	 */
	$('.panel-group').on('click', '.panel>.panel-heading>.addImg', function(event){
		//子元素点击不触发父元素的事件
		//在这里阻止冒泡事件即可
		event.stopPropagation();
		//获取到标题文字，在模态框显示
		var title = $(this).parent().children(".panel-title").children().html();
		
		$(".modelWord").html(title);
		//获取到id，用于更新使用
		$("#addCourseModal").modal("show");
		//将id放到全局变量中，便于更新的时候使用id
		updateId = $(this).parent().parent().attr("id");
		$(".seriesid").val(updateId);
	});
	
	/**
	 * 删除点击图片事件--删除该体系及下的课程
	 */
	$('.panel-group').on('click', '.panel>.panel-heading>.delSeriesImg', function(event){
		//子元素点击不触发父元素的事件
		//在这里阻止冒泡事件即可
		event.stopPropagation();
		
		var title = $(this).parent().children(".panel-title").children().html();
		//alert();
		
		var id = $(this).parent().parent().attr("id");
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">是否确定删除<font style="color:red">'+title+'</font>系列及该系列下所有课程？删除不可逆!</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				      //按钮【确定】的回调
					  delSeries(id);
					  layer.close(index);
				  }
				});
			}); 
	});
	
	function delSeries(id){
		showLoading();
		$.ajax({
			url : url+"YucaiAdmin/delSeries.action",
			type : 'POST',
			data : {
				seriesId:id
			},
			success : function(data) {
				console.log(data);
				//成功就删除系列下的折叠框
				hideLoading();
				if(data=="true"){
					$("#"+id).remove();
					//提示
					delSeriesTip("删除成功!");
				}else{
					delSeriesTip("删除失败!");
				}
			},
			error : function(data) {
				hideLoading();
				delSeriesTip("删除失败!");
			}
		});
	}
	
	function delSeriesTip(word){
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">'+word+'</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				      //按钮【确定】的回调
					  layer.close(index);
				  }
				});
			}); 
	}
	
	
	
	
	/**
	 * 添加点击修改事件--修改
	 */
	$('.panel-group').on('click', '.panel .editImg', function(event){
		showLoading();
		//获取到本系列的id
		var seriesId = $(this).parents(".series").attr("id");
		//获取到本条目的id
		var id = $(this).children().val();
		//获取到标题文字，在模态框显示
		//应该获取本tr行内的第一个td下的html
		var title = $(this).parent().parent().children("td:first-child").html();
		$(".editModelWord").html(title);
		
		
		//进行存储
		$(".editCourseid").val(id);
		$(".editSeriesid").val(seriesId);
		
		$.ajax({
			url : url+"YucaiAdmin/getCourseByCourseId.action",
			type : 'POST',
			data : {
				courseId:id
			},
			success : function(data) {
				//将值进行一个回显到页面
				console.log(data);
				
				$(".coursesort").val(data.coursesort);
				$(".coursehour").val(data.coursehour);
				$(".coursedetail").val(data.coursedetail);
				$(".courseprice").val(data.courseprice);
				
				//打开模态框
				$("#editCourseModal").modal("show");
				hideLoading();
			},
			error : function(data) {
				//提示失败
				showTips_edit("查找失败");
				hideLoading();
			}
		});
	});
	
	$(".editCourseSaveBtn").click(function(){
		if(checkEditCourseDataEmpty()){
			showLoading();
			var form = $("#editCourseForm");
			var seriesId = $(".editSeriesid").val();
			$.ajax({
				url : url+"YucaiAdmin/updateCourse.action",
				type : 'POST',
				data : form.serialize(),
				success : function(data) {
					console.log(data);				
					if(data=="true"){
						hideLoading();
						//添加成功
						showTips_edit("修改成功");
						//清空本模态框下的值
						$(".inputText").val("");
						//刷新本系列id下的课程
						reflushSeries(seriesId);		
					}else{
						//添加失败
						showTips_edit("修改失败");
					}
				},
				error : function(data) {
					showTips_edit("修改失败");
					hideLoading();
				}
			});
		}else{
			showTipsEmpty();
		}
	})
	$(".editCourseClearBtn").click(function(){
		$(".inputText").val("");
	})
	
	/**
	 * 添加点击删除事件--删除
	 */
	$('.panel-group').on('click', '.panel .delImg', function(event){
		//获取到本系列的id
		var seriesId = $(this).parents(".series").attr("id");
		//获取到本条目的id
		var id = $(this).children().val();
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">是否确定删除？</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				      //按钮【确定】的回调
					  delAJAX(seriesId,id);
					  layer.close(index);
				  }
				});
			}); 
	});
	
	
	function delAJAX(seriesId,id){	
		showLoading();
		$.ajax({
			url : url+"YucaiAdmin/delCourse.action",
			type : 'POST',
			data : {
				courseId:id
			},
			success : function(data) {
				console.log(data);				
				if(data=="true"){
					hideLoading();
					//添加成功
					showTips_del("删除成功");
					//刷新本系列id下的课程
					reflushSeries(seriesId);		
				}else{
					//添加失败
					showTips_del("删除失败");
				}
			},
			error : function(data) {
				showTips_del("删除失败");
				hideLoading();
			}
		});
	}
	
	
	
	/**
	 * 模态框添加按钮点击的时候
	 */
	$(".addCourseSaveBtn").click(function(){
		if(checkAddCourseDataEmpty()){
			showLoading();
			var form = $("#addCourseForm");
			//先请求地区，将select填充
			$.ajax({
				url : url+"YucaiAdmin/addCourse.action",
				type : 'POST',
				data : form.serialize(),
				success : function(data) {
					console.log(data);
					if(data=="true"){
						//添加成功
						showTips_edit("添加成功");
						
						//刷新本条目
						var id = $(".seriesid").val();
						reflushSeries(id);			
					}else{
						//添加失败
						showTips_edit("添加失败");
					}
					hideLoading();
				},
				error : function(data) {
					//添加失败
					showTips_edit("添加失败");
					hideLoading();
				}
			});
		}else{
			showTipsEmpty();
		}
		
	})
	
	/**
	 * 模态框隐藏时的事件
	 */
	$('#addCourseModal').on('hidden.bs.modal', function () {
	    //进行数据的清除
		$(".inputText").val("");
	})
	
	
	/**
	 * 添加完课程条目之后，就进行本系列折叠框的数据更新
	 */
	function reflushSeries(id){
		showLoading();
		$.ajax({
			url : url+"YucaiAdmin/getCourseBySeriesId.action",
			type : 'POST',
			data : {
				seriesId:id
			},
			success : function(data) {
				console.log(data);
				var tr = "";
				for(var i = 0;i<data.length;i++){
					tr +=
						'<tr>'+
							'<td>'+data[i].coursesort+'</td>'+
							'<td>'+data[i].coursedetail+'</td>'+
							'<td>'+data[i].coursehour+'</td>'+
							'<td>'+data[i].courseprice+'</td>'+
							'<td>'+
								'<div class="editImg"><input type="hidden" class="editHidden" value="'+data[i].courseid+'"/></div>'+
								'<div class="delImg"><input type="hidden" class="delHidden" value="'+data[i].courseid+'"/></div></div>'+
							'</td>'+
					     '</tr>';
				}
				$("#"+id+" tbody").html(tr);
				if(data.length==0){
					//设置上暂无课程提示
					$("#"+id+" tbody").html('<tr><td><font class="noCourse">该系列暂无课程</font><td></tr>');
				}
				hideLoading();
			},
			error : function(data) {
				hideLoading();
			}
		});
	}
	
	/**
	 * 添加点击title事件
	 */
	$('.panel-group').on('click', '.panel>.panel-heading', function(){
		$(this).parent().children("div:last-child").collapse('toggle');
		//alert($(this).parent().html());
	});
	
	
	
	
	
	
	/**
	 * 加载页面数据
	 */
	function getPageData(){
		//将折叠框的内容进行填满
		$.ajax({
			type : "POST",
			url : url+"YucaiAdmin/getSeriesAndCourse.action",
			cache : false, // 禁用缓存
			data : {},
			success : function(data) {
				console.log(data);
				/*
				 * 加一个判断：
				 * 在有值的时候正常显示
				 * 在没有值的时候显示该系列暂无数据
				 */
				for(var i = 0 ; i < data.length ; i++){
					//先获取每个系列的每一行
					var course = data[i].tCourse;
					var tr = "";
					for(var j = 0 ;j < course.length;j++){
						tr +='<tr>'+
						'<td>'+course[j].coursesort+'</td>'+
						'<td>'+course[j].coursedetail+'</td>'+
						'<td>'+course[j].coursehour+'</td>'+
						'<td>'+course[j].courseprice+'</td>'+
						'<td>'+
							'<div class="editImg"><input type="hidden" class="editHidden" value="'+course[j].courseid+'"/></div>'+
							'<div class="delImg"><input type="hidden" class="delHidden" value="'+course[j].courseid+'"/></div>'+
						'</td>'+
				     '</tr>';
					}
					//将每个系列的行填入到表格里面
					
					var table = "";
					if(course.length>0){
						table = '<table class="table table-hover">'+
									'<thead>'+
										'<tr>'+
											'<th>班别名称</th>'+
											'<th>课程内容</th>'+
											'<th>课时</th>'+
											'<th>价格描述</th>'+
											'<th>操作</th>'+
										'</tr>'+
									'</thead>'+
									'<tbody>'+
										tr
									'</tbody>'+
							    '</table>';
					}else{
						table=
							'<table class="table table-hover">'+
								'<thead>'+
									'<tr>'+
										'<th>班别名称</th>'+
										'<th>课程内容</th>'+
										'<th>课时</th>'+
										'<th>价格描述</th>'+
										'<th>操作</th>'+
									'</tr>'+
								'</thead>'
									+
								'<tbody>'+
									'<tr><td><font class="noCourse">该系列暂无课程</font><td></tr>'+
								'</tbody>'+
								'</table>';
					}
					 
					
					var series = 
						'<div class="panel panel-default series" id="'+data[i].seriesid+'">'+
							'<div class="panel-heading">'+
								'<div class="addImg" title="添加课程"></div>'+
								'<div class="panel-title">'+
									'<a>'+data[i].seriesname+'</a>'+
								'</div>'+
								'<div class="delSeriesImg" title="删除该系列"></div>'+
							'</div>'+
							'<div class="panel-collapse collapse in">'+
								'<div class="panel-body">'+
									'<div class="table-responsive">'+
										table+
									'</div>'+  	
								'</div>'+
							'</div>'+
						'</div>';
					
					$(".panel-group").append(series);
				}
				//for循环，进行多个折叠的数据填充
				
				//默认展开第一条
				//$("#1").children("div:last-child").collapse('toggle');
				
				//所有条目加载完成
				setTimeout(function(){
					hideLoading();
				},500);	
			},
			error : function(data) {
				console.log(data);
				alert("课程查找失败");
			}
		});
	}
	
	
	/**
	 * 弹出页面样式--编辑
	 */
	function showTips_edit(word){
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">'+word+'</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				    //按钮【确定】的回调
					  //将所有的模态框进行关闭
					  $("#addCourseModal").modal("hide");
					  $("#editCourseModal").modal("hide");
					  layer.close(index);
				  }
				});
			}); 
	}
	
	/**
	 * 弹出页面样式--添加Series
	 */
	function showTips_addSeries(){
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">添加成功!</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				    //按钮【确定】的回调
					  location.reload();
					  layer.close(index);
				  }
				});
			}); 
	}
	
	/**
	 * 弹出页面样式--删除
	 */
	function showTips_del(word){
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">'+word+'</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				      //按钮【确定】的回调
					  layer.close(index);
				  }
				});
			}); 
	}
	
	/**
	 * 检查添加课程模态框内的值是否没有空值
	 */
	function checkAddCourseDataEmpty(){
		if($(".addCoursesort").val()==""){
			return false;
		}
		if($(".addCoursehour").val()==""){
			return false;
		}
		if($(".addCoursedetail").val()==""){
			return false;
		}
		if($(".addCourseprice").val()==""){
			return false;
		}
		return true;
	}
	
	/**
	 * 检查修改模态框内的值是否没有空值
	 */
	function checkEditCourseDataEmpty(){
		if($(".coursesort").val()==""){
			return false;
		}
		if($(".coursehour").val()==""){
			return false;
		}
		if($(".coursedetail").val()==""){
			return false;
		}
		if($(".courseprice").val()==""){
			return false;
		}
		return true;
	}
	
	
	
	/**
	 * 数据为空提示框
	 */
	function showTipsEmpty(){
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">请检查空数据!</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  抖动
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				      //按钮【确定】的回调
					  layer.close(index);
				  }
				});
			}); 
	}
})
















