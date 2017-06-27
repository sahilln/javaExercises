<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>

	<h1>FizzBuzz Revisited</h1>
	<c:url var="formAction" value="/fizzBuzzResult"/>
	<form method="GET" action="${formAction}">
		<label for="divisableby1">Divisable by:</label><br>
		<input type="text" name="divisableby1"/><br>
		
		<label for="divisableby2">Divisable by:</label><br>
		<input type="text" name="divisableby2"/><br>
		
		<label for="altFizz">Alternative Fizz:</label><br>
		<input type="text" name="altFizz"/><br>
		
		<label for="altBuzz">Alternative Buzz:</label><br>
		<input type="text" name="altBuzz"/><br>
		
		<br>
		
		<label for="number1">Number 1:</label>
		<input type="text" name="number1"/><br>
		<label for="number2">Number 2:</label>
		<input type="text" name="number2"/><br>
		<label for="number3">Number 3:</label>
		<input type="text" name="number3"/><br>
		<label for="number4">Number 4:</label>
		<input type="text" name="number4"/><br>
		<label for="number5">Number 5:</label>
		<input type="text" name="number5"/><br>
		
		<br>
		
		<input type="submit" value="Submit">
	
	</form>
	
	
</body>
</html>