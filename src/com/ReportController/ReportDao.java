package com.ReportController;
import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.*;  
public class ReportDao {	
	

		HibernateTemplate template;  
		public void setTemplate(HibernateTemplate template) {  
		    this.template = template;  
		}  
		//method to save employee  
		public void saveEmployee(ReportPojo e){  
		    template.save(e);  
		}  
		//method to update employee  
		public void updateEmployee(ReportPojo e){  
		    template.update(e);  
		}  
		//method to delete employee  
		public void deleteEmployee(ReportPojo e){  
		    template.delete(e);  
		}  
		//method to return one employee of given id  
		public ReportPojo getById(int id){  
			ReportPojo e=(ReportPojo)template.get(ReportPojo.class,id);  
		    return e;  
		}  
		//method to return all employees  
		public List<ReportPojo> getEmployees(){  
		    List<ReportPojo> list=new ArrayList<ReportPojo>();  
		    list=template.loadAll(ReportPojo.class);  
		    return list;  
		}  

	}

	

