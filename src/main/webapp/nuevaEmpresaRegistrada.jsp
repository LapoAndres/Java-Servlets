<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty empresa }">
	Empresa  ${empresa} registrada!  <!--expresion language-->
	</c:if>
	
	<c:if test="${ empty empresa }">
	Ninguna empresa registrada!  <!--expresion language-->
	</c:if>
	
</body>
</html>