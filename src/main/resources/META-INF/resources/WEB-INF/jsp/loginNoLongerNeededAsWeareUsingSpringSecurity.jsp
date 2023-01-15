<html>
<head>
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to Our Application</h1>

		<!-- form method = post -> The parameters will not be sent as part of URL. Making more secure -->
		<form method="post">
			<div>
				<b>Name :</b> <input type="text" name="name"> <b>Password
					: </b><input type="password" name="password"> <input
					type="submit">
			</div>
			<pre>${errorMessage}</pre>
		</form>
	</div>
</body>
</html>