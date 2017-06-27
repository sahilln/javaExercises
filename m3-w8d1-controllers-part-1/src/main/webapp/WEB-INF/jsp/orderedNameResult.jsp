<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	<h1>Ordered Name</h1>
	<p>First Name: ${param.firstName}</p>
	<p>Middle Initial: ${param.middleInitial}</p>
	<p>Last Name: ${param.lastName}</p>
	<p>Ordered: ${orderedName}</p>
</body>
</html>