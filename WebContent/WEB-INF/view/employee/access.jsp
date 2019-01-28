<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>

<link rel="stylesheet" href="resources/css/style.css"/>

</head>
<body>
	<div class="container">
	<h2>회원 전용 시스템</h2>
			<form id="login-form">
			<fieldset>
			<legend>MEMBER LOGIN </legend>
			<input type="text" name="uid" placeholder="ID"/><br />
			<input type="password" name="upass" placeholder="PASSWORD"/><br /> 
			 <input type="hidden" name="cmd" value="login" />
			 <input type="hidden" name="dir" value="home" />
			 <input type="hidden" name="dest" value="welcome" />
			 
			 <button id="btn">접속하기</button>
			 
			</fieldset>
				<a id ="admin-link" href="#">관리자</a>
				<a id ="join-link" href="#">회원가입</a>
		</form>
	</div>

	<script>
	var submit = document.getElementById("btn");
	submit.addEventListener('click',function(){
		var id = document.getElementById("uid");
		var pass = document.getElementById("upass");
		
		if(id.value==="" && pass.value===""){
			alert('아이디랑 비밀번호를 입력해주세요.');
		}else{
			var form = document.getElementById("login-form");
			alert('아이디있어요');
			form.action = "member.do";
			form.method = "post";
			form.submit();
		}
		
			
	});
	
/* 	location.assign('member.do?dest=join-form'); */
	/* window.onload = function(){
		
	} */
	document.getElementById('join-link')
		.addEventListener('click', function(){
			location.assign('member.do?dest=join-form');
		});
		//click 이벤트
		//move 이면 클릭이벤트가 리스닝되고
		//move() 이면 즉시 실행
		// 'click' function(){} 하면 콜백함수가 호출된다
		
	</script>
</body>
</html>