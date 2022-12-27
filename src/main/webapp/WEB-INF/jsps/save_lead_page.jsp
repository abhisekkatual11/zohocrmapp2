<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Form | Saved</title>
</head>
<body>
	<h2 align="center">Lead | Form | Saved</h2><hr>
		<h3 align="center">
		Aadhaar_ID:~ ${createLead.aadhaarId}<br>
		Name:~       ${createLead.name}<br>
		Address:~    ${createLead.address}<br>
		Email_ID:~   ${createLead.email}<br>
		Mobile_NO:~  ${createLead.mobile}
		<form action="sendEmail" method="post">
				<input type="hidden" name="email" value="${createLead.email}"/><br>
				<input type="submit" value="Email"/>
			</form>
			<form action="convertLead" method="post">
				<input type="hidden" name="id" value="${createLead.id}"/><br>
				<input type="submit" value="Convert"/>
			</form>
		</h3>
</body>
</html>