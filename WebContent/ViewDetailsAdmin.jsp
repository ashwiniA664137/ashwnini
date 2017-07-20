
<%@page import="java.util.List"%>

<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.Statement"%>

<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>




<style>
table {
    width:70%;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;
}

table th {
    background-color: navy;
    color: white;
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
<body>
<ul>
  <li><a href="Index.jsp">Home</a></li>  
  <li><a href="Sign.jsp">Register</a></li>
  <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
  <li><a href="Index.jsp">Logout</a></li>
</ul>
 <% 
	System.out.println("Hello");
	Statement stmt = null;
	Connection conn=null;
	ResultSet rs=null;
try {
	Class.forName("com.mysql.jdbc.Driver");

	System.out.println("Driver loaded");
	
	conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/fitness", "root", "root");
	stmt = conn.createStatement();
	rs = stmt.executeQuery("select * from feedback");
%>
<table align="center">
		   <tr >
		   <th>ID</th>
		    <th>Name</th>
		    <th>Email</th>
		    <th>Comment</th>
		   </tr>
<%	while (rs.next()) {
		 %>
		   		   
		   <tr>
		   <td><% out.print( rs.getString("Id"));%></td>
		   
			<td><% out.print( rs.getString("Name"));%></td>
		   
		   
		   <td><% out.print(rs.getString("Email")); %></td>
		   
		   <td><% out.print(rs.getString("Comment")); %></td>
		   </tr>
		  
		 <% } 
		 %>
 </table>
 <%
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("class not found");
}


%>
     
</body>
</html>