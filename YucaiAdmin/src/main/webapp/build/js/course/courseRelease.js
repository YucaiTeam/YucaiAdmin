$(function(){
	//添加系列按钮点击
	$(".addImage").click(function(){
		$("#addSeriesModal").modal("show");
	});
	
	getSeriesData();
	//请求ajax，获取系列下拉列表的值
	function getSeriesData(){
		$.ajax({
			type : "POST",
			url : url+"YucaiAdmin/findallseries.action",
			cache : false, // 禁用缓存
			data : {},
			success : function(data) {
				console.log(data);
				//将信息添加到select中
				var html = '<option class="selectItem" value="choose" selected>--请选择--</option>';
				for(var i=0;i<data.length;i++){
					html +='<option class="selectItem" value="'+data[i].seriesid+'">'+data[i].seriesname+'</option>';
				}
				
				$(".selectSeries").html(html);
			},
			error : function(data) {
				console.log(data);
			}
		});
	}
	
	$(".submitBtn").click(function(){
		if(checkCourseData()){
			var form = $("#courseForm");
			$.ajax({
				type : "POST",
				url : url+"YucaiAdmin/addCourse.action",
				cache : false, // 禁用缓存
				data : form.serialize(),
				success : function(data) {
					if(data=="true"){
						//添加成功
						showTips("添加成功");
						//进行数据清除
						clearPageData();
					}else{
						//添加失败
						showTips("添加失败");
					}
				},
				error : function(data) {
					//添加失败
					showTips("添加失败");
				}
			});
		}else{
			showEmptyTips();
		}
	})
	
	$(".addSeriesBtn").click(function(){
		if(checkSeriesData()){
			var form = $("#seriesForm");
			$.ajax({
				type : "POST",
				url : url+"YucaiAdmin/addSeries.action",
				cache : false, // 禁用缓存
				data : form.serialize(),
				success : function(data) {
					console.log(data);
					if(data=="true"){
						//添加成功
						showTips("添加成功");
						
						//刷新select
						getSeriesData();
						//清除数据
						$(".seriesname").val("");
						
					}else{
						//添加失败
						showTips("添加失败");
					}
				},
				error : function(data) {
					console.log(data);
					//添加失败
					showTips("添加失败");
				}
			});
		}else{
			showEmptyTips();
		}
		
	})
	
	function clearData(){
		$(".selectSeries").val("choose");
		$(".seriesname").val("");
		$(".inputText").val("");
	}
	
	function showTips(word){
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
					  $("#addSeriesModal").modal("hide");
					  layer.close(index);
				  }
				});
			}); 
	}
	
	function showEmptyTips(){
		//显示弹出框  提示信息
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  content: '<div style="text-align:center">请检查空数据！</div>'
				  ,btn: ['确定', '取消']
			      //按钮位置
			  	  ,btnAlign: 'c'
			  	  //关闭按钮格式
			  	  ,closeBtn: 1
			  	  //打开动画  淡入
			  	  ,anim: 5
			  	  //关闭动画
			  	  ,isOutAnim: true
			  	  ,move: '.layui-layer-title'
				  ,yes: function(index, layero){
				    //按钮【确定】的回调
					  //将所有的模态框进行关闭
					  layer.close(index);
				  }
				});
			}); 
	}
	
	/**
	 * 清除页面内的数据
	 */
	function clearPageData(){
		$(".selectSeries").val("choose");
		$(".coursesort").val("");
		$(".coursehour").val("");
		$(".coursedetail").val("");
		$(".courseprice").val("");
	}
	
	
	/**
	 * 检查添加课程的数据为空
	 */
	function checkCourseData(){
		if($(".selectSeries").val()=="choose"){
			return false;
		}
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
	 * 检查添加系列的数据为空
	 */
	function checkSeriesData(){
		if($(".seriesname").val()==""){
			return false;
		}
		return true;	
	}
})

















