<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Student Table</h1>

	<!-- Model Attribute : students      -->

<div align ="center">

<form action="showAddStudentPage">
<input type="submit"  value ="ADD">
</form>
<br><br>
	<table border="1">
		<thead>
			<tr align ="center">
				<td ><b>ID</b></td>
				<td><b>NAME</b></td>
				<td><b>MOBILE</b></td>
				<td><b>COUNTRY</b></td>
			</tr>
		</thead>


		<c:forEach var="student" items="${students}">
			<tr  align ="center">
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.mobile}</td>
				<td>${student.country}</td>
				<td><a href="/student_management/updateStudent?userId=${student.id}">Update</a></td>
				<td><a href="/student_management/deleteStudent?userId=${student.id}" onclick="!(confirm('Are you sure you want to delete this student?'))">Delete</a></td>

			</tr>
		</c:forEach>

	</table>
	</div>
</body>
</html>