<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="main">
		<textarea id="editor" name="content" style="width:700px;height:300px;"></textarea>
	</div>
	
	
	
	
	<button value="get" class="get">get</button>
	<div class="show"></div>
</body>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script charset="utf-8" src="${pageContext.request.contextPath}/plugins/kindeditor/kindeditor-all.js"></script>
<script charset="utf-8" src="${pageContext.request.contextPath}/plugins/kindeditor/lang/zh-CN.js"></script>
<script>
	var options = {
	        //cssPath : '/css/index.css',
	        filterMode : true,
	        items:['undo', 'redo', '|', 'preview', 'template',
	               'plainpaste', 'wordpaste', '|', 'justifyleft', 'justifycenter', 'justifyright',
	               'justifyfull', 'insertorderedlist', 'insertunorderedlist', 'indent', 'outdent', 'subscript',
	               'superscript',  'quickformat', 'selectall', '|', 'fullscreen', '/',
	               'formatblock', 'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold',
	               'italic', 'underline', 'strikethrough', 'lineheight', 'removeformat', '|', 'image',
	                'media', 'insertfile', 'table', 'emoticons',
	               'link', 'unlink'],
	        uploadJson : 'file_upload.action',
			fileManagerJson : 'file_upload.action',
	};
	KindEditor.ready(function(K) {
		var editor = K.create('#editor', options);
		$(".get").click(function(){
			// 取得HTML内容
			html = editor.html();

			console.log(html);
			$(".show").html(html)
		})
	});
	
</script>
</html>
<link href="${pageContext.request.contextPath}/build/css/news/newsRelease.css" rel="stylesheet"/>
