<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

    <link rel="stylesheet" href="resource/css/board.css">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/checkout/">

<title>Insert title here</title>
</head>
<body>

    <div class="layoutMiddle">

        <!-- 헤더 -->
        <header>
            <img src="source/image/logo-removebg.png" alt="타이틀 로고" class="titleImage">
            <div class=buttonlist>
            <c:if test="${ empty sessionScope.loginUser }">
                <button>로그인</button>
                <button>회원가입</button>
            </c:if>
            <c:if test="${ !empty sessionScope.loginUser }">   
             	<div class="btns">
             		<button onclick="location.href='${ pageContext.servletContext.contextPath }/logout'">로그아웃</button>
             		<button>정보수정</button>
             	</div>
             </c:if> 
            </div>
            <div class="search-container">
                <input type="text" name="search">
                <button type="submit">검색하기</button>
            </div>
        </header>

        <!-- 네비게이션 바 -->
        <nav>
            <div class="nav_bar">
                <a href="#" id="main">여성</a>
                <a href="#" id="about">남성</a>
                <a href="#" id="post">브랜드</a>
                <a href="#" id="contact">공지사항</a>
                <a href="#" id="contact">고객지원</a>
            </div>
        </nav>

        <div class="wrap">
            <aside>
                <div class="sidebar">
                    <img src="source/icon/user.png" id="icon">
                    <img src="source/icon/cart.png" id="icon">
                    <img src="source/icon/heart.png" id="icon">
                    <img src="source/icon/clock.png" id="icon">
                    <button onclick="topFunction()" title="top" id="topbutton">Top </button>
                </div>
            </aside>

            <section>
                <div class="signup_field p-3">
                    
                    <article class="signup_cs p-5">
                        <br>
                        <div class="container">
							  <div class="row mb-5">
							    <div class="col">
							      	<button class="btn btn-secondary" onclick="location.href='${pageContext.servletContext.contextPath}/user/select'">
									사용자 전체 셀렉</button>
								</form>
							    </div>
							    <div class="col">
							    	<form action="user/oneSelct" method="post">
							    	    <input type="text" name="userNum" id="userNum">
									    <button class="btn btn-secondary" type="submit" placeholder="코드를 입력하세요">사용자 1명 선택</button>
									</form>
							    </div>
							  </div>
							  <div class="row mb-5">
							    <div class="col">
							  		<form action="${pageContext.servletContext.contextPath}/user/statusPage" method="post">
							    	    <input type="text" name="userNum" id="userNum" placeholder="코드를 입력하세요" class="w-50">
									    <button class="btn btn-secondary" type="submit">사용자용 본인 스탯 <br> 조회 및 수정 </button>
									</form>
							    </div>
							    <div class="col">
							    	<button class="btn btn-secondary" onclick="location.href='${pageContext.servletContext.contextPath}/user/idFindPage'">
							    	아이디 찾기</button>
							    </div>
							  </div>
							  <div class="row mb-5">
							    <div class="col">
									    <button class="btn btn-secondary" onclick="location.href='${pageContext.servletContext.contextPath}/user/listForAdmin'" type="button">관리자용 사용자 리스트 조회</button>
							    </div>
							    <div class="col">
							    	<button class="btn btn-secondary" onclick="location.href='${pageContext.servletContext.contextPath}/user/status'">
							    	관리자용 사용자 리스트 조회</button>
							    </div>
							  </div>
							</div>
                    </article>
                </div>
            </section>
        <footer>
            <hr class="solidLines">
            <div class="bottombar">
                <a href="#" id="company-intro">회사소개</a>
                <a href="#" id="privacy-statement">개인정보취급방침</a>
                <a href="#" id="terms-of-use">이용약관</a>
                <a href="#" id="financial">전자금융거래 이용약관</a>
                <a href="#" id="sitemap">사이트맵</a>
                <div class="sns">
                    <img src="source/icon/instagram.png" id="snsicon">
                    <img src="source/icon/facebook.png" id="snsicon">
                    <img src="source/icon/kakao-talk.png" id="snsicon">
                    <img src="source/icon/youtube.png" id="snsicon">
                </div>
            </div>
            <hr class="solidLines">
            <div class="siteintro">
                (주) 머스트잇<br>
                대표 : 더조은 ㅣ 소재지 : 00시 00구 00로 000길 00-00 (00동,00층 클릭미)<br>
                사업자등록 : XXX-XX-XX ㅣ 통신판매업신고 : 서울강남 00000호<br>
                개인정보관리책임자 : ㅁㅁㅁ ㅣ E-MAIL : help@gmail.co.kr | 호스팅 : 클릭미<br>
                <br>
                고객센터<br>
                <br>
                1566-3516 ㅣ 평일 10:00 ~ 18:00 ㅣ 점심시간 12:30 ~ 13:30 ㅣ 주말 및 공휴일 휴무<br>
                상품, 배송, 재고 등의 문의는 상품페이지 하단 [상품문의 등록]을 이용하시면 판매자로부터<br>
                더욱 정확한 답변을 받으실 수 있습니다.<br>

            </div>
            <hr class="solidLines">
        </footer>
    </div>
    </div>
</body>
</html>