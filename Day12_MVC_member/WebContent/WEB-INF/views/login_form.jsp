<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인 화면</title>
<style type="text/css">
/* div, form { */
/* 	width: 60%; */
/* 	height: 100px; */
/* 	margin: auto; */
/* 	text-align: center; */
/* } */
/* form { */
/* 	align-content :center; */
/* 	border: dotted; */
/* 	border-color: gray; */
/* } */
/* tr, td { */
/* 	border:none; */
/* } */
</style>
</head>
<body>
	<div>
		<h2>로그인 페이지</h2>
		<form action="login.do" method="POST">
			<table border="1">
				<tr>
					<td>아이디 :</td>
					<td><input type="text" name="id" size="10" required>
						<button>중복확인</button></td>
				</tr>
				<tr>
					<td>비밀번호 :</td>
					<td><input type="password" name="password" size="10" required></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="LOGIN" ></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>