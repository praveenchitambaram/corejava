<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteEmployee</title>
</head>
<body>
	<form action="DeleteEmpServlet" method="post">
		<!--need to mention method = post  -->
		<center>
			<div>
				ID : <input type='text' name='id'>
			</div>
			<div>
				<input type=submit name='click' value='DELETE_EMP'>
			</div>
		</center>
	</form>
</body>
</html>