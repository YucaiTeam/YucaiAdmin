<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻列表</title>
    <script src="${pageContext.request.contextPath}/build/js/url.js"></script>
	<link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/plugins/bootstrap/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/plugins/DataTables/dataTables.bootstrap.css" media="screen">
    <script type="text/javascript" language="javascript"src="${pageContext.request.contextPath}/plugins/DataTables/jquery.min.js" charset="UTF-8"></script>
    <script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/plugins/bootstrap/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" language="javascript"src="${pageContext.request.contextPath}/plugins/DataTables/jquery.dataTables.min.js"></script>
    <script type="text/javascript" language="javascript"src="${pageContext.request.contextPath}/plugins/DataTables/dataTables.bootstrap.js"></script>
    <link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/plugins/DataTables/material.min.css">
    <link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/plugins/DataTables/dataTables.material.min.css">
    <script src="${pageContext.request.contextPath}/plugins/DataTables/dataTables.material.min.js"></script>
    <script src="${pageContext.request.contextPath}/plugins/layui/layui.js"></script>
	<link href="https://cdn.bootcss.com/bootstrap-select/2.0.0-beta1/css/bootstrap-select.min.css" rel="stylesheet">
	<script src="https://cdn.bootcss.com/bootstrap-select/2.0.0-beta1/js/bootstrap-select.min.js"></script>
	<!-- datetimepicker -->
	<script src="${pageContext.request.contextPath}/plugins/datetimepicker/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
	<script src="${pageContext.request.contextPath}/plugins/datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/datetimepicker/css/bootstrap-datetimepicker.css" media="screen">
	
	<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/build/js/news/newsList.js"></script>
	<!-- loading -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/build/css/loading.css" media="all">
</head>
<body>
	<!-- loading -->
	<div class="spinner" style="visibility:visible">
      <div class="double-bounce1"></div>
      <div class="double-bounce2"></div>
    </div>
	<div class="tableShow" style="opacity:0;"></div>
	<form id="search">
		<input type="hidden" value="" class="startindex" name="startindex">
		<input type="hidden" value="" class="pagesize" name="pagesize">
		<input type="hidden" value="" class="draw" name="draw">
		<input type="hidden" value="" class="textcontent" name="textcontent">
		<input type="hidden" value="" class="startdate" name="startDate">
		<input type="hidden" value="" class="enddate" name="endDate">
		<input type="hidden" value="false" class="isSearching" name="isSearching">
	</form>
	
	<table id="table" class="mdl-data-table table table-striped table-bordered dataTable no-footer animated">
		<thead>
			<tr>
				<th>序号</th>
		        <th>标题</th>
		        <th>来源</th>
		        <th>作者</th>
		        <th>修改时间</th>
		        <th>地区</th>
		        <th>银行</th>
		        <th>操作</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
			
				
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" 
							aria-hidden="true">×
					</button>
					<h5 class="modal-title" id="myModalLabel">
						新闻编辑
					</h5>
				</div>
				<div class="modal-body editBody">
				
					<div class="main" style="opacity:1">
						<form id="editForm">
							<!-- newsid -->
							<input type="hidden" class="newsid" name="newsid"/>
						    <input type="hidden" name="newscontent" id="hiddenArea"/>
						    
						    
							<!-- 标题框 -->
							<div class="item">
								<input type="text" class="form-control newsTitle"  placeholder="请输入标题" name="newstitle">
							</div>
							
							<!-- 文本编辑器 -->
							<div class="item">
								<textarea id="editor" name="content"></textarea>
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
							   
							   <div class="row editModelButton">
							      <div class="col-sm-6">
							        <button type="button" class="btn btn-info clearBtn">清空内容</button>
							      </div> 
							      <div class="col-sm-6">
							        <button type="button" class="btn  saveBtn">保存修改</button>
							      </div>     
							   </div>		   
							</div>
					    </form>
					</div>
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
</html>
    <script charset="utf-8" src="${pageContext.request.contextPath}/plugins/kindeditor/kindeditor-all.js"></script>
	<script charset="utf-8" src="${pageContext.request.contextPath}/plugins/kindeditor/lang/zh-CN.js"></script>
	<script src="${pageContext.request.contextPath}/build/js/kindeditor.js"></script>


