<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Exercise 2 - Fibonacci 25</title>
<style>
li {
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>Exercise 2 - Fibonacci 25</h1>
	<ul>
		<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
		<c:set var="fibo1" value="1" />
		<c:set var="fibo2" value="1" />
		<c:set var="fibonacci" value="1" />
		<li>${1}</li>
		<c:forEach begin="1" end="24" var="count">
			<c:set var="fibonacci" value="${fibo1 + fibo2}" />
			<c:set var="fibo1" value="${fibo2}" />
			<c:set var="fibo2" value="${fibonacci}" />
			<li>${fibonacci}</li>
		</c:forEach>

	</ul>
</body>
</html>