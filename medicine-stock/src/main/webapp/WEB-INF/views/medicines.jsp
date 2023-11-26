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
			<p>List of medicines in stock</p>
		</header>
		<div class="row">
			<c:forEach items="${medicines}" var="medicine">
				<div class="col-sm-6 col-md-3 my-5">
					<div class="card">
						<div class="card-header">
							<h5>${medicine.name}</h5>
						</div>
						<div class="card-body">
							<p class="card-text">${medicine.description}</p>
							<p class="card-text">${medicine.price}€</p>
							<p class="card-text">There is ${medicine.stockQuantity} units in stock</p>
							<a class="btn btn-secondary"
								href="<spring:url value="/medicines/medicine?codi=${medicine.medicineId}" />">Details</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>