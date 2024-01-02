<!DOCTYPE html>
<%
	//scriptlet
	String empresa = (String)request.getAttribute("empresa"); //Casting
	System.out.println(empresa);
%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Empresa  <%=empresa%> registrada!
</body>
</html>