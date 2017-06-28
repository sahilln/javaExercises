<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Squirrel Parties for Dummies</title>
	</head>
	<body>
		<h1>Squirrel Parties for Dummies</h1>
		<p>Marketing Copy</p>
		
		<c:forEach var="review" items="${reviewList}">
			<h4>${review.title} (${review.username})</h4>
			<p>${review.text}</p>
			<p>${review.rating}</p>
			<hr>
		</c:forEach>
	</body>
</html>