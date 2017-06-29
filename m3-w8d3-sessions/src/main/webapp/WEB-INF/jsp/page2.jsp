<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<h1>Favorite Things Exercise</h1>

	<form method="POST" action="page2">

		<h3><c:out value = "What is your favorite food?"/></h3>

		<label for="food"></label> 
		<input type="text" name="food" /><br>
	
		<br>
	
		<input class="formSubmitButton" type="submit" value="Next >>>" />
		
	</form>