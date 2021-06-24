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

<%// response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
//response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
//response.setHeader("Expires", "0"); // Proxies.
//response.sendRedirect("patient_login");
%>
				<a href="/logout">logout</a>
				<h1>Welcome Mr.${patientm.name} </h1>
				
				<br>
				<a href="/appointments?id=${patientm.patient_id }">See Appointments</a>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								
								<th>Depatment</th>
						
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${departments }">
								<tr>
									<td><a href="/doctorfordep?id=${user.department_id }&idd=${patientm.patient_id}">${user.name}</a></td>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

</body>
</html>