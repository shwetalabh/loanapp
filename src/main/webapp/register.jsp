<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<hr />
	<div align=center>
		<h2>eLoan Login</h2>
		<form action="user?action=validate" method="post">
			<div>
				<div>
					<label for="email">Enter login Id</label>
				</div>
				<div>
					<input type="text" id="email" name="email">
				</div>
			</div>
			<div>
				<div>
					<label for="password">Enter password</label>
				</div>
				<div>
					<input type="password" id="password" name="password">
				</div>
			</div>

			<div>
				<div>
					<input type="submit" value="Login">
				</div>
			</div>
			<a href="newuserui.jsp">New User? register here</a>
		</form>
	</div>
	<hr />
	<jsp:include page="footer.jsp" />
</body>
</html>