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
	  <h1> Toy Department </h1>
	  
	  <table>
			<c:forEach var="product" items="${productList}">
				<tr>
					<td><img src = "img/${product.imageName}"></td>
					<td> <div style="font-weight:bold";">${product.name} </div>
					    <div style="color:gray;">by ${product.manufacturer} </div>
					    <div style="color:red;">$${product.price} </div>
					    Weight ${product.weightInLbs} lbs
					    <c:choose>
					    <c:when test="${product.averageRating} >= 4 && ${product.averageRating } < 5}"
					      img src = img/1-star.png"
					    </c:when>
					    </c:choose>
					    <%-- <img src = "img/${product.averageRating}"> --%>
					</td>
				</tr>
			</c:forEach>
		</table>  
    </section>
</body>
</html>