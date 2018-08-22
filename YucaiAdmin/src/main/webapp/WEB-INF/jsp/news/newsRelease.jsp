<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="${pageContext.request.contextPath}/build/js/url.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/layui/layui.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/build/css/loading.css" media="all">
	<title>新闻发布</title>
</head>
<body>
	<div class="spinner">
      <div class="double-bounce1"></div>
      <div class="double-bounce2"></div>
    </div>
	<div class="preview"></div>
	<div class="main" style="opacity:0">
		<form id="form">
		<input type="hidden" name="newscontent" id="hiddenArea"/>
			<!-- 标题框 -->
			<div class="item">
				<input type="text" name="newstitle" class="form-control newsTitle"  placeholder="请输入标题">
			</div>
			
			<!-- 文本编辑器 -->
			<div class="item">
				<textarea id="editor"></textarea>
			</div>
			
			<div class="item">
				<textarea class="form-control newsGuid" rows="3" placeholder="请输入新闻导读" name="newsguide"></textarea>
			</div>
			
			<div class="container">
			   <div class="row">
			      <div class="col-sm-6">
			        <div class="selectTitle">
			            <span>地区:&nbsp; </span>
			        </div>
			      	<select class="form-control selectArea" name="areano">
			      		<option class="selectItem" value="area" selected>--地区--</option>
					</select >
			      </div>
			      <div class="col-sm-6">
			      	<div class="selectTitle">
			            <span>银行:&nbsp; </span>
			        </div>
			      	<select  class="form-control selectBank" disabled="disabled" name="bankno">
						<option class="selectItem"></option>
					</select>
			      </div>      
			   </div>
			   
			   
			   <div class="row">
			      <div class="col-sm-6">
			        <div class="selectTitle">
			            <span>来源:&nbsp; </span>
			        </div>
			      	
			      	<input type="text" class="form-control source"  placeholder="请输入新闻来源" name="newssource">
			      </div>
			      <div class="col-sm-6">
			      	<div class="selectTitle">
			            <span>作者:&nbsp; </span>
			        </div>
			      	<input type="text" class="form-control author"  placeholder="请输入作者" name="newsauthor">
			      </div>      
			   </div>	
			   
			   <div class="row">
			      <div class="col-sm-6">
			        <button type="button" class="btn btn-info clearBtn">清除内容</button>
			      </div>
			      <div class="col-sm-6">
			        <button type="button" class="btn submitBtn">发布新闻</button>
			      	<!-- <button type="button" class="btn btn-info submitBtn">发布新闻</button> -->
			      </div>      
			   </div>		   
			</div>
	    </form>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="previewModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" 
							aria-hidden="true">×
					</button>
					<h4 class="modal-title" id="myModalLabel">
						新闻内容预览
					</h4>
				</div>
				<div class="modal-body previewBody">
					
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" 
							data-dismiss="modal">关闭
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
</body>
<script charset="utf-8" src="${pageContext.request.contextPath}/plugins/kindeditor/kindeditor-all.js"></script>
<script charset="utf-8" src="${pageContext.request.contextPath}/plugins/kindeditor/lang/zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/build/js/kindeditor.js"></script>
<script>
	KindEditor.ready(function(K) {
		var editor = K.create('#editor', options);
		editor.html("请输入新闻内容");
		$(".main").css("opacity","1");
		//实现新闻预览
		$(".preview").click(function(){
			var html = editor.html();
			window.parent.previewNews(html);
		});
		
		//提交按钮
		$(".submitBtn").click(function(){
			if(checkData()){
				$(".spinner").css("visibility","visible");
				var form = $("#form");
				$("#hiddenArea").val(editor.html());
				$.ajax({
					url : url+"YucaiAdmin/addnews.action",
					type : 'POST',
					data : form.serialize(),
					success : function(data) {
						showTips(true);
						$(".spinner").css("visibility","hidden");
					},
					error : function(data) {
						showTips(false);
						$(".spinner").css("visibility","hidden");
					}
				});
			}else{
				layui.use('layer', function(){
					  var layer = layui.layer;
					  layer.open({
						  content: '<div style="text-align:center">请检查空数据！</div>'
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
							  layer.close(index);
						  }
						});
					}); 
			}
		});
		//清除按钮
		$(".clearBtn").click(function(){
			clearPage();
		})
		
		function clearPage(){
			$(".newsTitle").val("");
			editor.html("请输入新闻内容");
			$(".newsGuid").val("");
			$(".selectArea").val("area");
			$(".selectBank").val("");
			$(".selectBank").attr("disabled","disabled");
			$(".source").val("");
			$(".author").val("");
		}
		
		//进行页面数据的检验
		function checkData(){
			if($(".newsTitle").val()==""){
				return false;
			}
			if(editor.html()==""){
				return false;
			}
			if($(".newsGuid").val()==""){
				return false;
			}
			if($(".selectArea").val()=="area"){
				return false;
			}
			if($(".selectBank").val()==""){
				return false;
			}
			if($(".source").val()==""){
				return false;
			}
			if($(".author").val()==""){
				return false;
			}
			return true;
		}
		
		function showTips(flag){
			var text;
			if(flag==true){
				text = "该新闻发布成功";
			}else{
				text = "该新闻发布失败";
			}
			//显示弹出框
			layui.use('layer', function(){
				  var layer = layui.layer;
				  layer.open({
					  content: '<div style="text-align:center">'+text+'</div>'
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
						  //调用AJAX进行数据库的删除
						  //根据返回的参数  
						  //true   --删除成功
						  //false  --删除失败
						  //根据删除结果进行弹窗显示
						  
						  //成功--->清除并关闭tips
						  
						  if(flag==true){
							  clearPage();
						  }
						  
						  //失败--->关闭tips
						  
						  layer.close(index);
					  }
					});
				}); 
		}
		
	});
	
	
	
	
	
	
	
	//请求地区，填写地区下拉列表
	$.ajax({
		url : url+"YucaiAdmin/getareaName.action",
		type : 'POST',
		data : {},
		dataType : 'JSON',
		success : function(data) {
			var html = '<option class="selectItem" value="area" selected>--地区--</option>';
			for(var i=0;i<data.length;i++){
				//<option class="selectItem" value="0001">山东</option>
				html += '<option class="selectItem" value="'+data[i].areano +'">'+data[i].areaname +'</option>';
			}
			$(".selectArea").html(html);
		},
	});
	
	//提示框是否显示
    $(".selectArea").bind("change",function(){
       var area = $(this).val();
       if(area!="area"){
    	   $(".selectBank").removeAttr("disabled");
       }else{
    	   $(".selectBank").attr("disabled","disabled"); 
       }
       //alert(area);
       //调用AJAX获取当地银行的列表
       getBankToSelect(area);
    });
	
	function getBankToSelect(area){
		$.ajax({
			url : url+"YucaiAdmin/getbankName.action",
			type : 'POST',
			data : {
				areano:area
			},
			dataType : 'JSON',
			success : function(data) {
				console.log(data);
				//成功,将银行信息放入select列表
				var html = "";
				for(var i=0;i<data.length;i++){
					//<option class="selectItem" value="0001">山东</option>
					html += '<option class="selectItem" value="'+data[i].bankno +'">'+data[i].bankname +'</option>';
				}
				$(".selectBank").html(html);
				
			},
		});
	}
	
	
</script>
</html>
<link href="${pageContext.request.contextPath}/build/css/news/newsRelease.css" rel="stylesheet"/>
