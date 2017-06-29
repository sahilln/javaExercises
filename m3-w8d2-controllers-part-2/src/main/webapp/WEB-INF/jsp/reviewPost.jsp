<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Submit A Review</h1>
	<c:url var="formAction" value="/reviewPost"/>
	<form method="POST" action="${formAction}">
	
	<label for="username">Username</label>
	<input type="text" name="username"/><br>
	
	<label for="rating">Rating (1-5 stars)</label>
	<input type="text" name="rating"/><br>
	
	<label for="title">Review Title</label>
	<input type="text" name="title"/><br>
	
	<label for="text">Review Text</label>
	<input type="text" name="text"/><br>
	
	<br>
	
	
	<input type="submit" value="Submit"><br>
	
	</form>