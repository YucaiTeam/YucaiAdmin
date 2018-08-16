<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/WebContent/css/hotspots.css" />
<script src="http://code.jquery.com/jquery-latest.js"></script>
<meta charset="UTF-8">
<title>时政热点</title>
</head>
<body>
	<input type="text" value="${user}">
	<div class="board">
	  <div class="area_nav">
	      <span id="address">您当前所在位置: 
	        <a>首页</a>
	        <a id="a_area">>&nbsp;全部地区时政热点</a>
	        <a id="a_bank"></a>
	      </span>
	      <hr/>
	  </div>
	  <div class="area">
	    <span>地区</span>
	    <ul id="area">
	    	<li class="li_first" value="0"> 全部</li>
	      	<li value="1">山东</li>
	    </ul>

	  </div>
	  <div class="bank">
	    <span>银行</span>
	      <ul>
	        <li class="li_first" value="0">全部</li>
	        <li value="1">人民银行</li>
	        <li value="2">工商银行</li>
	        <li value="3">建设银行</li>
	        <li value="4">中国银行</li>
	        <li value="5">交通银行</li>
	        <li value="6">农业银行</li>
	      </ul>
	  </div>
	  <!-- 新闻框 -->
	  <div  class="hot_board">
	
	    <div class="hot_board_nar">
	      <ul>
	        <li>时政热点</li>
	      </ul>
	    </div>
	    <div class="hot_board_son">
	      <h3 align="center">浦发银行推出业内首个API Bank无界开放银行 重构银行业务和服务模式</h3>
	      <p class="hot_board_son_text">
	        浦发银行在京正式推出业内首个API Bank无界开放银行，这是该行建设一流数字生态银行的一项重大工程。
	        浦发银行API Bank无界开放银行将通过API架构驱动，将场景金融融入互联网生态，围绕客户需求和体验，形成即想即用的跨界服务，塑造全
	        新银行业务模式。
	      </p>
	    </div>
	    <div class="hot_board_son">
	      <h3 align="center">2019年秋季银行校园招聘准考证打印入口汇总</h3>
	      <p class="hot_board_son_text">
	        2019年秋季银行校园招聘准考证打印入口暂未开通，
	        请考生及时关注，华图金领人小编将会第一时间更新考试信息，更多银行招聘信息请关注华图金领人。。</p>
	    </div>
	  </div>
	</div>
	<script>
	  $(document).ready(function(){
	    $(".area li").click(function(){
	      $(".area li").removeClass("li_first");
	      $(this).addClass("li_first");
	      var value = $(this).val();
	      if(value == "0"){
	        $("#a_area").text('> 全部地区时政热点');
	      }
	      if(value == "1"){
	        $("#a_area").text('> 山东地区时政热点');
	      }
	    });
	  });
	  $(document).ready(function(){
	    $(".bank li").click(function(){
	      $(".bank li").removeClass("li_first");
	      $(this).addClass("li_first");
	      var value_b = $(this).val();
	      if(value_b == "0"){
	        $("#a_bank").text("");
	      }
	      if(value_b == "1"){
	        $("#a_bank").text('> 人民银行');
	      }
	    });
	  });
	  $(document).ready(function(){
	    $(".bank li").click(function(){
	      $(".bank li").removeClass("li_first");
	      $(this).addClass("li_first");
	      var value_b = $(this).val();
	      if(value_b == "0"){
	        $("#a_bank").text("");
	      }
	      if(value_b == "1"){
	        $("#a_bank").text('> 人民银行');
	      }
	    });
	  });
	</script>

</body>
</html>