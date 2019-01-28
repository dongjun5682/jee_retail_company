<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="member-update">
<h1>비밀번호 수정</h1>
<table>
	<tr>
		<th></th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td>${user.id}</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td>
		<form action="member.do">
		현재 비밀번호 <input type="text" name="currPass" /> 
		새로운 비밀번호 <input type="text" name="changePass" />
		<input type="submit" name="btn" value="modify" />
		</form>
		</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${user.name}</td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td>${user.ssn}</td>
	</tr>
	
</table>
</div>