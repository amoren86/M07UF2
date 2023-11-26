<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Medicines</title>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
	<div class="container">
		<header
			class="d-flex justify-content-between mt-4 p-5 bg-light bg-gradient rounded">
			<div>
				<h1>Medicine Stock</h1>
				<p>Add new medicine</p>
			</div>
			<div class="p-4">
				<a href="?language=ca">Català</a>
				<a href="?language=en">English</a>
				<a href="<spring:url value="/logout"/>"
					class="btn btn-secondary btn-mini">logout</a>
			</div>
		</header>
		<fieldset class="p-1">
			<legend>Add medicine</legend>
			<form:form modelAttribute="newMedicine" class="row g-3">

				<div class="col-auto">
					<label class="form-label" for="medicineId"> <spring:message
							code="addMedicament.form.medicamentId.label" />
					</label>
					<form:input id="medicineId" path="medicineId" type="text"
						class="form-control" />
				</div>
				<div class="col-auto">
					<label class="form-label" for="name"> <spring:message
							code="addMedicament.form.name.label" />
					</label>
					<form:input id="name" path="name" type="text" class="form-control" />
				</div>
				<div class="col-auto">
					<label class="form-label" for="price"> <spring:message
							code="addMedicament.form.price.label" />
					</label>
					<form:input id="price" path="price" type="number" min="0.00"
						max="10000.00" step="0.01" class="form-control" />
				</div>
				<div class="col-auto">
					<label class="form-label" for="producer"> <spring:message
							code="addMedicament.form.producer.label" />
					</label>
					<form:input id="producer" path="producer" type="text"
						class="form-control" />
				</div>
				<div class="col-auto">
					<label class="form-label" for="category"> <spring:message
							code="addMedicament.form.category.label" />
					</label>
					<form:input id="category" path="category" type="text"
						class="form-control" />
				</div>
				<div class="col-auto">
					<label class="form-label" for="stockQuantity">Stock
						quantity</label>
					<form:input id="stockQuantity" path="stockQuantity" type="number"
						class="form-control" />
				</div>
				<%-- 
				<div class="col-auto">
					<label class="form-label" for="stockInOrder">Stock
						in order</label>
						<form:input  type="number"  id="stockInOrder" path="stockInOrder" type="text"
							class="form-control" />
				</div>
				--%>
				<div class="col-5">
					<label class="form-label" for="description">Description</label>
					<form:textarea id="description" path="description" rows="2"
						class="form-control" />
				</div>
				<div class="col-auto">
					<label class="form-label" for="active">Active</label>
					<div class="form-check">
						<form:radiobutton class="form-check-input" path="active"
							value="true" />
						<label class="form-check-label" for="flexRadioDefault1">
							Yes </label>
					</div>
					<div class="form-check">
						<form:radiobutton class="form-check-input" path="active"
							value="false" />
						<label class="form-check-label" for="flexRadioDefault1">
							No </label>
					</div>
				</div>
				<div>
					<input type="submit" id="btnAdd" class="btn btn-secondary"
						value="Crear" />
				</div>
			</form:form>
		</fieldset>
	</div>
</body>
</html>