<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
<title>添加页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/animate.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/bootstrap/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/bootstrap.min.js"></script>
<style type="text/css">
body{
	margin: 0;
	padding: 0;
}
.container {
}
.row {
    margin-right: 0px;
    margin-left: 0px;
}
*{
   margin: 0;
   padding: 0;
}
.warp {
  margin-top:50px;
  width: 100%;
  display: flex;
border:0px solid red;
}

.warp .menu {
 flex:2;
 border-radius: 3px;
 min-width:200px;
 height: 600px;
 border:0px solid red;
 background-color: rgb(205,205,205);
}
.menu li:HOVER{
}
.warp .content {
  flex:10;
  height: 600px;

}
.content .wcom_text{
position:relative;
border:0px solid red;
width:50%;
top:30%;
font-size: 4vw;
margin: 0 auto;
}
 
</style>
</head>
<body>
<jsp:include   page="Nav.html" />
<div class="warp">
		<div class="menu" >
			<jsp:include  page="menu.html"/>
		</div>
		<div class="content container col-md-6 wow fadeInRight" style="padding:20px;">
			<div id="warp" class="panel panel-default" style="padding:0px;">
		    <div class="panel-heading">添加新闻</div>
		    <div class="panel-body row">
	           <form class="form-signin  col-sm-12 row" id="formcp" action="addnews.action" method="post">
					<input type="hidden" id="DMId" name="DMId" value="<%=session.getAttribute("DMId") %>" /> 
		           	<label for="inputEmail" class="">*标题</label>
			        <input type="text" name="newstitle" id="newsTitle" class="form-control" placeholder="请填写标题" required autofocus>
			       
			       <label for="inputPassword" class="">*导读</label>
			        <input type="text" name="newsguide" id="newsGuide" class="form-control" placeholder="请填写您的名字" required>
			       
			        <label for="inputPassword" class="">*作者</label>
			        <input type="text" name="newsauthor" id="newsAuthor" class="form-control" placeholder="请填写您的名字" required>
			        
			        <label for="inputPassword" class="">*来源</label>
			        <input type="text" name="newssource" id="newsSource" class="form-control" placeholder="请填写来源" required>
			        
			        
			        <label for="inputPassword" class="">*创建日期</label>
			        <input type="text" name="createdate" id="createdate" value=''  class="form-control" placeholder="请填写时间" required />
		           	
		           	<label for="inputEmail" class="">*请选择地区</label>
		           	
		           	<select name="areano" class="form-control">
		           		<option value="11">--请选择--</option>
		           		<c:forEach items="${arealist}" var="area">
		           			<option value="${area.areano }">${area.areaname }</option>
		           		</c:forEach>
		           	</select>
			        
			       
			        <label for="inputPassword" class="">*请选择银行</label>
			        <select name="bankno" class="form-control">
		           		<option>--请选择--</option>
		           		<c:forEach items="${banklist}" var="bank">
		           			<option value="${bank.bankno }">${bank.bankname }</option>
		           		</c:forEach>
		           	</select>
			        
			        <label for="inputPassword" class="">*内容</label>
			        <textarea name="newscontent" rows="" cols="" class="form-control" style="height: 500px;"></textarea> 
			        <div class="checkbox">
			          <label id="msg"><%=request.getAttribute("rs") %></label>         
			        </div>
					<button class="btn btn-lg btn-primary  btn-block btn-info" onclick="testjson()" type="button">test</button>
			        <button class="btn btn-lg btn-primary  btn-block btn-info" type="reset">重置</button>
			        <button id="btneditpwd" class="btn btn-lg btn-primary btn-block" onclick="submit()" type="button">发布文章</button>
		        	
	           </form>
		    </div>
		</div>
</div>
</body>
<script type="text/javascript">
new WOW().init();
function testjson(){
	$.ajax({
		type: "post",      
		url: "testjson.action", 
		dataType : "json",
		success : function(Result)
		{
			//alert("ok");
			//alert(Result.data.length);
			alert(Result[0][0].areaname);
			alert(Result[1][0].bankname);
			
		},
		error : function()
		{
			 alert("数据传输失败!");
		}
	});
}
</script>

</html>