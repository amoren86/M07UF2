<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Medicine</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Medicine</h1>
				<p>Add medicine</p>
			</div>
		</div>
	</section>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please, enter your login data</h3>
					</div>
					<div class="panel-body">
						<c:if test="${not empty error}">
							<div class="alert alert-danger">Invalid credentials</div>
						</c:if>
						<form action="<c:url value= "/login"/>" method="post">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="Usuari"
										name="username" type="text">
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Contrasenya"
										name="password" type="password">
								</div>
								<%--
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
							 	--%>
								<input class="btn btn-lg btn-success btn-block" type="submit"
									value="Login">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>