<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Student</title>
</head>

<body>

	<div class="container">

		<h3>Student Portal</h3>
		<hr>

		<p class="h4 mb-4">Update Student Details</p>

		<form action="/CollegeFestRegistration/students/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Student.id}" />

			<div class="form-inline">
				<input type="text" name="firstName" value="${Student.firstName}"
					class="form-control mb-4 col-4">
			</div>

			<div class="form-inline">
				<input type="text" name="lastName" value="${Student.lastName}"
					class="form-control mb-4 col-4">
			</div>

			<div class="form-inline">
				<input type="text" name="course" value="${Student.course}"
					class="form-control mb-4 col-4">
			</div>

			<div class="form-inline">
				<input type="text" name="country" value="${Student.country}"
					class="form-control mb-4 col-4">
			</div>

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/CollegeFestRegistration/students/list">Back to Main
			College Portal</a>

	</div>
</body>

</html>