<script type="text/javascript">
KindEditor.ready(function(K) {
	var editor = K.create('#editor', options);
	editor.html("请输入内容");
	
	/* 修改模态框内的按钮动作 */
	$(".clearBtn").click(function(){
		clearPage();
	})
	$(".saveBtn").click(function(){
		if(checkData()){
			saveEditAJAX();
		}else{
			layui.use('layer', function(){
				  var layer = layui.layer;
				  layer.open({
					  content: '<div style="text-align:center">请检查非空数据！</div>'
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
		
	})
	
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
	
	function saveEditAJAX(){
		$("#hiddenArea").val(editor.html());
		var form = $("#editForm");
		//先请求地区，将select填充
		$.ajax({
			url : url+"YucaiAdmin/updatenews.action",
			type : 'POST',
			data : form.serialize(),
			dataType : 'JSON',
			success : function(data) {
				saveEnd(true);
				var table = $('#table').DataTable();
				table.draw(false);
			},
			error : function(data) {
				saveEnd(false);
			}
		});
	}
	
	function saveEnd(flag){
		var word = "";
		if(flag){
			word = "更新成功！";
		}else{
			word = "更新失败";
		}
		
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
					$('#editModal').modal('hide');
				  }
				  ,btn2: function(index, layero){
				    //按钮【取消】的回调
				    layer.close(index);
				    $('#editModal').modal('hide');
				    //return false 开启该代码可禁止点击该按钮关闭
				  }
				  ,cancel: function(){ 
				    //右上角关闭回调
				    
				    //return false 开启该代码可禁止点击该按钮关闭
				  }
				});
			}); 
	}

	function clearPage(){
		$(".newsTitle").val("");
		editor.html("请输入新闻内容");
		$(".newsGuid").val("");
		$(".selectArea").val("area");
		$(".selectBank").attr("disabled","disabled");
		$(".source").val("");
		$(".author").val("");
	}
	/*
	* 编辑按钮点击
	*/
	$('#table').on("click", ".btn-edit", function() {
		var _table = $().getTable_();
		var item = _table.row($(this).closest('tr')).data();
		//获取到item内的id即可
		console.log(item);
		//使用地址传参--进入之后使用ajax进行获取值
		//跳转
		//window.open("newsEdit.action","_blank");
		$("#editModal").modal('show');
		editAJAX(item.newsid);
	});
	
	/*
	* 编辑AJAX
	*/
	function editAJAX(newsid){
		//先请求地区，将select填充
		$.ajax({
			url : url+"YucaiAdmin/getareaName.action",
			type : 'POST',
			data : {},
			dataType : 'JSON',
			success : function(data) {
				var html = '<option class="selectItem" value="area" selected>--地区--</option>';
				for(var i=0;i<data.length;i++){
					html += '<option class="selectItem" value="'+data[i].areano +'">'+data[i].areaname +'</option>';
				}
				
				$(".selectArea").html(html);
			},
		});
		
		//按新闻id请求新闻
		$.ajax({
			type : "POST",
			url : url+"YucaiAdmin/showupdatenews.action",
			cache : false, // 禁用缓存
			data : {
				"newsid":newsid
			},
			success : function(data) {
				//进行数据的回显
				console.log(data.newsShow);
				var news = data.newsShow;
				$(".newsTitle").val(news.newstitle);
				editor.html(news.newscontent);
				
				$(".newsGuid").val(news.newsguide);
				
				$(".source").val(news.newssource);
				$(".author").val(news.newsauthor);
				$(".newsid").val(news.newsid);
				
				
				//将银行select设置成可见
				$(".selectBank").removeAttr("disabled");
				//请求地区下的银行
				$.ajax({
					url : url+"YucaiAdmin/getbankName.action",
					type : 'POST',
					data : {
						areano:news.areano
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
						//填充地区下的银行的select
						$(".selectBank").html(html);

						//将两个值进行显示
						$(".selectArea").val(news.areano);
						$(".selectBank").val(news.bankno);
					},
				});
				
			},
			error : function(data) {
				console.log(data);
			}
		});
	}
	
	//提示框是否显示
    $(".selectArea").bind("change",function(){
       var area = $(this).val();
       console.log(area);
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
	
});
</script>
<link href="${pageContext.request.contextPath}/build/css/news/newsRelease.css" rel="stylesheet"/>
<link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/build/css/news/newsList.css">