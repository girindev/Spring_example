<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>책 추가</title>
</head>
<body>
	<h2>책 정보를 입력하세요.</h2>
	<form action="write.do" method="POST">
		<table border="1">
			<tr>
				<td>제목 :</td>
				<td><input type="text" name="jTitle" size="20"></td>
			</tr>
			<tr>
				<td>출판사 :</td>
				<td><input type="text" name="jPublisher" size="20"></td>
			</tr>
			<tr>
				<td>가격 :</td>
				<td><input type="text" name="jPrice" size="20"></td>
			</tr>
			<tr>
				<td>저자 :</td>
				<td><input type="text" name="jWriter" size="20"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="작성완료" /></td>
			</tr>
		</table>
	</form>
</body>
</html>