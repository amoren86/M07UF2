<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/
css/bootstrap.min.css">
<title>Medicines</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Medicine</h1>
				<p>Add medicine</p>
				<a href="<spring:url value="/logout"/>"
					class="btn btndanger btn-mini pull-right">logout</a>
				<div class="pull−right" style="padding−right: 50px">
					<a href="?language=ca">Català</a>
					<a href="?language=en">English</a>
				</div>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="newMedicine" class="form-horizontal">
			<fieldset>
				<legend>Add medicine</legend>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="medicineId">
						<spring:message code="addMedicament.form.medicamentId.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="medicineId" path="medicineId" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name">
						<spring:message code="addMedicament.form.name.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="price">
						<spring:message code="addMedicament.form.price.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="price" path="price" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="producer">
						<spring:message code="addMedicament.form.producer.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="producer" path="producer" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="category">
						<spring:message code="addMedicament.form.category.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="category" path="category" type="text"
							class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="stockQuantity">Stock
						quantity</label>
					<div class="col-lg-10">
						<form:input id="stockQuantity" path="stockQuantity" type="text"
							class="form:input-large" />
					</div>
				</div>
				<%-- 
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="stockInOrder">Stock
						in order</label>
					<div class="col-lg-10">
						<form:input id="stockInOrder" path="stockInOrder" type="text"
							class="form:input-large" />
					</div>
				</div>
				--%>
				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows="2" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="active">Active</label>
					<div class="col-lg-10">
						<form:radiobutton path="active" value="true" />
						Yes
						<form:radiobutton path="active" value="false" />
						No
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Crear" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>