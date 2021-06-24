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
<form:form class="form-horizontal" method="POST" action="/save" modelAttribute="user">
					<form:input path="doctor_id" type="hidden" name="doctor_id" value="" />
					<div class="form-group">
						<label class="control-label col-md-3">username</label>
						<div class="col-md-7">
							<form:input path="username" type="text" class="form-control" name="username"
								value="${user.username}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">firstname</label>
						<div class="col-md-7">
							<form:input path="firstname" type="text" class="form-control" name="firstname"
								value="${user.firstname}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">lastname</label>
						<div class="col-md-7">
							<form:input path="lastname" type="text" class="form-control" name="lastname"
								value="${user.lastname}" />
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-md-3">password</label>
						<div class="col-md-7">
							<form:input path="password" type="password" class="form-control" name="password"
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
						<label class="control-label col-md-3">department_id</label>
						<div class="col-md-7">
							<form:input path="department_id" type="department_id" class="form-control" name="department_id"
								value="" />
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
						<label class="control-label col-md-3">email</label>
						<div class="col-md-7">
							<form:input path="email" type="email" class="form-control" name="email"
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