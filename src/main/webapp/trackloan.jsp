<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application Tracker</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<hr />
	<div align=center>
		<h2>Track Loan</h2>
		<form action="user?action=trackloan" method="post">
			<div>
				<div>
					<label for="appNum">Enter Application Number</label>
				</div>
				<div>
					<input type="text" id="appNum" name="appNum">
				</div>
			</div>

			<div>
				<div>
					<input type="submit" value="Track">
				</div>
			</div>
		</form>
	</div>
	<hr />
	<jsp:include page="footer.jsp" />

</body>
</html>