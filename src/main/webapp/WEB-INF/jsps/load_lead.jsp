<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Form</title>
</head>
<body>
	<h2 align="center">Lead | Form | Registration</h2>
	<form action="createLead" method="post">
		<table align="center">
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr>
				<td>Aadhaar_ID:~</td>
				<td><input type="number" name="aadhaarId"/></td>
			</tr>
			<tr>
				<td>Name:~</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Address:~</td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td>Email_ID:~</td>
				<td><input type="email" name="email"/></td>
			</tr>
			<tr>
				<td>Mobile_NO:~</td>
				<td><input type="tel" name="mobile"/></td>
			</tr>
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="Create a Lead"/></td>
			</tr>
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
		</table>
	</form>
</body>
</html>