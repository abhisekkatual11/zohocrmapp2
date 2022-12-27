<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List | Bill</title>
</head>
<body>
	<h2 align="center">List | Bill</h2><hr>
	<table align="center" border="1">
		<tr>
			<th>SL</th>
			<th>Aadhaar_ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email_ID</th>
			<th>Mobile_NO</th>
			<th>Product_Name</th>
			<th>Quantity</th>
			<th>Amount</th>
		</tr>
		<c:forEach var="bill" items="${bill}">
			<tr>
				<td>${bill.id}</td>
				<td>${bill.aadhaarId}</td>
				<td>${bill.name}</td>
				<td>${bill.address}</td>
				<td>${bill.email}</td>
				<td>${bill.mobile}</td>
				<td>${bill.productName}</td>
				<td>${bill.quantity}</td>
				<td>${bill.amount}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>