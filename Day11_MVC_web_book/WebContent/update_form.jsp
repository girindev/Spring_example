<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>å ���� ȭ��</title>
</head>
<body>
	<h2>������ ������ �Է��ϼ���.</h2>
	<form action="update.do" method="POST">
		<table border="1">
			<tr>
				<td>å ��ȣ</td>
				<td><input type="text" name="jBookNum" value=${original.jBookNum } readonly="readonly"></td>
			</tr>
			<tr>
				<td>���� : </td>
				<td><input type="text" name="jTitle" value=${original.jTitle }></td>
			</tr>
			<tr>
				<td>���� : </td>
				<td><input type="text" name="jPrice" value=${original.jPrice }></td>
			</tr>
			<tr>
				<td>���ǻ�</td>
				<td><input type="text" name="jPublisher" value=${original.jPublisher } readonly="readonly"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="jWriter" value=${original.jWriter } readonly="readonly"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="�ۼ� �Ϸ�">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>