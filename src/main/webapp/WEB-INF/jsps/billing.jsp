<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Recipt</title>
</head>
<body>
	<h2 align="center">Billing | Recipts</h2><hr>
	<h3 align="center">
		Product_Name:~ ${bill.productName}<br>
		Quantity:~     ${bill.quantity}<br>
		<hr>
		Amount:~	   ${bill.amount}<br><br>
		
		Please, Visit Again Mr/Mrs :${bill.name}<br>
		With your register email & mobile<br>
		${bill.email},${bill.mobile}
		you can the win Gifts.<br><br><br><br>
		</h3>
</body>
</html>