package com.castsoftware.JpaBoot.service;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.castsoftware.JpaBoot.EmployeeDao;
import com.castsoftware.JpaBoot.model.Employee;

public class EmployeeService {

	private static Session session=EmployeeDao.getSessionFactory();
    
	 private static Transaction Tx=session.beginTransaction();
   
	
	public static List<Employee> getEmployeeList(){
		
	   Tx.begin();
	   Query query=session.createQuery("From Employee");
	   List<Employee> records=query.list();
	   return records;
	   
	}
}
