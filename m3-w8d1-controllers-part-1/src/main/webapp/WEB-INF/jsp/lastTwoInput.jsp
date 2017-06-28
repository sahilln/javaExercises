<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>

	<h1>Reverse Last Two Characters</h1>
	<c:url var="formAction" value="/lastTwoResult"/>
	<form method="GET" action="${formAction}">
		<label for="word1">Word 1:</label><br>
		<input type="text" name="word1"/><br>
		
		<label for="word2">Word 2:</label><br>
		<input type="text" name="word2"/><br>
		
		<label for="word3">Word 3:</label><br>
		<input type="text" name="word3"/><br>
		
		<label for="word4">Word 4:</label><br>
		<input type="text" name="word4"/><br>
		
		<label for="word5">Word 5:</label><br>
		<input type="text" name="word5"/><br>
		
		<label for="word6">Word 6:</label><br>
		<input type="text" name="word6"/><br>
		
		<label for="word7">Word 7:</label><br>
		<input type="text" name="word7"/><br>
		
		<label for="word8">Word 8:</label><br>
		<input type="text" name="word8"/><br>
		
		<label for="word9">Word 9:</label><br>
		<input type="text" name="word9"/><br>
		
		<label for="word10">Word 10:</label><br>
		<input type="text" name="word10"/><br>
		
		<br>
		
		<input type="submit" value="Submit">
	
	</form>
	
	
</body>
</html>