<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>

	<h1>Baby Lotto</h1>
	<c:url var="formAction" value="/babyLottoResult"/>
	<form method="GET" action="${formAction}">
	
	<p> Enter three comma delimited number for each ticket. </p>
	
	<label for="ticket1">Ticket 1:</label><br>
	<input type="text" name="ticket1"/><br>
	
	<label for="ticket2">Ticket 2:</label><br>
	<input type="text" name="ticket2"/><br>
	
	<label for="ticket3">Ticket 3:</label><br>
	<input type="text" name="ticket3"/><br>
	
	<label for="ticket4">Ticket 4:</label><br>
	<input type="text" name="ticket4"/><br>
	
	<label for="ticket5">Ticket 5:</label><br>
	<input type="text" name="ticket5"/><br>
	
	<br>
	
	<input type="submit" value="Submit">

	</form>

</body>
</html>