<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}customer/signup.css"/>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 25px">회원 등록</font></h1>
</div>
<div class="grid-item" id="content">
<form id="form" name="form" >
	<div class="grid-container">
	    <div class="grid-item" id="item_1">아이디</div>
	    <div class="grid-item" id="item_2"><input type="text" id="customerId" name="customerId" ></div>
	    <div class="grid-item" id="item_3">비밀번호</div>
	    <div class="grid-item" id="item_4"><input type="text" id="password" name="password" ></div>
	    <div class="grid-item" id="item_5">이 름</div>
	    <div class="grid-item" id="item_6"><input type="text" id="customerName" name="customerName" ></div>
	   	<div class="grid-item" id="item_7">주민번호</div>
	    <div class="grid-item" id="item_8"><input type="text" id="ssn" name="ssn"></div>
	    <div class="grid-item" id="item_9">주소</div>
	    <div class="grid-item" id="item_10"><input type="text" id="address" name="address" ></div>
	    <div class="grid-item" id="item_11">도 시</div>
	    <div class="grid-item" id="item_12"><input type="text" id="city" name="city" ></div>
	    <div class="grid-item" id="item_13">우편번호</div>
	    <div class="grid-item" id="item_14"><input type="text" id="postalCode" name="postalCode" ></div>
	    <div class="grid-item" id="item_15"><input type="submit" id="confirm_btn" value='확 인'></div>
	    <div class="grid-item" id="item_16"><input type="reset" id="cancel_btn" value='취 소'> </div>
	    <input type="hidden" name="cmd" value="signup" />
	    <input type="hidden" name="page" value="signin" />
	    
	</div>
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var customerId = $('#customerId').val();
	var customerName = $('#customerName').val();
	var password = $('#password').val();
	var address = $('#address').val();
	var city = $('#city').val();
	var postalCode = $('#postalCode').val();
	var ssn = $('#ssn').val();
	$('#form')
	.attr('action', '${ctx}/customer.do')
	.submit();
});
</script>
