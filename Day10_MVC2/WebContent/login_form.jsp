<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>이곳은 로그인 화면입니다.</h2>
	<form action="login.do" method="post">
		<table border="1">
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>비 번 :</td>
				<td><input type="password" name="userPW"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="LOGIN"></td>
			</tr>
		</table>
	</form>
</body>
</html>