<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<title>edit</title>
</head>
<body class="container">
	<h3>Edition des adherents</h3>
	<form:form method="post" action="save" modelAttribute="adherent">
		<form:hidden path="version"></form:hidden>
		<div class="form-group">
			<form:label path="id">Id</form:label>
			<form:input path="id" cssClass="form-control" readonly="true" />
		</div>
		<div class="form-group">
			<form:label path="titre">Titre</form:label>
			<form:input path="titre" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="name">Nom</form:label>
			<form:input path="name" cssClass="form-control" />
			<form:errors cssClass="alert alert-danger" path="name">la longueur du nombre de caractère est de 3 minimum</form:errors>
		</div>
		<div class="form-group">
			<form:label path="prenom">Prénom</form:label>
			<form:input path="prenom" cssClass="form-control" />
		</div>

		<div class="form-group">
			<form:label path="adresse">Adresse</form:label>
			<form:select path="adresse" cssClass="form-control"/>
		</div>

		<div class="form-group">
			<form:label path="article">Articles loués</form:label>
			<form:select path="article" cssClass="form-control"
				items="${listeArticle}" />
		</div>


		<div class="form-group">
			<form:label path="team.id">Equipe</form:label>
			<form:select path="team.id" cssClass="form-control">
				<form:option value="">pas d'equipe</form:option>
				<form:options items="${listeteam}" itemLabel="name" itemValue="id" />
				<form:errors path="team.id"></form:errors>
			</form:select>
		</div>

		<div class="form-group">
			<button type="submit" class="btn btn-success">Enregistrer</button>
			<a href="findall" class="btn btn-warning">Annuler</a>
		</div>

	</form:form>



</body>
</html>