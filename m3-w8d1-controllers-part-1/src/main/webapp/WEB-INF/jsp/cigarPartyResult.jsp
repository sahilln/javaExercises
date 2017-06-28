<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	<c:choose>
		<c:when test="${isSuccessful == true}">
			<h1>Great Party!!!</h1><br>
			<img src="img/happy-squirrel.png">
		</c:when>
		<c:when test="${isSuccessful == false}">
			<h1>UGH!!!</h1><br>
			<img src="img/sad-squirrel.png">
		</c:when>
	
	</c:choose>
	
</body>
</html>