<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	<h1>Colorized Name</h1>

	<p>First Name: ${param.firstName}</p>
	<p>Last Name: ${param.lastName}</p>
	
	<br>
	
	<p style = "color:red">  ${redName}</p>
	<p style = "color:blue">  ${blueName}</p>
	<p style = "color:green">  ${greenName}</p>

</body>
</html>