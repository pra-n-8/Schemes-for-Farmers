

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="WEB-INF/css/main.css">
</head>
<body>

<div class="left-panel">
<c:forEach items="${searchList}" var="CropDetails">
<div>
	<h1>Product Name: <c:out value="${CropDetails.cropName }"/></h1><br>
	
	<%-- <h1>Product Name: <c:out value="${product[0]}"/></h1><br>
	<h2>Price: <c:out value="${product[1]}"/></h2><br>
	Product Description:<c:out value="${product[2] }"></c:out><br>
	Category<c:out value="${product[3]}"/><br>
	Sub Category<c:out value="${product[4]}"/><br> 
	Brand:<c:out value="${product[5]}"/><br>  --%>
</div>
</c:forEach>
	</div>

<div class="right-panel">456</div>
</body>
</html>
