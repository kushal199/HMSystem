<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<div class="container text-center" id="tasksDiv">
				<h3>All Doctors</h3>
				<h1>Welcome Mr.${patientm.name} </h1>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Doctor_Id</th>
								<th>UserName</th>
								<th>First Name</th>
								<th>LastName</th>
								<th>Dob</th>
								<th>Department_id</th>
								<th>address</th>
								<th>email</th>
								<th>active</th>
							
								<th>Book Appointment</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.doctor_id}</td>
									<td>${user.username}</td>
									<td>${user.firstname}</td>
									<td>${user.lastname}</td>
								
									<td>${user.dob}</td>
									<td>${user.department_id}</td>
									<td>${user.address}</td>
									<td>${user.email}</td>
									<td>${user.active}</td>
									
									
									
						
									<td><a href="/book_appointment?id=${user.doctor_id }&idd=${patient_id}"><span
											class="glyphicon glyphicon-pencil"></span>Book Appointment</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

</body>
</html>