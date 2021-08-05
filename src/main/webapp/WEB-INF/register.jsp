<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Registration Page</h2>
		<form:form id="regForm" modelAttribute="cust" action="register" method="post">
		<table>
				<tr>
				 <td><form:label path="custid">Customer ID</form:label></td>
				 <td><form:input path="custid" name="custid"/>
				 </td>
				</tr>
				<tr>
				 <td><form:label path="name">Customer Name</form:label></td>
				 <td><form:input path="name" name="name"/>
				 </td>
				</tr>
				<tr>
				 <td><form:label path="city">City</form:label></td>
				 <td><form:input path="city" name="city"/>
				 </td>
				</tr>
				<tr>
				 <td></td>
				 <td><form:button id="register">Register</form:button>
				 </td>
				</tr>
		</table>
		</form:form>
</body>
</html>