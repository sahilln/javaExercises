<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Squirrel Parties for Dummies</title>
	</head>
	<body>
		<img src="img/forDummies.png">
		<h1>Squirrel Parties for Dummies</h1>
		
		
		<c:url var="reviewPost" value="/reviewPost"/>
		<a href="${reviewPost}"> Post a Review</a>
		<hr>
		
		<h2>List of Reviews</h2>
		
		<c:forEach var="review" items="${reviewList}">
			<h3>${review.title}</h3>
			<h4>by (${review.username})</h4>
			<p>${review.text}</p>
			
			<c:forEach begin="1" end="${review.rating}" varStatus="loop">
				<img src ="img/star.png">
			</c:forEach>

			<hr>
		</c:forEach>
	</body>
</html>