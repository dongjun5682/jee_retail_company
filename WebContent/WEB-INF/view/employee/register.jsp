<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div style="height: 50px">사원등록</div>
<form id="register_form">
<div class="register-container">
	<div class="register-item" id="register-item1">사원번호</div>
	<div class="register-item" id="register-item2">
		<input type="text" id="empno" name="empno"/>
	</div>
	<div class="register-item" id="register-item3">이름</div>
	<div class="register-item" id="register-item4">
		<input type="text" id="name" name="name"  />
	</div>
	<div class="register-item" id="register-item5">매니저</div>
	<div class="register-item" id="register-item6">
		<input type="text" id="manager" name="manager"  />
	</div>
	<div class="register-item" id="register-item7">생년월일</div>
	<div class="register-item" id="register-item8">
		<input type="text" id="birthday" name="birthday"  />
	</div>
	<div class="register-item" id="register-item9">상세</div>
	<div class="register-item" id="register-item10">
		<input type="text" id="content" name="content" />
	</div>
	<div class="register-item" id="register-item11">
		<input type="submit" id="confirm_btn" value="등록"/>
	</div>
	<div class="register-item" id="register-item12">
		<input type="reset" id="cancel_btn" value="취소"/>
	</div>
</div>
</form>
<script>
$('#confirm_btn').click(function(){
	
	$('#register_form').attr('action', '${ctx}/employee.do').submit();
	
/*	if($('#empno').val() ==='' ||  $('#name').val() ==='' || 
			$('#manager').val() ==='' || $('#manager').val() ===''){
		alert('필수값을 넣어주세요');
	}else{
		//document.form.action = '${ctx}/employee.do' 자바스크립트 방식
		$('#register_form').attr('action', '${ctx}/employee.do').submit();// Jquery 방식 (메소드 체이닝 패턴)
	}
*/	
});

$('#cancel_btn').click(function(){
	alert('리셋버튼 클릭!');
});
</script>	
