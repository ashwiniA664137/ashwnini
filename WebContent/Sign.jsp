<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
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
    padding: 14px 16px;
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
   width: 100%; /* for IE 6 */
}
/* 
h1 { 
   position: absolute; 
   top: 280px; 
   left: 0; 
   width: 100%; 
   font-weight:700;
   font-size:40px;
   font:oblique;
  
}
h2 { 
    position: absolute; 
   width: 100%; 
   font-weight:700;
 
   font-size:20px;
   font:oblique;
  
}
.in {
position: absolute;
   
    padding: 7px 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
 */
body{



}
</style>
</head>
<body>

<ul>
  <li><a href="Index.jsp">Home</a></li>
  <li><a href="Home.jsp">Login</a></li>
  <li><a href="Sign.jsp">Register</a></li>
   <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
</ul>


<table>
<tr>
<td>
<img src="img/m.jpg" style="height:210px;width:210px">
<img src="img/m6.jpg" style="height:150px;width:150px">
</td>
<td>
<img src="img/m3.jpg" style="height:150px;width:150px">
</td>
</tr><tr>
<td>                                              </td>
<td>                                              </td>
<td>                                              </td>
<td>

<s:form action="SignUp.spring">

<div style="font-size:300px;">
<table>
<tr>
<td>Name</td><td><input type="text" name="Name" class="h2" required><br/></td>
</tr>
<tr>
<td>
UserName</td><td><input type="text" name="Username" class="h2" required><br/>
</td>
</tr>
 <tr> 
<td>
Password</td><td><input type="password" name="Password"   class="h2" required><br/>
</td>
</tr>
<tr>
<td>Confirm Password</td><td><input type="password" name="ConfirmPass"   class="h2" required><br/></td>
</tr>
<tr>
<td>Age</td><td><input type="number" name="Age" min="1"  class="h2" required></td>
</tr>
<tr>
<td>
<s:radio label="Gender" name="Gender" list="#{'M':'Male','f':'Female'}" required="true"> </s:radio>
</td>
</tr>
<tr>
<td>
<s:submit value="Submit"></s:submit>
</td>
</tr>
</table>
</tr>
<tr>
<td>                                              </td>
<td>                                              </td>
<td>                                              </td>
<td>                                              </td>
<td>
<img src="img/m4.jpg" style="height:210px;width:210px">
<img src="img/m5.jpg" style="height:150px;width:150px">
</td>
<td>
<img src="img/m1.jpg" style="height:150px;width:150px">
</td>
</tr>
</table>
</div>
</s:form>

</body>
</html>