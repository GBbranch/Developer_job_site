<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${resume.NAME} : ${resume.TITLE}</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/resumeview.css">
<link href="${pageContext.request.contextPath}/resource/css/body.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resource/css/header.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	
	<header><%@ include file= "/WEB-INF/views/header.jsp" %></header>
	
	<h3>${resume.NAME}님 작성하신 이력서 입니다</h3><br/>
	
	<table border="1">
		<tr>
			<th>생일</th>
			<td>${resume.BIRTHDAY}</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>${resume.PHONE}</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${resume.EMAIL}</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>${resume.ADDRESS}</td>
		</tr>
		<tr>
			<th>포트폴리오</th>
			<td>${resume.PORTFOLIO}</td>
		</tr>
	</table>
	
	<h3>이력서 제목 : ${resume.TITLE}</h3>
	
	<c:if test="${not empty school}">
		<fieldset>
			<legend>학교</legend>
			<c:forEach var="i" items="${school}">
				<div>
				<h3>학교등급 : <span>${i.RATING }</span><br/></h3>
				<h3>학교명 : <span>${i.NAME }</span><br/></h3>
				<h3>학과 : <span>${i.DEPARTMENT }</span><br/></h3>
				<h3>졸업여부 : <span>${i.STATUS }</span><br/></h3>
				</div>
			</c:forEach>
		</fieldset>
	</c:if>
	
	<c:if test="${not empty reg}">
		<fieldset>
			<legend>경력</legend>
			<c:forEach var="i" items="${reg}">
				<h3><p>${i.NAME }</p></h3>
				<h3><p>${i.JOB }</p></h3>
				<h3><p>${i.SWORK_DAY } ~ ${i.EWORK_DAY }</p></h3>
			</c:forEach>
		</fieldset>
	</c:if>
	
	<c:if test="${not empty liecence}">
		<fieldset>
			<legend>자격증</legend>
			<c:forEach var="i" items="${liecence}">
				<h3>자격증명 : <p>${i.TITLE }</p></h3>
				<h3>취득날짜 : <p>${i.ACQUISITION }</p></h3>
			</c:forEach>
		</fieldset>
	</c:if>
	
	<c:if test="${not empty resume.SELF_INTRO}">
		<fieldset>
			<legend>자기소개</legend>
			<div>
				<h3>${resume.SELF_INTRO}</h3>
			</div>
		</fieldset>
	</c:if>
	
</body>
</html>