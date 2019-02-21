<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="t" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


<title>liste films</title>

</head>
<body class="container">
	<h3>
		<t:message code="film.list.title"></t:message>
	</h3>
<%-- 	<a href="add" class="btn btn-link"><t:message --%>
<%-- 			code="player.list.add"></t:message></a> --%>
	<table class="table">
		<tr>
			<th><t:message code="film.list.header.name"></t:message></th>
			<th><t:message code="film.list.header.date"></t:message></th>
			<th><t:message code="film.list.header.realisateurs"></t:message></th>

		</tr>
		<tr>
			<c:forEach var="film" items="${liste}">

				<td>${film.name}</td>

				<td><fmt:formatDate value="${film.dateSortie}"
						pattern="dd/MM/yyyy" /></td>
				<td>${film.listeRealisateur.name}</td>

<%-- 				<td><a class="btn btn-info" href="edit?id=${film.name}"><t:message --%>
<%-- 							code="player.list.edit"></t:message></a></td> --%>
<%-- 				<td><a class="btn btn-danger" href="delete?id=${film.name}"><t:message --%>
<%-- 							code="player.list.delete"></t:message></a></td> --%>
		</tr>
		</c:forEach>

	</table>


</body>
</html>