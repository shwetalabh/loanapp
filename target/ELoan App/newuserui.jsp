<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- read user name and password from user to create account
	     and send to usercontrollers registeruser method
	-->
	<div align=center>
		<h2>eLoan - Register Now</h2>
		<form action="user?action=registerNewUser" method="post">
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
					<label for="panNumber">Enter PanNumber</label>
				</div>
				<div>
					<input type="text" id="panNumber" name="panNumber">
				</div>
			</div>
			<div>
				<div>
					<label for="panNumber">Enter PanNumber</label>
				</div>
				<div>
					<input type="text" id="panNumber" name="panNumber">
				</div>
			</div>
			<div>
				<div>
					<label for="adhaar">Enter Adhaar Number</label>
				</div>
				<div>
					<input type="text" id="adhaar" name="adhaar">
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
					<label for="confirmPassword">Confirm password</label>
				</div>
				<div>
					<input type="password" id="confirmPassword" name="confirmPassword">
				</div>
			</div>

			<div>
				<div>
					<input type="submit" value="Login">
				</div>
			</div>
		</form>
	</div>

</body>
</html>