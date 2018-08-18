<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/bootstrap.min.js"></script>
<title>列表</title>
</head>
<body>
<div class="table-responsive">
	<table class="table table-bordered table-striped table-hover " border="1" style="text-align: center; border:1px; table-layout:fixed" >
	<!-- 表头 -->
	<thead>
		<tr>
			<th style="text-align: center;">No</th>
	        <th style="text-align: center;">Id</th>
			<th style="text-align: center;">标题</th>
			<th style="text-align: center;">导读</th>
			<th style="text-align: center;">来源</th>
			<th style="text-align: center;">作者</th>
			<th style="text-align: center;">内容</th>
			<th style="text-align: center;">创建日期</th>
			<th style="text-align: center;">修改日期</th>
			<th style="text-align: center;">地区编号</th>
			<th style="text-align: center;">银行编号</th>
			<th style="text-align: center;">测试字段</th>
			<th style="text-align: center;">测试字段</th>
			<th style="text-align: center;">修改</th>
			<th style="text-align: center;">删除</th>
	    </tr>
	</thead>
	<!-- 表格数据 -->
	<tbody>
		<c:if test="${newsList.size()==null||newsList.size()==0}">
		<tr>
			<td colspan="12" style="text-align: center;"><span
		style="display: block; margin: 30px 0; color: red; font-weight: bold;">查询不到该访问信息</span>
			</td>
		</tr>
		</c:if>
		<c:forEach items="${newsList}" var="news" varStatus="status">
			<tr>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${status.count}</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.newsid}</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.newstitle}</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.newsguide }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.newssource }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.newsauthor }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.newscontent }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">
					<fmt:formatDate value="${news.createdate }" type="date" pattern="yyyy-MM-dd"/>
				</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">
					<fmt:formatDate value="${news.editdate }" type="date" pattern="yyyy-MM-dd"/>
				</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.areaname }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.bankname }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.standbyField01 }</td>
				<td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${news.standbyField02 }</td>
				
				<td> <button type="button" id="btn_edit" onclick="editFun(this,${news.newsid})" class="btn btn-info btn-xs" data-toggle="modal" data-target="#RCGetDialog">修改</button></td>
				<td> <button type="button" id="btn_del" onclick="deleteFun(this,${rc.recordId },${rc.studentNumber })" class="btn btn-danger btn-xs" >删除</button></td>
			</tr>
		</c:forEach>			
	    </tbody>
	</table>
</div>

<script type="text/javascript">
function editFun(e,newsid){
	alert("2");
	location.href="index.action?id="+newsid;
}
</script>
</body>
</html>