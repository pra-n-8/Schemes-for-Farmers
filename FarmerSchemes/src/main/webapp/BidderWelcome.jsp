<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=ISO-8859-1">
<title>Bidder Home</title>
<link rel="stylesheet" type="text/css" href="css/InsideHome.css">
</head>
<body>
	<ul class="right">
	<li><a href="logout.lti">Logout</a></li>
		<li><a class="active" href="BidderWelcome.jsp">Home</a></li>
	</ul>
	<section>
<div class="container">
 
 <%
		if (session != null) {
			out.println("<h1 align=\"center\">WELCOME " + session.getAttribute("bname") + "</h1>");
		}
		else{
			
		}
	%>

	<section>
		<div class="container">
			
			<form method="post" action="viewcrops.lti">
				<div>
					<input type="submit"  value="View MarketPlace" />
				</div>
			</form>
			</div>
	</section>
</div>
</section>
</body>
</html>
