<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 단위 테스트 서블릿 페이지</title>
</head>
<body>
	<button onclick="location.href='${pageContext.servletContext.contextPath}'" name="backToHome">홈으로</button>
	<table border="1">
		<caption>전체 공지사항 목록 조회 결과</caption>
		<thead>
			<tr>
				<td>공지사항코드</td>
				<td>공지사항제목</td>
				<td>공지사항내용</td>
				<td>공지사항작성시간</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="notice" items="${ requestScope.noticeList }">
				<tr>
					<td>${notice.code}</td>
					<td>${notice.title}</td>
					<td>${notice.content}</td>
					<td>${notice.time}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>