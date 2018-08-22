<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
<title>登录页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/animate.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/bootstrap/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/wow.min.js"></script>
<style type="text/css">
body{ 
	margin:0;
	padding:0;
	background-image:url(../image/bg2.jpg);
	background-repeat: no-repeat; 
	background-size:cover;

}
#warp{
	margin-top: 8%;
}
.form-signin {
  max-width: 330px;
  margin: 0 auto;
}

.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox  input[type="radio"]{
  margin-bottom: 10px;
}
.form-signin .form-signin-heading{
	margin-bottom: 15px;
}

.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;

  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="text"] {
  margin-bottom: 20px;
  
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
 
}
/**/
#msg{
	color:red;
}

/**/
#role{
	margin-left:-20px;
}
#VerCode{
	float:left;
	width:150px;
}
#VerCodeimg{
	float:left;
	margin-left:10px;
	margin-top:-5px
}

</style>
<script type="text/javascript">
new WOW().init();
</script>
</head>
<div  class="container col-md-offset-4 col-md-4 col-sm-offset-3 col-sm-6  wow fadeInRight">
	<div id="warp" class="panel panel-default" style="padding:0px;">
	    <div class="panel-heading hidden-md hidden-sm hidden-xs ">登陆界面</div>
	    <div class="panel-body">
	           <form class="form-signin  row" action=".action" method="post">
		        <h2 class="form-signin-heading">新闻登录</h2>
		        
		        <label for="inputEmail" class="sr-only">Email address</label>
		        <input type="text" name="adminname" id="adminName" class="form-control" placeholder="请填写用户名" required autofocus>
		       
		        <label for="inputPassword" class="sr-only">Password</label>
		        <input type="password" name="password" id="password" class="form-control" placeholder="请填写密码" required>
		        
		        <%-- <div class="checkbox">
		        <label>
		            <input id="role" type="radio" id="role"  name="role" value="0" checked="checked"> 系统管理员
		          </label>
		          <label>
		            <input id="role" type="radio" id="role"  name="role" value="1"> 宿舍管理员
		          </label>
		          <label>
		            <input id="role" type="radio" id="role"  name="role" value="2"> 学生
		          </label>
		          <br>
		          <label>
		            <input id="remember-me" type="checkbox" value="remember-me"> 记住密码
		          </label>
		          <label id="msg"><%=session.getAttribute("LoginStaus") %></label>
		          
		          
		        </div> --%>
		        <!-- <div class="form-group row" style="padding-left:15px;">
				    <input type="text" id="VerCode" class="form-control" placeholder="请填写验证码" required/>
				    <img id="VerCodeimg" alt="" src="../style/image/code.png" height="50px" width="90px">
				</div> -->
				
	
		        
		        <button class="btn btn-lg btn-primary  btn-block btn-info" type="reset">重置</button>
		        <button id="btnlogin" class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		      </form>
	      </div>
	</div>
</div>
</body>
</html>