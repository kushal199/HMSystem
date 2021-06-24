<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form action="/update_feedback" method="POST">
 <div class="form-group">
						<div class="col-md-3">
							<input type="hidden" class="form-control" name="id"
								value="${ appointment_id}" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-3">
							<input type="hidden" class="form-control" name="idd"
								value="${patient_id}" />
						</div>
					</div>
 
  <textarea name="feedback" rows="10" cols="30">The cat was playing in the garden.</textarea>
  <br><br>
  <input type="submit">
</form>

</body>
</html>