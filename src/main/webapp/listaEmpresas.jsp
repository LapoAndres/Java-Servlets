<%@page import="java.util.List,com.alura.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard TAGLIB</title>
</head>
<body>
		Lista de Empresas <br/>
		<ul>
			<c:forEach items="${empresas}" var="empresa">
			
				<li> ${empresa.nombre} - <fmt:formatDate value="${empresa.fechaAbertura }" pattern="dd/mm/yyyy" /></li>	
			</c:forEach>
		</ul>
</body>
</html>