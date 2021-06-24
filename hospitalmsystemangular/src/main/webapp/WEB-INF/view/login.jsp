<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
form-control{
width:30vw;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
			<div class="container text-center">
				<h3>Admin Login</h3>
				<hr>
				<form:form class="" method="POST" action="/login-user" modelAttribute="user">
					<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
					
					<div class="form-group row">
						<label class="">Username</label>
						
							<form:input path="username" type="text" class="form-control" name="username"
								value="${user.username}" />
						
					</div>
					<div class="form-group row">
						<label class="">Password</label>
						
							<form:input path="password" type="password" class="form-control" name="password"
								value="${user.password}" />
						
					</div>
					
					<div class="form-group ">
						<input type="submit" class="btn btn-danger" value="Login" />
					</div>
					</form:form>
					</div>


</body>
</html>