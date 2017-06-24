<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
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
		<c:forEach var="product" items="${productList}">
        <img src="img/${product.imageName}">
		</c:forEach>
    </section>
</body>
</html>