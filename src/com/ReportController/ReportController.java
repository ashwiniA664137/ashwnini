    package com.ReportController;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;
	import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.Controller;
	import com.ReportController.ReportDao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.ResultSet;
import java.sql.*;



	public class ReportController implements Controller {

		
		public ModelAndView handleRequest(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			
			
			 Resource r=new ClassPathResource("applicationContext.xml");  
			   BeanFactory factory=new XmlBeanFactory(r);  
			
			  HttpSession session=request.getSession(true);
			  String cat =(String) session.getAttribute("category");
			  //session.setAttribute("usr", user);
			  
			  Class.forName("com.mysql.jdbc.Driver");
			    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fitness","root","root");  
			    java.sql.PreparedStatement st = con.prepareStatement("select * from diet where Category ='"+cat+"'");
			    java.sql.ResultSet r1=st.executeQuery();
			    
			  //ReportDao bmi =(ReportDao) factory.getBean("r");
			    String str="";
				   str+="<div style='text-align:center;align:center;left:50%'>";
				   str+="<table>";
			     	str+="<tr>";
			    	str+="<td>";
			     	str+="<img src='img/food3.jpg' style='height:150px;width:150px'>";
			     	str+="</td>";
			     	str+="<td>";
			     	str+="<img src='img/post2.jpg' style='height:150px;width:250px'>";
			     	str+="</td>";
			     	str+="<td>";
				   str+="<table style='height:300px;width:600px;float:center;border:2px solid black;'>";
				   str+="<tr>";
				   str+="<td> <h2>Category:</h2> </td>"; 
				   str+="<td><h2>"+cat+"</h2></td>";
				   str+="</tr>";
				   str+="<tr>";
				   str+="<td> <h2>Do's</h2> </td>"; 
				   str+="<td><h2>Don't</h2></td>";
				   str+="</tr>";
				        while (r1.next()) {
				        	      	        	
				            
				            str+="<tr>";
				            str+="<td>"+ r1.getString("Do")+"</td>";
				            str+="<td>"+ r1.getString("Dont")+"</td>";

				            str+="</tr>";
				            str+="</table>";
				            str+="</td><td>";
					     	str+="<img src='img/food5.jpg' style='height:150px;width:250px'>";
					     	str+="</td>";
				         	str+="</td><td>";
					     	str+="<img src='img/8.jpg' style='height150px;width:150px'>";
					     	str+="</td>";
					     	str+="</tr>";
					     	str+="</table>";
					     	str+="<br><br>";
				            
				        }
				 	          	    
				        if(cat.equals("UnderWeight"))
			            {
			            str+="<td><h3><a href='underweight.jsp'>Further Details</a></h3></td>";
			            }
			            else if(cat.equals("OverWeight"))
			            {
			            	str+="<td><h3><a href='overweight.jsp'>Further Details</a></h3></td>";
			            }
			            else if(cat.equals("Normal"))
			            {
			            	str+="<td><h3><a href='normal.jsp'>Further Details</a></h3></td>";
			            }
			            else 
			            {
			            	str+="<td><h3><a href='obsessed.jsp'>Further Details</a></h3></td>";
			            }
				        str+="<td><h3><a href='Feedback.jsp'>FeedBack</a></h3></td>";
				        str+="</div>";
			return new ModelAndView("Report","string",str);
			
		}
		
		
	}