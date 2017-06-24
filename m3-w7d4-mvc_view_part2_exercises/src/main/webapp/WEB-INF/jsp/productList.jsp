<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product List View</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<li><a href="productList">List Layout</a></li>
			<li><a href="productTiles">Tiles Layout</a></li>
			<li><a href="productTable">Table Layout</a></li>
		</ul>

	</nav>
	<section id="main-content">
		<h1>Toy Department</h1>

			<c:forEach var="product" items="${productList}">
			<div class = "eachToy">	
				<img class="pic" src="img/${product.imageName}"></td>
					<div class = "toyDescription">
						<div style="font-weight: bold";">${product.name}</div>

						<div style="color: gray;">by ${product.manufacturer}</div>

						<div style="color: red;">$${product.price}</div> Weight
						${product.weightInLbs} lbs <br> 
						
						<c:choose>
							<c:when
								test="${product.averageRating >= 4.5}">
								<img src="img/5-star.png" style="width: 5em; height: 0.9em;" />
							</c:when>
							<c:when
								test="${product.averageRating >= 3.5 && product.averageRating < 4.5}">
								<img src="img/4-star.png" style="width: 5em; height: 0.9em;" />
							</c:when>
							<c:when
								test="${product.averageRating >= 2.5 && product.averageRating < 3.5}">
								<img src="img/3-star.png" style="width: 5em; height: 0.9em;" />
							</c:when>
							<c:when
								test="${product.averageRating >= 1.5 && product.averageRating < 2.5}">
								<img src="img/2-star.png" style="width: 5em; height: 0.9em;" />
							</c:when>
							<c:when
								test="${product.averageRating >= 0.5 && product.averageRating < 1.5}">
								<img src="img/1-star.png" style="width: 5em; height: 0.9em;" />
							</c:when>
						</c:choose>
						</div>
					</div>
			</c:forEach>
	</section>
</body>
</html>