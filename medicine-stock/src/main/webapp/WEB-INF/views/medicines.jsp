<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
<<<<<<< HEAD
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
=======
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/
css/bootstrap.min.css">
>>>>>>> refs/remotes/origin/master
<title>Medicines</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Medicines</h1>
				<p>List of medicines in stock</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${medicines}" var="medicine">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${medicine.name}</h3>
							<p>${medicine.description}</p>
							<p>${medicine.price} €</p>
							<p>There is ${medicine.stockQuantity} units in stock</p>
							<p>
								<a
									href=" <spring:url value= "/medicines/medicine?codi=${medicine.medicineId}" /> "
									class="btn btn−primary">
									<span class="glyphicon−info−signglyphicon" /></span>
									Detail
								</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>