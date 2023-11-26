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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
<title>Medicines</title>
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
	<div class="container">
		<header class="mt-4 p-5 bg-light bg-gradient rounded">
			<h1>Medicines</h1>
			<p>List of medicines in stock</p>
		</header>

		<form action="<c:url value= "/login"/>" method="post">

			<div class="container g-2">
				<div class="row justify-content-center overflow-hidden">
					<div class="col-sm-9 col-md-7 col-lg-5 col-xl-4 gy-5">

						<div class="card">

							<div class="card-header">
								<h5 class="card-title">Please, enter your credentials</h5>
							</div>
							<div class="card-body">
								<c:if test="${not empty error}">
									<div class="alert alert-danger alert-dismissible" role="alert">
										<span>The given credentials are wrong</span>
										<button type="button" class="btn-close"
											data-bs-dismiss="alert"></button>
									</div>
								</c:if>

								<div class="input-group py-1">
									<span class="input-group-text">
										<i class="bi bi-person-fill"></i>
									</span>
									<input class="form-control" placeholder="Username"
										name="username" type="text">
								</div>

								<div class="input-group py-1">
									<span class="input-group-text">
										<i class="bi bi-key-fill"></i>
									</span>
									<input class="form-control" placeholder="Password"
										name="password" type="password">
								</div>

							</div>

							<div class="card-footer d-grid">
								<input class="btn btn-secondary" type="submit" value="Login">
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>