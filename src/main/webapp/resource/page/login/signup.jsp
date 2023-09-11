<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <!-- CSS 스타일 시트 -->
    <link rel="stylesheet" type="text/css" href="/jspweb/resource/css/login.css">
    <!-- 추가된 CSS -->
    <style>
        /* 라디오 버튼 레이블 스타일링 */
      .gender-options {
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.gender-label {
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
    color: #333; /* 텍스트 색상 */
    font-weight: bold; /* 글꼴 굵기 */
    font-size: 16px; /* 글꼴 크기 */
    margin-top: 10px; /* 위쪽 여백 */
}

.gender-label input[type="radio"] {
    margin-right: 5px;
    transform: scale(1.5); /* 라디오 버튼 크기 조정 (선택사항) */
}
    </style>
</head>
<body>
    <div class="container">
        <div class="card">
            <h1>회원가입</h1>
            
            <!-- 회원 가입 양식 -->
            <form action="/jspweb/member/signup" method="post" name="signupForm">
                <input type="text" name="userid" id="signupUsername" placeholder="사용자 ID" required>
                <input type="password" name="password" id="signupPassword" placeholder="비밀번호" required>
                <input type="text" name="name" id="signupName" placeholder="이름" required>
                
                <!-- 성별 선택 -->
                <div class="gender-options">
                    <div class="gender-label">
                        <input type="radio" name="gender" id="signupGender_male" value="male" required>
                        <label for="signupGender_male">남자</label>
                    </div>
                    <div class="gender-label">
                        <input type="radio" name="gender" id="signupGender_female" value="female">
                        <label for="signupGender_female">여자</label>
                    </div>
                </div>
                
                <input type="date" name="birthday" id="signupBirthdate" placeholder="생년월일" required>
                <input type="tel" name="phone" id="signupPhone" placeholder="휴대폰번호" required>
                <input type="email" name="email" id="signupEmail" placeholder="이메일" required>
                
                <input type="text" name="zipcode" id="sample6_postcode" placeholder="우편번호">
                <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
                <input type="text" name="address" id="sample6_address" placeholder="주소" required>
                <input type="text" name="detail_addr" id="sample6_detailAddress" placeholder="상세주소">
                <input type="text" name="addretc" id="sample6_extraAddress" placeholder="참고항목">
                
                <button type="submit">가입</button>
            </form>
            
            <p>이미 계정이 있으신가요? <a href="/jspweb/member/login">로그인</a></p>
        </div>
    </div>
</body>
</html>
