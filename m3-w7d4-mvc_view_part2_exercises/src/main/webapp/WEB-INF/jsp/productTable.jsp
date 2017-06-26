<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="header.jsp"/>

<h1>Toy Department</h1>
    <section id="main-content">

	<table class="table">
	
		<tr>
		<td id="title"></td>
		<c:forEach var="product" items="${productList}">
			<td> <img class = "pic" src="img/${product.imageName}">
			<c:choose>
				<c:when test="${product.topSeller}">
				<div class="best">BEST SELLER!</div>
				</c:when>
			</c:choose>
			</td>
		</c:forEach>
		</tr>
		
		<tr>
		<td id="title"> Name </td>
		<c:forEach var="product" items="${productList}">
		<td class="even">${product.name}</td>
		</c:forEach>
		</tr>
		
		<tr>
		<td id="title"> Rating </td>
		<c:forEach var="product" items="${productList}">
		<td class="odd"><img src="img/${Math.round(product.averageRating)}-star.png" style="width: 5em; height: 0.9em;" /></td>
		</c:forEach>
		</tr>
		
		<tr>
		<td id="title"> Mfr </td>
		<c:forEach var="product" items="${productList}">
		<td class="even">${product.manufacturer}</td>
		</c:forEach>
		</tr>
		
		<tr>
		<td id="title"> Price </td>
		<c:forEach var="product" items="${productList}">
		<td class="odd" style= "color: red;">$${product.price}</td>
		</c:forEach>
		</tr>
		
		<tr>
		<td id="title"> wt. (in lbs) </td>
		<c:forEach var="product" items="${productList}">
		<td class="even">${product.weightInLbs}</td>
		</c:forEach>
		</tr>
	
	
	</table>

<c:import url="footer.jsp"/>