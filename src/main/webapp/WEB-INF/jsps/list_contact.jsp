<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List | Contacts</title>
</head>
<body>
	<h2 align="center">Contact | Leads</h2><hr>
	<table align="center" border="1">
		<tr>
			<th>SL</th>
			<th>Aadhaar_ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email_ID</th>
			<th>Mobile_NO</th>
			<th>Billing</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.id}</td>
				<td>${list.aadhaarId}</td>
				<td>${list.name}</td>
				<td>${list.address}</td>
				<td>${list.email}</td>
				<td>${list.mobile}</td>
				<td><a href="billing?id=${list.id}">billing</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>