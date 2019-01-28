<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 메뉴</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/resources/css/style.css" />
</head>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
			<%@ include file="../home/header.jsp" %>
			</td>
		</tr>
		<tr>
			<td colspan="2">
			</td>

		</tr>
		<tr style="height: 300px; width: 300px;">
			<td>
			<%@ include file="side-menu.jsp" %>
			</td>
			<td>
				content
			</td>
		<tr style="width:100px">
			<td colspan="2">
			<%@ include file="../home/footer.jsp" %>
			</td>
		</tr>
	</table>

</body>
</html>