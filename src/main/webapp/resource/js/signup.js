console.log("🖐️singup.js");
async function member_sigup(e) {
	e.preventDefault();
	
	// form 데이터 구성
	const form = e.target;
	
	const address = form.address.value;
	const addr1 = address.split(' ', 1).join();
	const addr2 = address.substring(addr1.length);
	
	const loginData = {
			userid : form.userid.value,
			password : form.password.value,
			name : form.name.value,
			gender : form.gender.value,
			birthday : form.birthday.value,
			phone : form.phone.value,
			email : form.email.value,
			address : addr1,
			detail_addr : (addr2 + form.addretc.value).trim(),
		};
	console.log(form.action);
	console.table(loginData);
	
	// 회원가입 요청
	try {
		response = await fetch(form.action, {
			method : "POST",
			headers : {
				"Content-Type": "application/x-www-form-urlencoded;charset=utf-8",
			},
			body : new URLSearchParams(loginData).toString(),
		});
		
		// 응답 메시지
		const jsonData = await response.json();
		console.table(jsonData);
		
		// 회원 가입 성공
		if(jsonData.result == "success"){
			alert('회원가입 성공!');
			location = jsonData.url;
		// 실패
		} else if(jsonData.result == "fail") alert('회원가입을 실패하였습니다.');
		
	// 오류 발생
	} catch (error) {
		console.error("Error:", error);
		alert('알 수 없는 이유로 로그인 실패..');
	}
}