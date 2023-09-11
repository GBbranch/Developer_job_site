console.log("🖐️signup.js");

// 이벤트 리스너를 추가하여 페이지 로드 시 실행
window.addEventListener("DOMContentLoaded", (event) => {
    // Form 데이터 구성
    const form = document.signupForm;

    // 날짜 입력란 기본값 설정
    const establishedDateInput = form.establishedDate;
    establishedDateInput.value = "설립연도-월-일";

    // 포커스 이벤트 리스너를 추가하여 입력란이 비어있을 때 다시 기본값을 표시
    establishedDateInput.addEventListener("focus", function () {
        if (this.value === "설립연도-월-일") {
            this.value = ""; // 입력란이 기본값일 때 클릭하면 비워줍니다.
        }
    });

    // 입력란을 벗어날 때 값이 비어 있으면 다시 기본값으로 설정
    establishedDateInput.addEventListener("blur", function () {
        if (this.value === "") {
            this.value = "설립연도-월-일";
        }
    });
});

// 이전 코드는 페이지 로드 시에 날짜 입력란 기본값을 설정하는 코드입니다.
// 나머지 코드는 폼 제출 시 동작할 코드입니다.

document.signupForm.onsubmit = async (e) => {
<<<<<<< HEAD
	e.preventDefault();
	
	// form 데이터 구성
	const form = e.target;
	const loginData = {
			userid : form.userid.value,
			password : form.password.value,
			name : form.name.value,
			gender : form.gender.value,
			birthday : form.birthday.value,
			phone : form.phone.value,
			email : form.email.value,
			address : form.address.value,
			detail_addr : (form.detail_addr.value + form.addretc.value).trim(),
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
=======
    e.preventDefault();
    // Form 데이터 구성
    const form = e.target;
    const loginData = {
        businessNumber: form.businessNumber.value,
        password: form.password.value,
        companyName: form.companyName.value,
        establishedDate: form.establishedDate.value,
        companyType: form.companyType.value,
        employeeCount: form.employeeCount.value,
        representativeName: form.representativeName.value,
        website: form.website.value,
        zipcode: form.zipcode.value,
        address: form.address.value,
        detail_addr: form.detail_addr.value,
        addretc: form.addretc.value,
        companyDescription: form.companyDescription.value
    };
    console.log(form.action, loginData);

    // POST 요청
    try {
        // 실행
        response = await fetch(form.action, {
            method: "POST",
            headers: {
                "Content-Type": "application/x-www-form-urlencoded;charset=utf-8",
            },
            body: new URLSearchParams(loginData).toString(),
        });

        // 성공시
        const result = await response.json();
        console.log(result);

        const resultMessage = result.result.trim();
        if (resultMessage == "success") {
            alert('회원가입 성공!');
            location = result.url;
        } else if (resultMessage == "fail") {
            alert('무슨 이유로 실패함..');
        }

        // POST 요청 도중 에러 발생 시..
    } catch (error) {
        console.error("Error:", error);
        alert('알 수 없는 이유로 로그인 실패..');
    }
}
>>>>>>> 2783b1409f8eaf5cb742045817db924765280052
