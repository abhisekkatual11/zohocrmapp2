<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Bill</title>
</head>
<body>
	<h2 align="center">Create | Bill</h2><hr>
	<h3 align="center">
	<form action="save" method="post">
					 <input type="text" name="id" value="${byId.id}"/><br>
		Aadhaar_ID:~ <input type="number" name="aadhaarId" value="${byId.aadhaarId}"/><br>
		Name:~       <input type="text" name="name" value="${byId.name}"/><br>
		Address:~    <input type="text" name="address" value="${byId.address}"/><br>
		Email_ID:~   <input type="text" name="email" value="${byId.email}"/><br>
		Mobile_NO:~  <input type="tel" name="mobile" value="${byId.mobile}"/><br>
	   Product_Name:~<input type="text" name="productName"/><br>
	   	Quantity:~	 <input type="number" name="quantity"/><br>
	   	Amount:~	 <input type="number" name="amount"/><br>
	   		<input type="submit" value="Generate Bill"/>
	</form>
	</h3>
</body>
</html>