<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/View.css">
<title>View Bidder's Marketplace</title>
</head>
<body>
<ul class="right">
	<li><a href="logout.lti">Logout</a></li>
		<li><a class="active" href="BidderWelcome.jsp">Home</a></li>
	</ul>
	<table border="1">
		<tr>
			<th>Listing Id</th>
			<th>Crop Name</th>
			<th>Crop type</th>
			<th>Fertilizer Used</th>
			<th>Bid Amount</th>
		</tr>
		<c:forEach items="${list}" var="crops">
			<tr>
			<td>${crops.listingId }</td>
			<td>${ crops.crop.cropName}</td>
			<td>${ crops.crop.cropType}</td>
			<td>${ crops.crop.fertilizerType}</td>
			<td>${crops.basePrice }</td>
			</tr>
		</c:forEach>
	</table>
	<form action="bidForcrop.lti" method="post">
	<input type="number" placeholder="Enter Listing id" name="listingId" class="quantity" required="required"/>
	<input type="number" placeholder="Enter Amount" name="Amount" class="quantity" required="required"/>
	<h4 class="error">${Error}</h4>
		<input type="submit" value="Submit">
	</form>
</body>
</html>