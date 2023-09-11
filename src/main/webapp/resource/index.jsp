<%@page import="com.enums.DEADLINES"%>
<%@page import="com.enums.JOBS"%>
<%@page import="com.enums.ADDRESS"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>사람인</title>
	
    <link href="${pageContext.request.contextPath}/resource/css/body.css" rel="stylesheet"  type="text/css"/>
    <link href="${pageContext.request.contextPath}/resource/css/header.css" rel="stylesheet"  type="text/css"/>
    <link href="${pageContext.request.contextPath}/resource/css/jobs_main.css" rel="stylesheet"  type="text/css"/>
    <link href="${pageContext.request.contextPath}/resource/css/jobs.css" rel="stylesheet"  type="text/css"/>
    <link href="${pageContext.request.contextPath}/resource/css/jops_table.css" rel="stylesheet"  type="text/css"/>
    <link href="${pageContext.request.contextPath}/resource/css/nav.css" rel="stylesheet"  type="text/css"/>

    <link href="https://fontawesome.com/icons/magnifying-glass?f=classic&s=solid"/>
</head>
<body>
 
    <header><%@ include file= "/WEB-INF/views/header.jsp" %></header>
    <nav><%@ include file= "/WEB-INF/views/navigation.jsp" %></nav>

    <div class="jops_list_article"><%@ include file= "/WEB-INF/views/main/card_list.jsp" %></div>

    <div class="jops_tabel_article"><%@ include file= "/WEB-INF/views/main/board.jsp" %></div>

<<<<<<< HEAD
    <footer><%@ include file= "/WEB-INF/views/footer.jsp" %></footer>
=======
            <div class="member">
            	<%-- 로그인 여부 --%>
            	<c:choose>
            		<%-- false --%>
            		<c:when test="${empty sessionScope.member}">
	            		<a href="${pageContext.request.contextPath}/member/login">로그인</a>
		                <span>|</span>
		                <a href="${pageContext.request.contextPath}/member/signup">회원가입</a><br>
		               
	            		<a href="${pageContext.request.contextPath}/member/companylogin">기업 로그인</a>
		                <span>|</span>
		                <a href="${pageContext.request.contextPath}/member/companysignup">기업 회원가입</a><br>
            		</c:when>
            		<%-- true --%>
            		<c:otherwise>
            			<span>${sessionScope.member.name}님 |</span>
            			<a href="${pageContext.request.contextPath}/member/resume">이력서 등록</a>
            			<span>|</span>
		                <a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>
            		</c:otherwise>
            	</c:choose>
            </div>
            
        </div>
    </header>

    <nav>
        <div class="container">
            <ul>
                <li class="menu">
                    <h4>채용정보</h4>
                    <div class="sub_meum">
                        <div class="container">
                            <div class="local">
                                <h4>지역별</h4>
                                <ul>
                                <%-- 지역별 메뉴 --%>
                                <c:forEach var="i" items="<%=ADDRESS.values()%>">
                                	<li>
	                                	<a href="${pageContext.request.contextPath}/article/list?addr=${i}">
	                                		${i.getKor()}
	                                	</a>
                                	</li>
                                </c:forEach>
                                </ul>
                            </div>

                            <div class="local">
                                <h4>직무별</h4>
                                <ul>
                                <%-- 직무별 메뉴 --%>
                                <c:forEach var="i" items="<%=JOBS.values()%>">
                                	<li>
                                		<a href="${pageContext.request.contextPath}/article/list?jobs=${i}">
                                			${i.getKor()}
                                		</a>
                                	</li>
                                </c:forEach>
                                </ul>
                            </div>

                            <div class="local">
                                <h4>경력별</h4>
                                <ul>
                                <%-- 경력별 메뉴 --%>
                                <c:forEach var="i" items="<%=DEADLINES.values()%>">
                                	<li>
                                		<a href="${pageContext.request.contextPath}/article/list?deadline=${i}">
                                			${i.getKor()}
                                		</a>
                                	</li>
                                </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </li>

                <li class="menu">
                    <h4>회원 서비스</h4>
                    <div class="sub_meum">
                        <div class="container">
                            <div class="member">
                                <h4>회원용</h4>
                                <ul>
                                    <li>서울</li>
                                </ul>
                            </div>

                            <div class="member">
                                <h4>기업용</h4>
                                <ul>
                                    <li>서울</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </li>

            </ul>

        </div>
    </nav>

    <div class="jops_list_article">
        <div class="container">
            <h2 class="jops_title">대표 기업</h2>
            
            <ul class="jops_list">
			
			<%-- 대표 기업 항목 --%>
			<c:forEach begin="0" end="${repr}" step="1">
                <li class="job_item">
                    <a href="${pageContext.request.contextPath}/article/2">
                        <img src="${pageContext.request.contextPath}/resource/img/apple.png" class="logo"/>
                        <h4 class="company">애플 코리아 유한회사</h4>
                        <h3 class="title">다양한 신입/경력직 채용</h3>
                        <div class="bottom">
                            <p class="local">서울 강남구</p>
                            <p>·</p>
                            <p class="pay">3,000,000원</p>
                        </div>
                    </a>
                </li>
			</c:forEach>
			
            </ul>
        </div>
    </div>

    <div class="jops_tabel_article">
        <div class="container">
            <h2 class="jops_title">주요 채용정보</h2>
            <ul class="jobs_tabel">
            
            <%-- 주요 채용 게시판 --%>
            <c:forEach begin="0" end="${arti}" step="1">
                <li class="job_item">
                    <a href="${pageContext.request.contextPath}/article/3">
                        <div class="jobs_tabel_item">
                            <div class="job_item_left">
                                <h4 class="company">애플 코리아 유한회사</h4>
                                <h3 class="title">다양한 신입/경력직 채용</h3>
                                <div class="bottom">
                                    <p class="local">서울 강남구</p>
                                    <p>·</p>
                                    <p class="pay">3,000,000원</p>
                                </div>
                            </div>

                            <div class="job_item_right">
                                <h5 class="day">오늘마감</h5>
                            </div>
                        </div>
                    </a>
                </li>
             </c:forEach>

            </ul>
        </div>
    </div>

    <footer>
        <div class="container">
            <p>사람인 고객센터 02-2025-4733 (평일 09:00~19:00, 주말·공휴일 휴무)</p>
            <p>이메일 : help@saramin.co.kr, Fax : 02-6937-0039(대표), 02-6937-0035(세금계산서)</p>
            <p>(주)사람인, 우 : 08378, 구로구 디지털로 34길 43, 14층, 대표 : 김용환</p>
            <p>사업자등록 : 113-86-00917, 직업정보제공사업 : 서울 관악 제 2005-6호, 통신판매업 : 제 2005-02339호</p>
            <p>Copyright (c) (주)사람인. All rights reserved.</p>
        </div>
    </footer>
>>>>>>> 2783b1409f8eaf5cb742045817db924765280052
</body>
</html>