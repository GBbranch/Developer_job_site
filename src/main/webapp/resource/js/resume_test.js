console.log("resume_test")

//학력 부분
document.getElementById("schoolPlus").onclick = (e) => {
	e.preventDefault();
	console.log('학교정보추가 버튼 클릭');
	const list = document.getElementById('schoolList');

	const li = document.createElement('li');
	li.setAttribute('class', 'schoolItem');
	list.appendChild(li);


	const deleteButton = document.createElement('button');
	deleteButton.textContent = '삭제';
	deleteButton.addEventListener('click', function() {
		// 클릭한 삭제 버튼의 부모 노드(<li>) 삭제
		list.removeChild(li);
	});

	li.innerHTML =
		'<input type="text" name="schRating" placeholder="학교 등급"/>'
		+ '<input type="text" name="schName" placeholder="대학교이름"/>'
		+ '<input type="text" name="schDepartment" placeholder="학과"/>'
		+ '<input type="text" name="schStatus" placeholder="졸업여부"/>'
		+ '<input type="number" name="schGrade" placeholder="학점"/>'
		
		 // 삭제 버튼을 <li> 요소 안에 추가
    li.appendChild(deleteButton);
}

//경력
document.getElementById("regPlus").onclick = (e) => {
    e.preventDefault();
    console.log('추가 버튼 클릭');
    const list = document.getElementById('regList');

    const li = document.createElement('li');
    li.setAttribute('class', 'regItem');
    list.appendChild(li);

    const deleteButton = document.createElement('button');
    deleteButton.textContent = '삭제';
    deleteButton.addEventListener('click', function() {
        // 클릭한 삭제 버튼의 부모 노드(<li>) 삭제
        list.removeChild(li);
    });

    li.innerHTML =
        '<input type="text" name="regName" placeholder="회사이름"/>'
        + '<input type="text" name="regJob" placeholder="직무"/>'
        + '<input type="date" name="regSday"/>'
        + '<input type="date" name="regEday"/>';

    // 삭제 버튼을 <li> 요소 안에 추가
    li.appendChild(deleteButton);
}


//자격증
document.getElementById("liecencePlus").onclick = (e) => {
    e.preventDefault();
    console.log('자격증 정보 추가 버튼 클릭');
    const list = document.getElementById('liecenceList');

    const li = document.createElement('li');
    li.setAttribute('class', 'liecenceItem');
    list.appendChild(li);

    const deleteButton = document.createElement('button');
    deleteButton.textContent = '삭제';
    deleteButton.addEventListener('click', function() {
        // 클릭한 삭제 버튼의 부모 노드(<li>) 삭제
        list.removeChild(li);
    });

    li.innerHTML =
        '<input type="text" name="lieTitle" placeholder="자격증 명칭"/>'
        + '<input type="date" name="lieAcquisition"/>';

    // 삭제 버튼을 <li> 요소 안에 추가
    li.appendChild(deleteButton);
}

// 각 링크 요소를 가져옵니다.
const schoolLink = document.querySelector('.item.essential a');
const portfolioLink = document.querySelector('.item.add:nth-child(3) a');
const careerLink = document.querySelector('.item.add:nth-child(4) a');
const licenseLink = document.querySelector('.item.add:nth-child(5) a');

// 스크롤 이벤트 리스너를 추가합니다.
schoolLink.addEventListener('click', () => {
  scrollToElement('schoolField');
});

portfolioLink.addEventListener('click', () => {
  scrollToElement('portfolioField');
});

careerLink.addEventListener('click', () => {
  scrollToElement('regField');
});

licenseLink.addEventListener('click', () => {
  scrollToElement('liecenceField');
});

// 스크롤 함수를 정의합니다.
function scrollToElement(elementId) {
  const element = document.getElementById(elementId);
  if (element) {
    element.scrollIntoView({ behavior: 'smooth' });
  }
}







<<<<<<< Updated upstream
	li.innerHTML =
		'<input type="text" name="lieTitle" placeholder="자격증 명칭"/>';
};
=======
>>>>>>> Stashed changes
