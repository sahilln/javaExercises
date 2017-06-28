<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>

	<h1>Squirrel Cigar Party</h1>
	<c:url var="formAction" value="/cigarPartyResult"/>
	<form method="GET" action="${formAction}">
	
	<img src="img/smoking-squirrel.png">
	
	<br>
	
	<label for="squirrelNumber">Number of Squirrels:</label><br>
	<input type="text" name="squirrelNumber"/><br>
	
	<br>
	
	<input type="checkbox" name="weekend" value="True">Is this the weekend?<br>
	
	<br>
	
	<input type="submit" value="Submit">
	
	</form>
	
</body>
</html>