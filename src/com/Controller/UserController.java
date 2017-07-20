package com.Controller;
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


public class UserController implements Controller{

	
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
	
		String name=arg0.getParameter("Name");
		String uname=arg0.getParameter("Username");
		String pass=arg0.getParameter("Password");
		String cpass=arg0.getParameter("ConfirmPass");
		String gender=arg0.getParameter("Gender");
		Integer age = Integer.parseInt(arg0.getParameter("Age"));
		 Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    UserDao dao=(UserDao)factory.getBean("d");  
		      
		    UserPojo e=new UserPojo();  
		    e.setName(name);
		    e.setUsername(uname);
		    e.setPassword(pass);
		    e.setConfirmPass(cpass);
		    e.setAge(age);
		    e.setGender(gender);
		    dao.saveEmployee(e); 
	
		return new ModelAndView("Index");
	}

}
