<%@page import="com.asset.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>User's details:</h3>
	Result: <%= ((User)request.getAttribute("result")).toJSON() %><br><br>
	<a href="employeeHome.html">Navigate to your home page</a>
</body>
</html>