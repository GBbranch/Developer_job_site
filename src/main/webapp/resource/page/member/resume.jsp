<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>개인 이력서</title>
<link href="${pageContext.request.contextPath}/resource/css/resume.css"
	rel="stylesheet" type="text/css">
<style>
input[type="checkbox"]:checked ~ ul {
	display: none;
}
</style>
<script src="${pageContext.request.contextPath}/resource/js/resume.js"
	defer></script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/member/resume"
		method="post">
		<div class="resumeHeader">
			<div class="container">
				<a href="${pageContext.request.contextPath}" class="logo linkLogo">
					<!-- 로고클릭 시메인페이지 이동--> <img
					src="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F5575%2F2021%2F10%2F26%2F0000240596_001_20211026080003057.jpg&type=sc960_832"
					width="200px; " height=80px; alt="JOBKOREA">
				</a>
			</div>
		</div>
		<!-- 이력서 상단 부분 -->
		<div class="top">
			<h1 class="username">${sessionScope.member.name}</h1>
			<br />
			<h3>
				<p class="txt">내 이력서를 작성해보세요!</p>
			</h3>
			<ul class="userinfo">
				<li class="user_email">${sessionScope.member.email}</li>
				<li class="user_phone">${sessionScope.member.phone}</li>
				<li class="user_addr">${sessionScope.member.address}
					${sessionScope.member.detail_addr}</li>
			</ul>
			<div class="career">
				<fieldset>
					<label for="careerCd" class="blind">경력구분</label> <select
						name="career_cd" id="careerCd">
						<option value="1" selected="selected">신입</option>
						<option value="2">경력</option>
					</select>
				</fieldset>
				<!-- 우측박스 추가 -->
				<div class="resume_snb">
					<div class="snb_container">
						<div class="snb_box">
							<div class="snb_top">
								<h3 class="tit">이력서 완성하기</h3>
							</div>
							<p class="txt">
								<em>원하는 항목으로 이동하기</em><br>
							</p>
							<ul class="item_list">
								<li class="item add"><a href="#career"
									class="BtnType con_link">직군</a></li>
								<li class="item essential"><a href="#school_end"
									class="BtnType con_link">학력</a></li>
								<li class="item"><a href="#career_now"
									class="BtnType con_link">포트폴리오</a></li>
								<li class="item add"><a href="#reg_date"
									class="BtnType con_link">경력사항</a></li>
								<li class="item add"><a href="#license"
									class="BtnType con_link">자격증</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--직업군-->
		<fieldset>
			<div class="box">
				<div id="career" class="content-section">
					<h2 class="career">직군</h2>
					<input type="checkbox" id="careerRoot">
					 <label for="careerRoot">정보열기</label>
					<ul id="careerList">
						<!-- 이 부분에 추가된 리스트 아이템이 표시됩니다. -->
					</ul>
					<input type="text" id="CAREER" name="CAREER" required><br>
					<br>
					<button type="button" class="editButton">추가하기</button>
					<button type="button" class="deleteButton">삭제하기</button>
				</div>
			</div>
		</fieldset>
		<!-- 학력 정보 부분 -->
		<fieldset>
			<div class="box">
				<div id="school_end" class="content-section">
					<h2 class="school">학력</h2>
					<input type="checkbox" id="schoolRoot"> <label
						for="schoolRoot">정보열기</label>
					<ul id="school_endList">
						<!-- 이 부분에 추가된 리스트 아이템이 표시됩니다. -->
					</ul>
					<input type="text" id="SCHOOL" name="SCHOOL" required><br>
					<br>
					<button type="button" class="editButton">추가하기</button>
					<button type="button" class="deleteButton">삭제하기</button>
				</div>
			</div>
		</fieldset>

		<!-- 포트폴리오 부분 -->
		<fieldset>
			<div class="box">
				<div id="portfolio" class="content-section">
					<h2 class="portfolio">포트폴리오</h2>
					<input type="checkbox" id="portfolioRoot"> <label
						for="portfolioRoot">정보열기</label>
					<ul id="portfolioList">
						<!-- 이 부분에 추가된 리스트 아이템이 표시됩니다. -->
					</ul>
					<input type="text" id="PORTFOLIO" name="PORTFOLIO" required><br>
					<br>
					<button type="button" class="editButton">추가하기</button>
					<button type="button" class="deleteButton">삭제하기</button>
				</div>
			</div>
		</fieldset>
		<!-- 경력사항 -->
		<fieldset>
			<div class="box">
				<div id="reg_date" class="content-section">
					<h2 class="reg_date">경력 사항</h2>
					<input type="checkbox" id="reg_date"> <label
						for="reg_dateRoot">정보열기</label>
					<ul id="reg_dateList">
						<!-- 이 부분에 추가된 리스트 아이템이 표시됩니다. -->
					</ul>
					<input type="text" id="REG_DATE" name="REG_DATE" required><br>
					<br>
					<button type="button" class="editButton">추가하기</button>
					<button type="button" class="deleteButton">삭제하기</button>
				</div>
			</div>
		</fieldset>


		<!-- 자격증 -->
		<fieldset>
			<div class="box">
				<div id="license" class="content-section">
					<h2 class="license">보유 자격증</h2>
					<input type="checkbox" id="licenseRoot"> <label
						for="licenseRoot">정보열기</label>
					<ul id="licenseList">
						<!-- 이 부분에 추가된 리스트 아이템이 표시됩니다. -->
					</ul>
					<input type="text" id="LICENCE" name="LICENCE" required><br>
					<br>
					<button type="button" class="editButton">추가하기</button>
					<button type="button" class="deleteButton">삭제하기</button>
				</div>
			</div>
		</fieldset>
		<!-- 이력서 하단 부분 -->
		<div class="resume_btm">
			<section id="resume_title">
				<div class="inner">
					<button type="submit" class="result">제출하기</button>
				</div>
			</section>
		</div>
	</form>
</body>
</html>
