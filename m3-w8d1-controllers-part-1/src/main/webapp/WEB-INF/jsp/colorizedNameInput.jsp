<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>

	<h1>Enter Name</h1>
	<c:url var="formAction" value="/colorizedNameResult"/>
	<form method="GET" action="${formAction}">
		<label for="firstName">First Name:</label><br>
		<input type="text" name="firstName"/><br>
		
		<label for="lastName">Last Name:</label><br>
		<input type="text" name="lastName"/><br>
		
		<br>
		
		<h2></h2>
		
		<input type="checkbox" name="color" value="Red">Red<br>
		<input type="checkbox" name="color" value="Blue">Blue<br>
		<input type="checkbox" name="color" value="Green">Green<br>
		
		<br>
		
		<input type="submit" value="Submit">
		
	</form>

</body>
</html>