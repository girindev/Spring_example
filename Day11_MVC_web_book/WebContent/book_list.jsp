<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>책 목록 보여주기 페이지</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>책번호</th>
			<th>제목</th>
			<th>출판사</th>
			<th>가격</th>
			<th>저자</th>
		</tr>
		<c:forEach items="${bookList }" var="book">
			<tr>
				<th>${book.jBookNum }</th>
				<th>${book.jTitle }</th>
				<th>${book.jPublisher }</th>
				<th>${book.jPrice }</th>
				<th>${book.jWriter }</th>
				<td>
					<a href="delete.do?bookNum=${book.jBookNum }">[삭제]</a>
				</td>
				<td>
					<a href="updateForm.do?bookNum=${book.jBookNum }">[수정]</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>