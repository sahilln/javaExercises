<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>

	<h1>Ordered Name Input</h1>
	<c:url var="formAction" value="/orderedNameResult"/>
	<form method="GET" action="${formAction}">
		<label for="firstName">First Name:</label><br>
		<input type="text" name="firstName"/><br>
		
		<label for="middleInitial">Middle Initial:</label><br>
		<input type="text" name="middleInitial"/><br>
		
		<label for="lastName">Last Name:</label><br>
		<input type="text" name="lastName"/><br>
		
		<br>
		
		<input type="radio" name="order" value="FL">First Last<br>
		<input type="radio" name="order" value="FML">First MI Last<br>
		<input type="radio" name="order" value="LF">Last, First<br>
		<input type="radio" name="order" value="LFM">Last, First, MI<br>
		
		<br>
		
		<input type="submit" value="Send it!">
		
	</form>

</body>
</html>