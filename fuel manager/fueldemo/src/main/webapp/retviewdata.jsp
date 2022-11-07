<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>


		<tr>
			<td>id</td>
			<td>ftype</td>
			<td>n_capacity</td>
			<td>f_remain</td>
			<td>price</td>
			<td>a_date</td>
			<td>nc_date</td>
			<td>m_name</td>
			<td>eid</td>
			<td>eid</td>

		</tr>

		<c:forEach var="ful" items="${fueldetails}">

			<c:set var="id" value="${ful.id }" />
			<c:set var="ftype" value="${ful.ftype }" />
			<c:set var="n_capacity" value="${ful.n_capacity }" />
			<c:set var="f_remain" value="${ful.f_remain  }" />
			<c:set var="price" value="${ful.price  }" />
			<c:set var="a_date" value="${ful.a_date }" /> 
			<c:set var="nc_date" value="${ful.nc_date  }" />
			<c:set var="m_name" value="${ful.m_name  }" />
			<c:set var="eid" value="${ful.eid  }" />





			<tr>
				<td>${ful.id }</td>
				<td>${ful.ftype }</td>
				<td>${ful.n_capacity }</td>
				<td>${ful.f_remain  }</td>
				<td>${ful.price  }</td>
				<td>${ful.a_date }</td>
				<td>${ful.nc_date  }</td>
				<td>${ful.m_name  }</td>
				<td>${ful.eid  }</td>
			
			
			<td>
			<form action="update.jsp" method="post">
			<input type ="submit" value ="update">
			
			
			</form>
			</td>
			</tr>






		</c:forEach>
	</table>
	
	
	
	
</body>
</html>