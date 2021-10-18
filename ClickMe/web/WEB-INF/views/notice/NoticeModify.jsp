<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정 단위 테스트 서블릿 페이지</title>
</head>
<body>
	<h1>공지사항 수정 단위 테스트</h1>
	<p>수정할 속성이 없다면 빈 칸으로 남겨주세요. 단, 공지사항 코드는 필수적으로 입력해야 합니다.</p>
	
	<button onclick="location.href='${pageContext.servletContext.contextPath}'" name="backToHome">홈으로</button>
	
	<h2>공지사항 수정 폼</h2>
	<form action="${pageContext.servletContext.contextPath}/notice/modify" method="post" style="display: inline-block">
		<fieldset>
			<legend>공지사항 수정 필드</legend>
			<label>1. 공지사항 코드</label>
			<input type="number" name="code"/><br>
			<label>2. 공지사항 제목</label>
			<input type="text" name="title" size="50" placeholder="수정할 제목을 입력해주세요."/><br>
			<label>3. 공지사항 내용</label>
			<textarea name="content" rows="10" cols="50" placeholder="수정할 내용을 작성해 주세요." style="resize: vertical;"></textarea><br>
			<br>
			<button type="submit">수정</button>
		</fieldset>
	</form>
	
	<br>
	
	<%
		String result = (String) request.getAttribute("isDMLSuccess");
		String backgroundColor = "";
		
		if (result == null) {
			result = "아직 submit 버튼을 누르지 않았습니다!";
			backgroundColor = "orange";
		} else if (result == "success") {
			backgroundColor = "green";
		} else {
			backgroundColor = "red";
		}
	%>
	<label>성공 여부 : </label>
	<label style="background-color: <%= backgroundColor %>"><%= result %></label>
</body>
</html>