<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="login-form" action="j_spring_security_check" method="POST">
		<div class="sign-in-form">
			<input type="text" id="username" name="j_username"
				value="${username}" class="form-field username span6"
				placeholder="User name" /> <input type="password" id="password"
				name="j_password" class="form-field password span6"
				placeholder="Password" /> <a href="#" class="forgot-password">Forgot
				your username or password?</a>
			<button class="button block" type="submit">Sign in</button>
		</div>
	</form>
</body>
</html>