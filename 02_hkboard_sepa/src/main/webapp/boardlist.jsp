<%@page import="com.hk.dtos.HkDto"%>
<%@page import="java.util.List"%>
<%@page import="com.hk.daos.HkDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<%response.setContentType("text/html; charset=UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글목록 조회</title>
<style type="text/css">
th {
	background-color: pink;
	color: white;
}

tr:nth-child(odd)>td {
	background-color: orange;
}
</style>
</head>
<%
HkDao dao = new HkDao();
List<HkDto> lists = dao.getAllList();
%>
<body>
	<h1>게시판</h1>
	<h2>글목록</h2>
	<table border="1">
		<col width="50px">
		<col width="100px">
		<col width="300px">
		<col width="200px">
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<%
		for (HkDto dto : lists) {
		%>
		<tr>
			<td><%=dto.getSeq()%></td>
			<td><%=dto.getId()%></td>
			<td><%=dto.getTitle()%></td>
			<td><%=dto.getRegDate()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>