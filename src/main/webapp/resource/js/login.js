console.log("🖐️login.js");
document.loginForn.onsubmit = async (e) => {
	e.preventDefault();
	// Form 데이터 구성
	const form = e.target;
	const loginData = {
			userid : form.userid.value,
			password : form.password.value,
		}
	console.log(form.action, loginData);
	
	// POST 요청
	try {
		// 실행
		response = await fetch(form.action, {
			method : "POST",
			headers : {
				"Content-Type": "application/x-www-form-urlencoded;charset=utf-8",
			},
			body : new URLSearchParams(loginData).toString(),
		});
		
		// 성공시
		const result = await response.json();
		console.log(result);
		
		const resultMessage = result.result.trim();
		if(resultMessage == "success"){
			alert('로그인 성공!');
			location = result.url;
		} else if(resultMessage == "fail"){
			alert('아이디또는 비밀번호가 틀렸습니다.');
		}
		
	// POST 요청 도중 에러 발생 시..
	} catch (error) {
		console.error("Error:", error);
		alert('알 수 없는 이유로 로그인 실패..');
	}
}