<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<div class="container text-center">
				<h3>Update User</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-user">
				<div class="form-group">
						<label class="control-label col-md-3">id</label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="doctor_id"
								value="${user.doctor_id }" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Username</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="username"
								value="${user.username }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">First Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="firstname"
								value="${user.firstname }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Last Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="lastname"
								value="${user.lastname }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">password</label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="password"
								value="${user.password }" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">dob</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="dob"
								value="${user.dob }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Department_id</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="department_id"
								value="${user.department_id }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">address</label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="address"
								value="${user.address }" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Email</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email"
								value="${user.email }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Active</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="active"
								value="${user.active}" />
						</div>
					</div>
					
					
					
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>

</body>
</html>