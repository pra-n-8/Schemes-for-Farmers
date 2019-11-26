<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MarketPlace</title>
</head>
<body>
<table>
<tr>
<th> Listing_id </th>
<th>Farmer_id</th>
<th>Farmer Name</th>
<th>Base Price</th>
<th>Bidder_id</th>
<th>Bidder Name</th>
<th>Max_Bid</th>
<th>Crop_Id</th>
<th>Quantity</th>
</tr>
<c:forEach var="s" items="${cropsListing}">
			<tr>
				<td><c:out value="${s.get() }"></c:out></td>
				<td><c:out value="${s.getCropName() }"></c:out></td>
				<td><c:out value="${s.getCropType() }"></c:out></td>
				<td><c:out value="${s.getFertilizerType() }"></c:out></td>
				<td><c:out value="${s.getQuantity() }"></c:out></td>
				<td><c:out value="${s.getMaxBid() }"></c:out></td>
				<td><c:out value="${s.getDate_To() }"></c:out></td>
			</tr>

		</c:forEach></table>
</body>
</html>