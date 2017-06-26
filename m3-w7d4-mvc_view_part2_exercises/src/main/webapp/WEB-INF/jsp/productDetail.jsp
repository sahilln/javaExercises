<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="header.jsp"/>

	<img class="pics" src="img/${product.imageName}">
	
	<div class = "toyDescription">
		<div id=name>${product.name}</div>
		<c:choose>
			<c:when test="${product.topSeller}">
				&nbsp;
				<div class="best">BEST SELLER!</div>
			</c:when>
		</c:choose>
						
		<div id=manufacturer>by ${product.manufacturer}</div>
		<img src="img/${Math.round(product.averageRating)}-star.png" style="width: 5em; height: 0.9em;" />
		<br>
		<div style="color: red;">Price: $${product.price}</div> Weight
		${product.weightInLbs} lbs <br> 
		<br>
		<div id="desc"><c:out value="Description: ${product.description}"/></div>
	</div>					
<c:import url="footer.jsp"/>