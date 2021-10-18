<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		  <!-- requestScope를 통해 request객체에 바인딩된 데이터에 접근할 수 있다. -->
	<h1 align="center">${ requestScope.message }</h1>
</body>
</html>