<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="com.lti.controller.BidderController().viewlistedCrops()">

	<form action="goToViewPage.lti" method="post">
		<input type="submit" value="Submit">
	</form>
	<table>
		<c:forEach items="${list }" var="crops">
			<tr>
			<th>FarmerId</th>
			<th>Posting Time</th>
			<th>Expiry Time</th>
			<th>Crop Name</th>
			<tr>
			<td>${crops.farmer.farmerId }</td>
			<td>${crops.postTime}</td>
			<td>${crops.expiryTime}</td>
			<td>${crops.crop.cropName }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>