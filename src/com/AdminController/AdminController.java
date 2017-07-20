package com.AdminController;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class AdminController  implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
	
		String category=arg0.getParameter("Category");
		String do1=arg0.getParameter("Do");
		String dont=arg0.getParameter("Dont");
		
		 Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		  
		    AdminDao dao=(AdminDao)factory.getBean("a");
		    AdminPojo a=new AdminPojo();
		    a.setCategory(category);
		    a.setDo(do1);
		    a.setDont(dont);
		    
		    dao.saveEmployee(a);
		    
		    
		return new ModelAndView("Admin");
	}

	

}
