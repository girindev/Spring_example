<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α��� ȭ��</title>
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
		<h2>�α��� ������</h2>
		<form action="login.do" method="POST">
			<table border="1">
				<tr>
					<td>���̵� :</td>
					<td><input type="text" name="id" size="10" required>
						<button>�ߺ�Ȯ��</button></td>
				</tr>
				<tr>
					<td>��й�ȣ :</td>
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