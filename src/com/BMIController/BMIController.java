package com.BMIController;
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


public class BMIController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Integer height = Integer.parseInt(request.getParameter("height"));
		Integer weight = Integer.parseInt(request.getParameter("weight"));
		Integer age= Integer.parseInt(request.getParameter("age"));
		 Resource r=new ClassPathResource("applicationContext.xml");  
		   BeanFactory factory=new XmlBeanFactory(r);  
		
		  HttpSession session=request.getSession(true);
		  //session.setAttribute("usr", user);
		    UserDao dao=(UserDao)factory.getBean("d");  
		      BMIDao bmi =(BMIDao) factory.getBean("b");
		    UserPojo up=new UserPojo();
		    //HttpSession session=arg0.getSession(true);  
	       //int age=(int)session.getAttribute("Age");  
	     //  System.out.println("Age is : "+age);
		    //float h1=height/100;
		    float h=(height*height);
		    h=h/10000;
	       float calc_bmi = weight/h;
	      
	       System.out.println("bmi"+calc_bmi);
		   session.setAttribute("bmi1", calc_bmi);   
	       BMIPojo e=new BMIPojo();  
		    e.setHeight(height);
		    e.setWeight(weight);
		    e.setAge(age);
		    
		    bmi.saveEmployee(e); 
		    
	
		 
		return new ModelAndView("Bmi");
		
	}
	
	
}