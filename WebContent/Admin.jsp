<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
 
 
 
 body{
 background-image: url("s.jpg");
  background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
 
 }
 
 back
 {
 opacity: 0.5;
    filter: alpha(opacity=50);
 }
</style>
</head>

<body >
<ul>
  <li><a href="Index.jsp">Home</a></li>  
  <li><a href="Sign.jsp">Register</a></li>
  <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
  <li><a href="Index.jsp">Logout</a></li>
</ul>
 <h1 style="text-align: center;">Here!! Your Plan Is Ready!! Get Ready!!</h1>
<label><h2><center>Select Category:</center></h2></label><br>
<center>
<form action="Admin.spring">
<table>
<tr>
<td>
<input type="radio" name="Category" value="Normal"><h2><u>Normal</u></h2></td>
<td></td>
<td><input type="radio" name="Category" value="OverWeight"><h2><u>OverWeight</u></h2></td><td></td>
<td><input type="radio" name="Category" value="UnderWeight"><h2><u>UnderWeight</u></h2></td><td></td>
<td><input type="radio" name="Category" value="Obsessed"><h2><u>Obsessed</u></h2></label></td>
</tr>

</table>

</center>
<label><center><h2>Diet Plan:</h2></center></label><br><br>
<center>
<b>DO's:</b>
<br><textarea rows="2" cols="75" style="background-color: infobackground;" name="Do" required="required"></textarea><br><br>

<b>DONT'S:</b><br>
<textarea rows="2" cols="75" style="background-color: infobackground;" name="Dont" required="required"></textarea><br><br>

<!-- <center><h2>Workout Plan:</h2></center><br><br>
<b>DO's:</b>
<br>1.<textarea rows="2" cols="75" style="background-color: infobackground;"></textarea><br><br>

<b>DONT'S:</b><br>
1.<textarea rows="2" cols="75" style="background-color: infobackground;"></textarea><br><br>
-->
</center>
<center><input type="submit" value="ADD"></center>

<a href="ViewDetailsAdmin.jsp">View User Details</a>
</form>


</body>
</html>
