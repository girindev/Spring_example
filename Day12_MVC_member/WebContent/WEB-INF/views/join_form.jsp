<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ������ ȭ��</title>
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
		<h2>ȸ�� ���� �Է�ȭ��</h2>
		<form action="join.do" method="POST">
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
					<td>email :</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>�ڵ��� :</td>
					<td><input type="tel" name="phone" placeholder="'-'���� �Է��ϼ���"></td>
				</tr>
				<tr>
					<td><input type="submit" value="�ۼ��Ϸ�"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>