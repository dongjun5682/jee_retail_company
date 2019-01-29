<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div style="height:30px">
				<h2>로그인</h2>
	</div>
	<form id="access_form">
	<div class="register-container">
		<div class="register-item" id="register-item1">사원번호</div>
		<div class="register-item" id="register-item2">
			<input type="text" id="empno" name="empno" />
		</div>
		<div class="register-item" id="register-item3">이름</div>
		<div class="register-item" id="register-item4">
			<input type="text" id="name" name="name" />
		</div>
		<div class="register-item" id="register-item11">
			<input type="submit" id="confirm_btn" value="로그인" />
		</div>
		<div class="register-item" id="register-item12">
			<input type="reset" id="cancel_btn" value="취소" />
		</div>
	</div>
	</form>
<script>
$('#confirm_btn').click(function(){
	$('#access_form').attr('action','${ctx}/customer.do').submit();
});


</script>