package com.AdminController;

import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.*;  
public class AdminDao {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveEmployee(AdminPojo e){  
	    template.save(e);  
	}  
	//method to update employee  
	public void updateEmployee(AdminPojo e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(AdminPojo e){  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public AdminPojo getById(int id){  
		AdminPojo e=(AdminPojo)template.get(AdminPojo.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<AdminPojo> getEmployees(){  
	    List<AdminPojo> list=new ArrayList<AdminPojo>();  
	    list=template.loadAll(AdminPojo.class);  
	    return list;  
	}  

}
