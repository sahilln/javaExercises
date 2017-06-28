<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	<h1>FizzBuzz Revisited</h1>
	
	<p>Divisable By: ${param.divisableby1}</p>
	<p>Divisable By: ${param.divisableby2}</p>
	
	<p>Alternative Fizz: ${param.altFizz}</p>
	<p>Alternative Buzz: ${param.altBuzz}</p>
	
	<c:forEach items="${fizzBuzzAlt}" var="item">
    	${item}<br>
	</c:forEach>
	
</body>
</html>