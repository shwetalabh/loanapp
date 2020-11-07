<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- write the code to display the loan status information 
	     received from usercontrollers' displaystatus method
	-->

	<jsp:include page="header.jsp" />
	<div align="right">
		<a href="index.jsp">Logout</a>
	</div>
	<div align="center">
		<h4>Loan Submitted</h4>
		<p>Application Number: ${appNum}</p>
		<a href="editloan.jsp">Edit Loan Application</a>
	</div>
	<jsp:include page="footer.jsp" />


</body>
</html>