<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
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
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-md-5">
				<h3>${medicine.name}</h3>
				<p>${medicine.description}</p>
				<p>
					<strong>Code:</strong> ${medicine.medicineId}
				</p>
				<p>
					<strong>Lab:</strong> ${medicine.producer}
				</p>
				<p>
					<strong>Category:</strong> ${medicine.category}
				</p>
				<p>
					<strong>Stock:</strong> ${medicine.stockQuantity}
				</p>
				<h4>${medicine.price} €</h4>
				<a href="<spring:url value="/medicines/all" />"
					class="btn btn−default">
					<span class="glyphicon−hand−left glyphicon"></span>
					go back
				</a>
			</div>
		</div>
	</section>
</body>
</html>