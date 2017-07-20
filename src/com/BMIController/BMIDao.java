package com.BMIController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.Controller.UserPojo;

public class BMIDao {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveEmployee(UserPojo e){  
	    template.save(e);  
	}  
	//method to update employee  
	public void updateEmployee(UserPojo e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(UserPojo e){  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public UserPojo getById(int id){  
		UserPojo e=(UserPojo)template.get(UserPojo.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<UserPojo> getEmployees(){  
	    List<UserPojo> list=new ArrayList<UserPojo>();  
	    list=template.loadAll(UserPojo.class);  
	    return list;  
	}  

}
