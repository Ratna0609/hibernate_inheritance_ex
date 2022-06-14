/**
 * 
 */
package com.org.hibernate.ex.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.org.hibernate.ex.model.ContractEmployee;
import com.org.hibernate.ex.model.Employee;
import com.org.hibernate.ex.model.RegularEmployee;
import com.org.hibernate.ex.util.HibernateUtil;

/**
 * @author nalaj
 *
 */
public class Runner1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Transaction transaction=null;
	    try (Session session=HibernateUtil.getSessionFactory().openSession()){
	    	transaction=session.beginTransaction();
	    	Employee emp=new Employee();
	    	RegularEmployee emp1 =new RegularEmployee();
	    	ContractEmployee emp2=new ContractEmployee();
	    	emp.setEmployeeName("RatnaN");
	    	
	    	emp1.setEmployeeName("SIVA");
	    	emp1.setSalary(5000);
	    	emp1.setBonus(15);
	    	
	    	emp2.setEmployeeName("HANU");
	    	emp2.setPay_per_hour(50);
	    	emp2.setContract_duration("year");
	    	
	    	session.persist(emp);
	    	session.persist(emp1); 
	    	session.persist(emp2);
	    	 
	    	 transaction.commit();
	    	 session.close();
	    	 System.out.println("Table Hierarchy Created");
	    	
	    	
          } catch (Exception e) {
              if (transaction != null) {
                  transaction.rollback();
              }
              e.printStackTrace();
          }

	}

}
