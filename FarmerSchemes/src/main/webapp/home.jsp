<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		if(session.getAttribute("fname")!=null){
			out.println("Welcome "+session.getAttribute("fname"));
		}
	%>
	<form action="goToViewPage.lti" method="post">
	<input type="submit" value="Submit">
	</form>
</body>
</html>