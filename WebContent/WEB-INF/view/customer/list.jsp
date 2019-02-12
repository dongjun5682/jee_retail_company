<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 25px">고객 목록</font>
 	</h1>
</div>
<div class="grid-item" id="content">
	<table id="cust_tab">
	  <tr>
	    <th>No.</th>
	    <th>아이디</th>
	    <th>이 름</th>
	    <th>생년월일</th>
	    <th>성 별</th>
	    <th>전화번호</th>
	   	<th>우편번호</th>
	    <th>지번주소</th>
	    <th>상세주소</th>
	  </tr>
	  <c:forEach items="${list}" var="cus" varStatus="status">
		   <tr>
		    <td>${cus.rnum}</td>
		    <td>${cus.customerId}</td>
		    <td>${cus.customerName}</td>
		    <td>${cus.ssn}</td>
		    <td>남</td>
		    <td>${cus.phone}</td>
		    <td>${cus.postalCode}</td>
		    <td>${cus.city}</td>
		    <td>${cus.address}</td>
		  </tr>
	  </c:forEach>
	 
	  
	</table>
	<div style="height: 50px"></div>    
	<div class="center">
	  <div class="pagination">
	  <a href="#">&laquo;</a>
	  <a href="#" class="active">1</a>
	  <a href="#" id="page2">2</a>
	  <a href="#" id="page3">3</a>
	  <a href="#" id="page4">4</a>
	  <a href="#" id="page5">5</a>
	  <a href="#">&raquo;</a>
	  </div>
	</div>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#page2').click(function(){
	alert('페이지2');
	location.assign('${ctx}/customer.do?cmd=customer_list&page=list&page_num=2&page_size=5');
});
$('#page3').click(function(){
	alert('페이지3');
	location.assign('${ctx}/customer.do?cmd=customer_list&page=list&page_num=3&page_size=5');
});
$('#page4').click(function(){
	alert('페이지4');
	location.assign('${ctx}/customer.do?cmd=customer_list&page=list&page_num=4&page_size=5');
});
$('#page5').click(function(){
	alert('페이지5');
	location.assign('${ctx}/customer.do?cmd=customer_list&page=list&page_num=7&page_size=5');
});

</script>