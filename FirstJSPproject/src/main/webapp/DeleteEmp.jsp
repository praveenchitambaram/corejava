<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Emp</title>
</head>
<body>
<body>
<%
  int result = (int)request.getAttribute("DeleteEmployee");
  %>
  <div>Delete Employee: <%=result%></div>
</body>
</body>
</html>