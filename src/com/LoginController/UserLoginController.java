package com.LoginController;
import com.Controller.*; 
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.Controller.UserDao;
import com.Controller.UserPojo;

public class UserLoginController implements Controller {

	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("enetered");
		String uname = request.getParameter("Username");
		String pass = request.getParameter("Password");
		HttpSession session = request.getSession(true);
		 Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		    UserDao dao=(UserDao)factory.getBean("d"); 
		     
		  List<UserPojo> l1= dao.getEmployees();
		  Iterator<UserPojo> t1 = l1.iterator();
		  while(t1.hasNext())
		  {
		//	  System.out.println("iter");
			  UserPojo up=(UserPojo)t1.next();
		//	System.out.println(up.getUsername());  
			
			  if(uname.equals(up.getUsername()) && pass.equals(up.getPassword()))
			  {
				//HttpSession session = arg0.getSession();
				//session.setAttribute("Age", up.getAge());
				//System.out.println("AAgee::"+up.getAge());
				  if(null!=(session.getAttribute("error")))
				  {
					  session.removeAttribute("error");
				  }		
 
				  return new ModelAndView("Input");
				   
			  }
			  else if(uname.equals("admin12")&& pass.equals("admin"))
			  {
				  //HttpSession session = arg0.getSession();
					//session.setAttribute("Age", up.getAge());
					//System.out.println("AAgee::"+up.getAge());
				  if(null!=(session.getAttribute("error")))
				  {
					  session.removeAttribute("error");
				  }		
 
				  return new ModelAndView("Admin");
			  }
		  }   
		  session.setAttribute("error", "Invalid UserName/Password...");
		  return new ModelAndView("Home");
	}

}
