<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<h1>Patient Registration</h1>
<form:form class="form-horizontal" method="POST" action="/save_patient" modelAttribute="patient">
					<form:input path="patient_id" type="hidden" name="patient_id" value="" />
					<div class="form-group">
						<label class="control-label col-md-3">username</label>
						<div class="col-md-7">
							<form:input path="username" type="text" class="form-control" name="username"
								value="${patient.username}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">password</label>
						<div class="col-md-7">
							<form:input path="password" type="text" class="form-control" name="password"
								value="${patient.password}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">name</label>
						<div class="col-md-7">
							<form:input path="name" type="text" class="form-control" name="name"
								value="${patient.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">address</label>
						<div class="col-md-7">
							<form:input path="address" type="address" class="form-control" name="address"
								value="" />
						</div>
					</div>
					
					
					
					<div class="form-group">
						<label class="control-label col-md-3">dob</label>
						<div class="col-md-7">
							<form:input path="dob" type="dob" class="form-control" name="dob"
								value="" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">gender</label>
						<div class="col-md-7">
							<form:input path="gender" type="gender" class="form-control" name="gender"
								value="" />
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-md-3">aadhar</label>
						<div class="col-md-7">
							<form:input path="aadhar" type="aadhar" class="form-control" name="aadhar"
								value="" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">pin</label>
						<div class="col-md-7">
							<form:input path="pin" type="pin" class="form-control" name="pin"
								value="" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">active</label>
						<div class="col-md-7">
							<form:input path="active" type="active" class="form-control" name="active"
								value="" />
						</div>
					</div>
					
					<center>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
					</center>
				</form:form>

</body>
</html>