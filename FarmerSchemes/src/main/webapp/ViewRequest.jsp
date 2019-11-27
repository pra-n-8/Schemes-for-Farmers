<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/View.css">
<title>View Requests Page</title>
</head>
<body>
	<%
		if (session != null) {
			out.println("<h1>Welcome ," + session.getAttribute("farmer.getfarmerName()") + "</h1>");
		} else {
			out.println("<h1>Login to view CropDetails</h1>");
		}
	%>
	
	<ul class="right">
	<li><a href="logout.lti">Logout</a></li>
		<li><a class="active" href="FarmerWelcome.jsp">Home</a></li>
	</ul>
	<section>
	<table>
		<tr>
			<th>Crop id</th>
			<th>Crop Name</th>
			<th>Crop type</th>
			<th>FertilizerType</th>
		</tr>
		<c:forEach items="${Crops}" var="crops">
			<tr>
				<td>${crops.cropId }</td>
				<td>${crops.cropName }</td>
				<td>${crops.cropType }</td>
				<td>${crops.fertilizerType }</td>
			</tr>
		</c:forEach>
	</table>
	<form action="putOnSale.lti" method="post">
	<input type="number" placeholder="enter id to put on sale" name="cropId">
	<input type="submit" value="Put on Sale" />
	</form>
</body>
</html>