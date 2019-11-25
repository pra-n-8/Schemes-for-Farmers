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
	<form action="viewcrops.lti" method="post">
		<input type="submit" value="Submit">
	</form>
	<table border="1">
		<tr>
			<th>Listig Id</th>
			<th>Posting Time</th>
			<th>Crop Name</th>
			<th>Crop type</th>
			<th>Fertilizer Used</th>
		</tr>
		<c:forEach items="${list }" var="crops">
			<tr>
			<td>${crops.listingId }</td>
			<td>${crops.crop.cropName }</td>
			<td>${crops.crop.cropType }</td>
			<td>${crops.crop.fertilizerType}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>