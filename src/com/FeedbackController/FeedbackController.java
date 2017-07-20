package com.FeedbackController;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class FeedbackController implements Controller{

	
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
	
		String name=arg0.getParameter("Name");
		String email=arg0.getParameter("Email");
		String comment=arg0.getParameter("Comment");
		
		 Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		  
		    FeedbackDao dao=(FeedbackDao)factory.getBean("fb");
		    FeedbackPojo f=new FeedbackPojo();
		    f.setName(name);
		    f.setEmail(email);
		    f.setComment(comment);
		    
		    dao.saveEmployee(f);
		    
		    
		return new ModelAndView("Index");
	}

}
