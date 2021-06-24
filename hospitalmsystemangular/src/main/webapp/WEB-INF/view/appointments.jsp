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

			<h3>All Aooiintments for You</h3>
				<h1>Welcome Mr.${patientm.name} </h1>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Appointment Id</th>
								<th>Patient_Id</th>
								<th>Doctor_Id</th>
								<th>datetime</th>
								<th>feedback</th>
								<th>description</th>
								<th>Prescription</th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.appointment_id}</td>
									<td>${user.patient_id}</td>
									<td>${user.doctor_id}</td>
									<td>${user.datetime}</td>
								
									<td><a href="/feedback_push?id=${user.appointment_id}&idd=${user.patient_id}"><span
											class="glyphicon glyphicon-pencil"></span>feedback</a></td>
									<td>${user.description}</td>
									<td>${user.prescription}</td>
									
									
									
						
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

</body>
</html>