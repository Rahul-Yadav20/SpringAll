<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Standard Tag Library</title>
</head>
<body>
	<!-- Some example of core tags in jstl -->
	<h1>
		-------------THIS IS OUR CORE TAGS CONTENT-----------
		<c:set var="a" value="45"></c:set>
		<c:out value="${a }"></c:out>
	</h1>
	<h2>
		
		<c:if test="${a>50 }">
			<h3>a is not less than 50</h3>
		</c:if>
		<c:if test="${a==45 }">
			<h3>a is equal to 45</h3>
		</c:if>
	</h2>
		
	<!-- Some example of functions tags in jstl (Mostly used for String manipulation)-->
	<h3>
		--------THIS IS OUR FUNCTIONS TAGS CONTENT-----------
		<br><c:set var="str" value="This is a String"></c:set>
		
		<c:out value="${fn: length(str) }"></c:out><br>
		
		<c:out value="${fn: toLowerCase(str) }"></c:out><br>
		
		<c:out value="${fn: toUpperCase(str) }"></c:out><br>
		
		<c:out value="${fn: contains(str, 'String') }"></c:out>
	</h3>
	
	
	<!-- example of sql tags in jstl -->
	<h4>
		<h2>-----------------This is SQL tag Content---------------</h2>
		<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/doctor" user="root" password="password" var="ds"/>
		<sql:query dataSource="${ds }" var="rs">select * from doctordetails;</sql:query>
		
		<table>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Department</td>
				<td>Phone NO</td>
				<td>Address</td>
				
			</tr>
			
			<c:forEach items="${rs.rows}" var="row">
				<tr>
				<td><c:out value="${row.id }"></c:out> </td>
				<td><c:out value="${row.name }"></c:out> </td>
				<td><c:out value="${row.dept }"></c:out> </td>
				<td><c:out value="${row.phone }"></c:out> </td>
				<td><c:out value="${row.address }"></c:out> </td>
				</tr>
			</c:forEach>
		</table>
	</h4>
</body>
</html>