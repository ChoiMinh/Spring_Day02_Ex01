<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<div class="container">

		<h1>멤버 상세 정보</h1>
		<table  class="table table-bordered">
			
			<tr>
				<th>PASSWORD</th><td>${member.password }</td>
			</tr>
			<tr>
				<th>NAME</th><td>${member.name }</td>
			</tr>
			<tr>
				<th>ROLE</th><td>${member.role }</td>
			</tr>
		</table>
		<a href="edit.do?id=${member.id }">수정</a> |
		<a href="delete.do?id=${member.id }">삭제</a> |
		<a href="list.do">목록</a>
	</div>
</body>
</html>