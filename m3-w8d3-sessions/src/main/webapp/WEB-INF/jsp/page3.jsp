<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<h1>Favorite Things Exercise</h1>

	<form method="POST" action="page3">

		<h3><c:out value = "What is your favorite season?"/></h3>
		
		<input type="radio" name="season" value="Spring"/> Spring 
		<input type="radio" name="season" value="Summer"/> Summer 
		<input type="radio" name="season" value="Fall"/> Fall 
		<input type="radio" name="season" value="Winter"/> Winter 
		<br>
		<br>
	
		<input class="formSubmitButton" type="submit" value="Next >>>" />
		
	</form>