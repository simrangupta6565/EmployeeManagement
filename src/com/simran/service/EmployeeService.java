package com.simran.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.mysql.cj.Query;
import com.simran.model.Employee;

public class EmployeeService {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeePersistence");
	}


	public static Employee findEmployee(String userName, String password) {
		System.out.println("username = "+ userName);
		em = emf.createEntityManager();
		String jpql ="select e from Employee e ";
		javax.persistence.Query q = em.createQuery(jpql);
		List<Employee> l = q.getResultList();
		Iterator<Employee> itr = l.iterator();
		
		while(itr.hasNext()) {
			Employee employee = itr.next();
			if(employee.getEmployeeUserName().equals(userName))
				if(employee.getEmployeePassword().equals(password))
					return employee;
				else break;
		}
		em.close();
		return null;
	}


	public static void showdetails(Employee e) {
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
		Employee employee = em.find(Employee.class, e.getEmployeeId());
		System.out.println("\tEmployee Id\tEmployee Name\tEmployee Email\tEmployee DOB\tEmployee DOJ\tEmployee Address");
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t"+ employee.getEmployeeId()+ "\t"+employee.getDetails().getEmployeeName()
					+"\t\t"+employee.getDetails().getEmployeeEmail()+"\t"+employee.getDetails().getEmployeeDob()+"\t"+employee.getDetails().getEmployeeDoj()
					+"\t"+employee.getDetails().getEmployeeAddress());
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}

	

}
