<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <!--   <%@page import="org.springframework.config.java.annotation.Import"%> -->
  <%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.mapping.List"%>
<%@ page import="java.sql.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
  


<html>
<head>
<style>
div.container{
width:100%;
align:center;
border:3px solid black;
text-align:center;

}
header,footer
{
padding:1em;
color:white;
background-color:black;

text-align:center;

}
article{
float:right;
border-left:1px solid gray;
padding:1em;
overflow:hidden;

}
h2
{
align:center
}
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
<body style="align:center;text-align:center;">
<ul>
  <li><a href="Index.jsp">Home</a></li>
  <li><a href="Sign.jsp">Register</a></li>
  <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
  <li><a href="Index.jsp">Logout</a></li>
</ul>
<%   

HttpSession session1=request.getSession(true);
String s1=(String)session1.getAttribute("str");
%>

<div class="container">

<h2>!!! Fitness Hub !!!</h2>




${string} 

</div>


</body>
</html>