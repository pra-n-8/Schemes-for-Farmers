<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Farmer's Marketplace</title>
<link rel="stylesheet" type="text/css" href="css/View.css">
</head>
<body>

<ul class="right">
	<li><a href="logout.lti">Logout</a></li>
		<li><a class="active" href="FarmerWelcome.jsp">Home</a></li>
	</ul>

	<table border="1">
	<tr>
			<th>Listing Id</th>
			<th>Crop Name</th>
			<th>Crop Type</th>
			<th>Fertilizer Type</th>
			<th>Expiry Time</th>
			<tr>
		<c:forEach items="${Crops}" var="crops">
			<td>${crops.listingId }</td>
			<td>${crops.crop.cropName }</td>
			<td>${crops.crop.cropType }</td>
			<td>${crops.crop.fertilizerType}</td>
			<td>${crops.expiryTime }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>