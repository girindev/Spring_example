<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>마이 페이지</title>
</head>
<body>
	<h2>마이 페이지</h2>
	<table border="1">
		<tr>
			<td>아이디 :</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td>Email :</td>
			<td>${member.email}</td>
		</tr>
		<tr>
			<td>Phone :</td>
			<td>${member.phone}</td>
		</tr>
	</table>
	<hr>
	<a href="logout.do">[로그아웃]</a>
	<a href="board.do">[게시판]</a>
</body>
</html>