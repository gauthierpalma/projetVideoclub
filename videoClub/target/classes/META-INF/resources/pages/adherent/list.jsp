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


<title>liste adherents</title>

</head>
<body class="container">
	<h3>
		<t:message code="adherent.list.title"></t:message>
	</h3>
	<a href="add" class="btn btn-link"><t:message
			code="adherent.list.add"></t:message></a>
	<table class="table">
		<tr>
			<th><t:message code="adherent.list.header.id"></t:message></th>
			<th><t:message code="adherent.list.header.title"></t:message></th>
			<th><t:message code="adherent.list.header.name"></t:message></th>
			<th><t:message code="adherent.list.header.firstname"></t:message></th>
			<th><t:message code="adherent.list.header.adress"></t:message></th>

		</tr>
		<tr>
			<c:forEach var="adherent" items="${liste}">
				<td>${adherent.id}</td>
				<td>${adherent.titre}</td>
				<td>${adherent.nom}</td>
				<td>${adherent.prenom}</td>
				<td>${adherent.adresse}</td>


				<td><a class="btn btn-info" href="edit?id=${adherent.id}"><t:message
							code="player.list.edit"></t:message></a></td>
				<td><a class="btn btn-danger" href="delete?id=${adherent.id}"><t:message
							code="player.list.delete"></t:message></a></td>
		</tr>
		</c:forEach>

	</table>


</body>
</html>