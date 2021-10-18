<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">

<link rel="stylesheet" href="../resource/css/board.css">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/checkout/">
<title>Insert title here</title>

</head>
<body>

	<div class="layoutMiddle">

		<!-- 헤더 -->
		<header>
			<img src="../source/image/logo-removebg.png" alt="타이틀 로고"
				class="titleImage">
			<div class=buttonlist>
				<button>로그인</button>
				<button>회원가입</button>
			</div>
			<div class="search-container">
				<input type="text" name="search">
				<button type="submit">검색하기</button>
			</div>
		</header>

		<!-- 네비게이션 바 -->
		<nav>
			<div class="nav_bar">
				<a href="#" id="main">여성</a> <a href="#" id="about">남성</a> <a
					href="#" id="post">브랜드</a> <a href="#" id="contact">공지사항</a> <a
					href="#" id="contact">고객지원</a>
			</div>
		</nav>

		<div class="wrap">
			<aside>
				<div class="sidebar">
					<img src="../source/icon/user.png" id="icon"> <img
						src="../source/icon/cart.png" id="icon"> <img
						src="../source/icon/heart.png" id="icon"> <img
						src="../source/icon/clock.png" id="icon">
					<button onclick="topFunction()" title="top" id="topbutton">Top
					</button>
				</div>
			</aside>

			<section class="overflow-auto ">
				<div class="main_field p-3">
					<article class="main_cs p-3">
						<br>
						<div class="container">
							<h1 align="center">회원 전체 조회</h1>
							<table align="center" border="1" class="table table-striped"
								style="width: 1200px">
								<tr>
									<th>사용자코드</th>
									<th>탈퇴형태<br> 카테고리 코드
									</th>
									<th>아이디</th>
									<th>비밀번호</th>
									<th>이메일</th>
									<th>핸드폰번호</th>
									<th>이름</th>
									<th>생년월일</th>
									<th>성별</th>
									<th>관리권한유무</th>
									<th>예치금</th>
									<th>프로필<br> 사진<br> 원본이름
									</th>
									<th>프로필<br> UUID이름
									</th>
									<th>프로필<br> 사진<br> 저장경로
									</th>
									<th>최종<br> 로그인 날짜
									</th>
									<th>가입날짜</th>
								</tr>
								<c:choose>
									<c:when test="${requestScope.typeNo eq 2}">
										<c:forEach var="users" items="${ requestScope.userList }">
											<tr>
												<td>${ users.code }</td>
												<td>${ users.entCode }</td>
												<td>${ users.id }</td>
												<td>${ users.psw }</td>
												<td>${ users.email }</td>
												<td>${ users.phone }</td>
												<td>${ users.name }</td>
												<td>${ users.date }</td>
												<td>${ users.gender }</td>
												<td>${ users.authority }</td>
												<td>${ users.deposit }</td>
												<td>${ users.profileOrigName }</td>
												<td>${ users.profileUuidName }</td>
												<td>${ users.profileImgPath }</td>
												<td>${ users.lastLogin }</td>
												<td>${ users.enrollDate }</td>
											</tr>
										</c:forEach>
									</c:when>
									<c:when test="${requestScope.typeNo eq 1}">
										<tr>
											<td>${ requestScope.userList.code }</td>
											<td>${ requestScope.userList.entCode }</td>
											<td>${ requestScope.userList.id }</td>
											<td>${ requestScope.userList.psw }</td>
											<td>${ requestScope.userList.email }</td>
											<td>${ requestScope.userList.phone }</td>
											<td>${ requestScope.userList.name }</td>
											<td>${ requestScope.userList.date }</td>
											<td>${ requestScope.userList.gender }</td>
											<td>${ requestScope.userList.authority }</td>
											<td>${ requestScope.userList.deposit }</td>
											<td>${ requestScope.userList.profileOrigName }</td>
											<td>${ requestScope.userList.profileUuidName }</td>
											<td>${ requestScope.userList.profileImgPath }</td>
											<td>${ requestScope.userList.lastLogin }</td>
											<td>${ requestScope.userList.enrollDate }</td>
										</tr>
									</c:when>
								</c:choose>
							</table>
						</div>
					</article>
				</div>
			</section>
			<footer>
				<hr class="solidLines">
				<div class="bottombar">
					<a href="#" id="company-intro">회사소개</a> <a href="#"
						id="privacy-statement">개인정보취급방침</a> <a href="#" id="terms-of-use">이용약관</a>
					<a href="#" id="financial">전자금융거래 이용약관</a> <a href="#" id="sitemap">사이트맵</a>
					<div class="sns">
						<img src="../source/icon/instagram.png" id="snsicon"> <img
							src="../source/icon/facebook.png" id="snsicon"> <img
							src="../source/icon/kakao-talk.png" id="snsicon"> <img
							src="../source/icon/youtube.png" id="snsicon">
					</div>
				</div>
				<hr class="solidLines">
				<div class="siteintro">
					(주) 머스트잇<br> 대표 : 더조은 ㅣ 소재지 : 00시 00구 00로 000길 00-00 (00동,00층
					클릭미)<br> 사업자등록 : XXX-XX-XX ㅣ 통신판매업신고 : 서울강남 00000호<br>
					개인정보관리책임자 : ㅁㅁㅁ ㅣ E-MAIL : help@gmail.co.kr | 호스팅 : 클릭미<br> <br>
					고객센터<br> <br> 1566-3516 ㅣ 평일 10:00 ~ 18:00 ㅣ 점심시간 12:30 ~
					13:30 ㅣ 주말 및 공휴일 휴무<br> 상품, 배송, 재고 등의 문의는 상품페이지 하단 [상품문의 등록]을
					이용하시면 판매자로부터<br> 더욱 정확한 답변을 받으실 수 있습니다.<br>

				</div>
				<hr class="solidLines">
			</footer>
		</div>
	</div>
</body>
</html>