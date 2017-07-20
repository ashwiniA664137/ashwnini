<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

body{

height: 100%;
width: 100%;


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

h2 { 
   position: absolute; 
   top: 70px; 
   left: 0; 
   width: 100%; 
   font-weight:700;

   font-size: 45px;
   font:oblique;
  
}




</style>
</head>
<body style="margin-top: 33px">
<ul>
  <li><a href="Index.jsp">Home</a></li>
  <li><a href="Home.jsp">Login</a></li>
  <li><a href="Sign.jsp">Register</a></li>
  <li><a href="ContactDetails.jsp">Contact</a></li>
  <li><a href="AboutUs.jsp">About Us</a></li>
</ul>
    &nbsp;<div>
        <center>
         <h2> Fitness Hub</h2>
         <br><br><br>
   <img src="img/5.jpg" style="height:400px;width:800px">
    
            </center>
        </div>
    <center>
    <s:form action="Input.spring">
    <br>
    <table >

     <tr>
           
                 <td>UserName &nbsp;&nbsp;<input type="text" name="Username"  required="true"></td>
      </tr>
       <tr>     
            
              <td>Password     &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="Password"  required="true"></td>
       </tr>
        <tr >
        <div class="error">

				<% String e = (String) session.getAttribute("error" );
					if(e != null)
					{
						out.print(e); 
					}%>
			</div>  
			</tr>
           
</table>
	
       <s:submit   align="center" value="Login"></s:submit>
      </s:form>     <br/>
 
    
    <s:form action="Sign.jsp">
      <s:submit align="centre" value = "SIGN UP"></s:submit>
     </s:form>
      </center>
    
</body>
</html>