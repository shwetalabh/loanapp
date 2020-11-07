<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application Form</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body onload="myFunction()">

	<div align=center>
		<h2>eLoan - Loan Application Form</h2>
		<form action="user?action=placeloan" method="post">
			<!-- <div>
				<div>
					<label for="loanName">Loan Name</label>
				</div>
				<div>
					<input type="text" id="loanName" name="loanName" required>
				</div>
			</div> -->

			<div>
				<div>
					<label for="amtReq">Amount Requested</label>
				</div>
				<div>
					<input type="text" id="amtReq" name="amtReq">
				</div>
			</div>

			<div>
				<div>
					<label for="email">Email</label>
				</div>
				<div>
					<input type="text" id="email" name="email">
				</div>
			</div>

			<div>
				<div>
					<label for="mob">Mobile Number</label>
				</div>
				<div>
					<input type="text" id="mob" name="mob">
				</div>
			</div>

			<div>
				<div>
					<label for="address">Address</label>
				</div>
				<div>
					<input type="text" id="address" name="address">
				</div>
			</div>


			<div>
				<div>
					<label for="busStruct1">Individual</label>
				</div>
				<div>
					<input type="radio" id="busStruct1" name="structure">
				</div>
				<div>
					<label for="busStruct2">Organisation</label>
				</div>
				<div>
					<input type="radio" id="busStruct2" name="structure">
				</div>
			</div>

			<div>
				<div>
					<label for="isSalaried">Salaried?</label>
				</div>
				<div>
					<input type="checkbox" id="isSalaried" name="isSalaried">
				</div>
			</div>
			
			<div>
				<div>
					<label for="isTaxPayer">Tax Payer?</label>
				</div>
				<div>
					<input type="checkbox" id="isTaxPayer" name="isTaxPayer">
				</div>
			</div>

			<div>
				<div>
					<input type="submit" value="Apply Loan">
				</div>
			</div>
		</form>
	</div>


</body>
</html>