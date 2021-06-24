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
				<h3>Take Appointment</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save_appointment?id=${doctor_id}&idd=${patient_id}">
				<div class="form-group">
						<label class="control-label col-md-3">datetime</label>
						<div class="col-md-3">
							<input type="date" class="form-control" name="datetime"
								value="" />
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-md-3">description</label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="description"
								value="" />
						</div>
					</div>
					
					
					
					
					
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>
				</form>
			</div>

</body>
</html>