<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입 화면</title>
<style type="text/css">
/* div, form { */
/* 	width: 60%; */
/* 	height: 100px; */
/* 	margin: auto; */
/* 	text-align: center; */
/* } */
</style>
</head>
<body>
	<div>
		<h2>회원 가입 입력화면</h2>
		<form action="join.do" method="POST">
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
					<td>email :</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>핸드폰 :</td>
					<td><input type="tel" name="phone" placeholder="'-'없이 입력하세요"></td>
				</tr>
				<tr>
					<td><input type="submit" value="작성완료"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>