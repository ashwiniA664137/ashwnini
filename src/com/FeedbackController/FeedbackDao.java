package com.FeedbackController;


import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.*;  
public class FeedbackDao {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveEmployee(FeedbackPojo e){  
	    template.save(e);  
	}  
	//method to update employee  
	public void updateEmployee(FeedbackPojo e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(FeedbackPojo e){  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public FeedbackPojo getById(int id){  
		FeedbackPojo e=(FeedbackPojo)template.get(FeedbackPojo.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<FeedbackPojo> getEmployees(){  
	    List<FeedbackPojo> list=new ArrayList<FeedbackPojo>();  
	    list=template.loadAll(FeedbackPojo.class);  
	    return list;  
	}  

}
