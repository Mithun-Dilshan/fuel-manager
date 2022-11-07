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



<form action="" method ="post">


    <input type="text"  name ="id" value ="${ful.id }" placeholder="id" readonly><br>
   
  <input type="text"  name ="f_remain" value ="${ful.f_remain  }" placeholder="Available renmaining"><br>
  
  <input type="text" name ="price"  value ="${ful.price  }" placeholder="Now fuel price"><br>
  

   
    <input type="date" name ="nc_date"  value ="${ful.nc_date  }" placeholder="Next comming date"><br>
    

     
     <input type="submit" name="submit" value = "update">

</form>
</c:forEach>



</body>
</html>