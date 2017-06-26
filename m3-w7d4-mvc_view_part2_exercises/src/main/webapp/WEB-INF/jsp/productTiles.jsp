<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="header.jsp"/>
	<h1>Toy Department</h1>
	
<div class = wrapper>
	<c:forEach var="product" items="${productList}">
			<div class = "tile">	
				<c:url var="productLink" value="/productDetail">
					<c:param name="productId" value="${product.productId}"/>
				</c:url>
				<a href="${productLink}">
					<img class="pic" src="img/${product.imageName}">
				</a>	
						<br><div class="pname">${product.name}</div>
						<c:choose>
							<c:when test="${product.topSeller}">
							&nbsp;
							<div class="bs">BEST SELLER!</div>
							</c:when>
						</c:choose>
						<div id=manufacturer>by ${product.manufacturer}</div>

						<c:choose>
							<c:when test="${product.remainingStock < 5}">
								<div class="inventory">Only ${product.remainingStock} left!</div>
							</c:when>
						</c:choose>

						<br><div style="color: red;">$${product.price}</div> Weight
						${product.weightInLbs} lbs <br> 
						
						<img src="img/${Math.round(product.averageRating)}-star.png" style="width: 5em; height: 0.9em;" />
						
						
					</div>
			</c:forEach>
</div>

<c:import url="footer.jsp"/>