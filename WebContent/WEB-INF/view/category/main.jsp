<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/category/category.css" />
       <div class="grid-item" id="left">
    	카테고리1<br /><br />
    	<a href="#" id="" >스마트폰</a><br />
    </div>
    <div class="grid-item" id="center">
    	카테고리2<br /><br />
    	<a href="#" id="" >선박</a><br />
    </div>
	<div class="grid-item" id="right">
    	카테고리3<br /><br />
    	<a href="#" id="" >티비</a><br /><br />
    </div>
<jsp:include page="../home/bottom.jsp"/>  
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
});
$('#cust_login').click(function(){
	location.assign('home.do?cmd=move&page=login');
});
$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
});
</script>