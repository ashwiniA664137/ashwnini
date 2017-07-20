<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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
<%   

HttpSession session1=request.getSession(true);
String bm=(String)session1.getAttribute("bmi1");
String cat;
float f1=Float.parseFloat(bm);
//String bm=request.getParameter("bmi1");  
//out.print("Welcome "+name);  
out.print("<h2>Your BMI is:"+bm+"</h2>");  
//session.setAttribute("ubm",bm);  
 if(f1<18.5)
 {
	 out.print("<br><h3>Under Weight</h3>");
	 cat="UnderWeight";
 }
 else if(f1 >18.50 && f1<24.9)
 {
	 out.print("<br><h3>Normal weight</h3>");
	 cat="Normal";
 }
 else if(f1>=25 && f1<29.9)
 {
	 out.print("<br><h3>Over Weight</h3>");
     cat="OverWeight";
 }
 else
 {
	 out.print("<br><h3>Obesity</h3>");
     cat="Obesity";
 }
 session.setAttribute("category", cat);
%>  
<br>
<br>

<table style="height:400px;width:900px">
<tr>

<td>
<img src="img/11.jpg" style="height:300px;width:300px">
</td>
<td>
<a href="ReportDisp.spring"><h2><b>Your Report</b></h2></a>
</td>
<td>
<img src="img/16.jpg" style="height:300px;width:300px">
</td></tr>
</table>
</center>
</body>
</html>


