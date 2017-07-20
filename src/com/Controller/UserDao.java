package com.Controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;  


@Repository
public class UserDao {
	@Autowired  
	SessionFactory sessionFactory;
	 
	
	
	private Session getcurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	//method to save employee  
	@Transactional
	public void saveEmployee(UserPojo e){  
		Session session=getcurrentSession();
		session.save(e);  
	}  
	//method to update employee
	@Transactional
	public void updateEmployee(UserPojo e){  
		Session session=getcurrentSession();
		session.update(e);  
	}  
	//method to delete employee
	@Transactional
	public void deleteEmployee(UserPojo e){  
		Session session=getcurrentSession();
		session.delete(e);  
	}  
	//method to return one employee of given id  
	@Transactional
	public UserPojo getById(int id){ 
		Session session=getcurrentSession();
		
		UserPojo e=(UserPojo)session.get(UserPojo.class,id);  
	    return e;  
	}  
	//method to return all employees  
	@Transactional
	public List<UserPojo> getEmployees(){  
		Session session=getcurrentSession();
	    List<UserPojo> list=new ArrayList<UserPojo>();  
	    list=session.createCriteria(UserPojo.class).list();  
	    return list;  
	}  

}
