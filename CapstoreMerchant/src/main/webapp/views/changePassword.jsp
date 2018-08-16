<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Change password</h1>
	<form action="changePassword" method="post">
	 <table cellpadding="6" cellspacing="2" align="center">
		
		<tr>
			<td>Old Password</td>
			<td><input type="text" name="oldPassword" /></td>
		</tr>
		
		<tr>
			<td>New Password</td>
			<td><input type="text" name="newPassword" /></td>
		</tr>
		
		<tr>
			<td>Confirm New Password</td>
			<td><input type="text" name="confirmNewPassword" /></td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" value="Change Password" /></td>
			<td><input type="reset" name="reset" value="Reset" /></td>
		</tr>
		
		</table>
		</form>
</body>
</html>