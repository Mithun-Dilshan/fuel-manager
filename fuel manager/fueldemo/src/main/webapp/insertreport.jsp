<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action ="insert" method ="Post">
 <select class="form-select" id="floatingSelect"  name ="ftype" aria-label="Floating label select example">
      <option selected>Open this select menu</option>
      <option value="P92">Petrol(92 Octane)</option>
       <option value="P95">Petrol(95 Octane EURO 4)</option>
       <option value="AD"> Diesel(Auto Diesel)</option>
       <option value="SD">  Diesel(Lanka Super Diesel 4 star)</option>
 </select><br>
 <input type ="text" name ="n_capacity" placeholder="New bouser capacity"><br>
 
 
  <input type="text"  name ="f_remain" placeholder="Available renmaining"><br>
  
  <input type="text" name ="price" placeholder="Now fuel price"><br>
  
   <input type="date" name ="a_date" placeholder="Arival date"><br>
   
    <input type="date" name ="nc_date" placeholder="Next comming date"><br>
    
     <input type="text" name ="m_name" placeholder="Manager name"><br>
     
     <input type="text" name ="eid" placeholder="Manager employ id"><br>
     
     <input type="submit" name="submit" value = "submit">
     
     
    
</form>

</body>
</html>