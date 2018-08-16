<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Create Account</h1>
		<table cellpadding="6" cellspacing="2" align="center">
			<form:form action="merchantSignIn" method="post" modelAttribute="merchant">
				
				<tr>
					<td>Name:</td>
					<td><form:input path="merchantName" size="30" /></td>
					<td><form:errors path="merchantName" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td>Email:</td>
					<td><form:input path="email" size="30" /></td>
					<td><form:errors path="email" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><form:input path="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Mobile Number:</td>
					<td><form:input path="phoneNumber" size="30" /></td>
					<td><form:errors path="phoneNumber" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td>Type: </td>
					<td><input type = "radio" name = "type" value = "thirdparty"/>thirdparty<br/>
					<input type = "radio" name = "type" value = "direct"/>direct</td>
				</tr>
				
				<tr>
					<td>Security Question:</td>
					<td><select name = "securityQuestion">
						<option value = "Please Select" selected>Please Select</option>
						<option value = "BirthPlace">What is your Birth Place?</option>
						<option value = "PetName">What is your pet name?</option>
						<option value = "schoolName">What is your School Name?</option>
					</select>
				</tr>
				
				<tr>
					<td>Security Answer:</td>
					<td><form:input path="securityAnswer" size="30" /></td>
					<td><form:errors path="securityAnswer" cssClass="error" /></td>
				</tr>
				
				
				<tr>
					<td><input type="submit" name="submit" value="register" />
					<td><input type="reset" name="submit" value="Clear Form" />
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>