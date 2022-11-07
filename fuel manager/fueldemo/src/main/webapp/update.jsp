<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%

	String id =request.getParameter("id");
	String f_remain=request.getParameter("f_remain");
	String price=request.getParameter("price");
	String nc_date=request.getParameter("nc_date");
	

%>

	<div class="container p-5 my-5 bg-dark text-white">

		<form action="" method="post">


			<input type="text" name="id" value="<%=id %>" placeholder="id"
				readonly><br> <input type="text" name="f_remain"
				value="<%=f_remain%>" placeholder="Available renmaining"><br>

			<input type="text" name="price" value="<%=price%>"
				placeholder="Now fuel price"><br> <input type="date"
				name="nc_date" value="<%=nc_date%>" placeholder="Next comming date"><br>



			<input type="submit" name="submit" value="update">

		</form>
	</div>

</body>
</html>