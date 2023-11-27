<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
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
		<header class="mt-4 p-5 bg-light bg-gradient rounded">
			<h1>Medicine Stock</h1>
			<p>Medicine detail</p>
		</header>
		<div class="row p-3 g-2">
			<h3>${medicine.name}</h3>
			<h5>${medicine.description}</h5>
			<dl class="row g-1">
				<dt class="col-sm-2">Code:</dt>
				<dd class="col-sm-10">${medicine.medicineId}</dd>
				<dt class="col-sm-2">Lab:</dt>
				<dd class="col-sm-10">${medicine.producer}</dd>
				<dt class="col-sm-2">Category:</dt>
				<dd class="col-sm-10">${medicine.category}</dd>
				<dt class="col-sm-2">Stock:</dt>
				<dd class="col-sm-10">${medicine.stockQuantity}</dd>
				<dt class="col-sm-2">Price:</dt>
				<dd class="col-sm-10">${medicine.price}€</dd>
			</dl>
			<a href="<spring:url value="/medicines/all" />"
				class="col-1 btn btn-secondary"> go back </a>
		</div>
	</div>
</body>
</html>