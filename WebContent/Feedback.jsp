<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
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

.bo
{
color: black;
}

.image { 
color: black;
   position: relative; 
   width: 800px
   height:300px /* for IE 6 */
}

h1 { 
   position: absolute; 
   top: 330px; 
   left: 0; 
   width: 100%; 
   font-weight:700;

   font-size:40px;
   font:oblique;
  
}
h2 { 
   width: 100%; 
   font-weight:700;

   font-size:20px;
   font:oblique;
  
}
.in {
   
    padding: 7px 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
.tb {
position: absolute; 
   top: 480px; 
   left: 40%; 
  
  


   font:oblique;

}
</style>
</head>
<body  >
<ul>
  <li><a href="Index.jsp">Home</a></li>  
  <li><a href="Sign.jsp">Register</a></li>
  <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
  <li><a href="Index.jsp">Logout</a></li>
</ul>

<s:form action="Feedback.spring">
 <center>
<div class="image" align="center">

      <img  class="image" src="img/feedback.jpg"> 
      <br>

      <h1>We want to hear from YOU... </h1>
      <table class="tb">
      <tr>
      <td><h2>Name:</h2></td>
      <td><input type="text" class="in" placeholder="Name" name="Name" required="true"></td>
      </tr>
      <tr>      
      <td><h2>Email:</h2></td>
      <td><input type="email" class="in" placeholder="Email" name="Email" required="true"></td>
      </tr>
      <tr>
      <td><h2>Comment:</h2></td><td><input type="text" class="in" name="Comment" placeholder="Your Message" required="true" ></td>
      </tr>
<tr><td ><td><input type="submit" name="Submit" class="in"></td></td></tr>
</table>
</center>
</div>
</s:form>
</body>
</html>