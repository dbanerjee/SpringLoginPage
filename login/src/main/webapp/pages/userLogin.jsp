<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login Page</title>
	</head>
<body id="login">
	<form action="login.user" method="post">
		<table cellpadding="0" cellspacing="4" border="0" style="border: 1px solid black;">
			<tr>
				<td>Username</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"></td>
			</tr>			
		</table>
	</form>
</body>
</html>