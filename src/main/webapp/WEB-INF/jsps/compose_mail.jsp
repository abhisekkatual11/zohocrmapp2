<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose | Email</title>
</head>
<body>
	<h2 align="center">Compose | Email</h2><hr>
	${sent}
	<form action="send" method="post">
		<pre>
			To          :~<input type="text" name="to" value="${email}"/>
			Subject     :~<input type="text" name="sub"/>
			Compose Mail:~<textarea name="msg" rows="40" cols="50"></textarea>
					<input type="submit" name="Send"/>
		</pre>
	</form>
</body>
</html>