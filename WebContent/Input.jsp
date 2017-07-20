<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 20px 20px;
    text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
    background-color: #111;
}

* {box-sizing:border-box}



.image { 
   position: relative; 
   width: 100%; /* for IE 6 */
}

h1 { 
   position: absolute; 
   top: 80px; 
   left: 0; 
   width: 100%; 
   font-weight:700;
   color: white;
   font-size: 70px;
   font:oblique;
  
}



</style>
</head>
<body>
<ul>
  <li><a href="Index.jsp">Home</a></li>
  
  <li><a href="Sign.jsp">Register</a></li>
  <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
  <li><a href="Index.jsp">Logout</a></li>
</ul>
<center>
<br><br><br><br>
<table>
<tr>
<td>
 <img src="img/er.jpg" style ="height:200px; width:200px" />
 </td>
 <td>
 <img src="img/q8.jpeg" style ="height:200px; width:700px" />
 </td>
 <td>
 <img src="img/jk.jpg" style ="height:200px; width:200px" />
 </td>
 <s:form action="Report.spring">  
<td>
<table>
<tr>
<td>Enter Height<span>*</span></td><td><input type="number" name ="height" min="1" required>(in Cms)</td>
</tr>
<tr>
<td>Enter Weight<span>*</span></td><td><input type="number" name="weight" min="1" required>(in Kgs)</td>
</tr>
<tr>
<td>Enter Age<span>*</span></td><td><input type="number" name="age" min="1" required></td></tr>
<tr>
<td><input type="submit" value="Generate BMI"></td>
</tr>
</table>
</s:form>
</td>
</tr>
</table>
</center>
</body>
</html>