<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<%
	int result = (int) request.getAttribute("/UpdateEmp");
	%>
	<div>
		Add Employee:
		<%=result%></div>
</body>
</html>