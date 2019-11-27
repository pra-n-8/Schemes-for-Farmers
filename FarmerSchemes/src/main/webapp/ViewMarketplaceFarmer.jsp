<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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