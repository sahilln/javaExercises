<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<h1>Favorite Things Exercise</h1>

	<form method="POST" action="page1">

		<h3><c:out value = "What is your favorite color?"/></h3>

		<label for="color"></label> 
		<input type="text" name="color" /><br>
	
		<br>
	
		<input class="formSubmitButton" type="submit" value="Next >>>" />
		
	</form>