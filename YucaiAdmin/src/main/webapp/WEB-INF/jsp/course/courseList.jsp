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
<title>课程列表</title>
</head>
<body>
	<!-- loading 等待动画 -->
	<div class="spinner" style="visibility:visible">
      <div class="double-bounce1"></div>
      <div class="double-bounce2"></div>
    </div>
    <!-- 右悬浮 添加新的系列  -->
	<div class="addSeriesPanel" title="添加新的系列"></div>
    <div class="main">
		<div class="panel-group" id="accordion">
			<!-- 系列 -->
		</div>
	</div>
	
	<!-- 模态框（Modal） 添加课程   -->
	<div class="modal fade" id="addCourseModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" 
							aria-hidden="true">×
					</button>
					<h4 class="modal-title" id="myModalLabel">
						添加<font style="color:#FF5722" class="modelWord">button</font>下的课程
					</h4>
				</div>
				<div class="modal-body addCourseBody">
					<div class="container">
						<form id="addCourseForm">
						   
						   <input type="hidden" class="seriesid" name="seriesid"/>
						   
						   <!-- 课程  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>班别名称:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<input type="text" class="form-control inputText addCoursesort"  placeholder="请输入班别名称" name="coursesort">
						      </div>    
						   </div>	
						   
						   <!-- 课时  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>课时:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<input type="text" class="form-control inputText addCoursehour"  placeholder="请输入课时" name="coursehour">
						      </div>    
						   </div>	 
						   
						   <!-- 课程内容  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>课程内容:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<textarea class="form-control inputText addCoursedetail" rows="3" placeholder="请输入课程内容" name="coursedetail"></textarea>
						      </div>    
						   </div>		
						   
						   <!-- 价格描述  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>价格描述:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<textarea class="form-control inputText addCourseprice" rows="3" placeholder="请输入价格描述" name="courseprice"></textarea>
						      </div>    
						   </div>	
						   
						   
						    <div class="row editModalButton">
							      <div class="col-sm-6">
							        <button type="button" class="btn btn-info addCourseClearBtn">清空内容</button>
							      </div> 
							      <div class="col-sm-6">
							        <button type="button" class="btn  addCourseSaveBtn">确认添加</button>
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
	
	<!-- 模态框（Modal） 修改课程    -->
	<div class="modal fade" id="editCourseModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" 
							aria-hidden="true">×
					</button>
					<h4 class="modal-title" id="myModalLabel">
						修改<font style="color:#FF5722" class="editModelWord">button</font>课程的数据
					</h4>
				</div>
				<div class="modal-body editCourseBody">
					<div class="container">
						
						<form id="editCourseForm">
						   <input type="hidden" class="editCourseid" name="courseid"/>
						   <input type="hidden" class="editSeriesid" name="seriesid"/>
						   <!-- 课程  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>班别名称:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<input type="text" class="form-control inputText coursesort"  placeholder="请输入班别名称" name="coursesort">
						      </div>    
						   </div>	
						   
						   <!-- 课时  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>课时:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<input type="text" class="form-control inputText coursehour"  placeholder="请输入课时" name="coursehour">
						      </div>    
						   </div>	 
						   
						   <!-- 课程内容  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>课程内容:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<textarea class="form-control inputText coursedetail" rows="3" placeholder="请输入课程内容" name="coursedetail"></textarea>
						      </div>    
						   </div>		
						   
						   <!-- 价格描述  -->
						   <div class="row">
						      <div class="col-sm-1"></div>
						   	  <div class="col-sm-2 inputTitle">
						        <div class="inputTitle">
						            <span>价格描述:&nbsp; </span>
						        </div>
						      </div>   
						      <div class="col-sm-9">
						      	<textarea class="form-control inputText courseprice" rows="3" placeholder="请输入价格描述" name="courseprice"></textarea>
						      </div>    
						   </div>	
						   
						   
						    <div class="row editModalButton">
							      <div class="col-sm-6">
							        <button type="button" class="btn btn-info editCourseClearBtn">清空内容</button>
							      </div> 
							      <div class="col-sm-6">
							        <button type="button" class="btn  editCourseSaveBtn">保存修改</button>
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
	
	
	<!-- 添加系列模态框（Modal）添加系列   -->
	<div class="modal fade" id="addSeriesModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" 
							aria-hidden="true">×
					</button>
					<h4 class="modal-title" id="myModalLabel">
						添加课程系列
					</h4>
				</div>
				<div class="modal-body previewBody">
					<!-- 课程内容  -->
					<form id="addSeriesForm">
					   <div class="row">
					      <div class="col-sm-1"></div>
					   	  <div class="col-sm-3 inputTitle">
					        <div class="inputTitle">
					            <span>系列名称:&nbsp; </span>
					        </div>
					      </div>   
					      <div class="col-sm-8">
					      	<input type="text" class="form-control inputText addSeriesName"  placeholder="请输入系列名称" name="seriesname">
					      </div>    
					   </div>	
				   </form>
				</div>
				<div class="modal-footer">
				    <button type="button" class="btn addSeriesBtn">添加系列</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
</body>
</html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/build/css/course/courseList.css" media="all">
<script src="${pageContext.request.contextPath}/build/js/course/courseList.js"></script>