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

	public static void addRecord(Employee employee) {
		
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
			em.persist(employee.getDetails());
			em.persist(employee);
		et.commit();
		em.close();
	}

	public static void updateRecord(Employee employee) {
		em = emf.createEntityManager();
		Employee employee1 = em.find(Employee.class, employee.getEmployeeId());
		et = em.getTransaction();
		et.begin();
			//update in progress
		et.commit();
		System.out.println("Method work in progress!");
		em.close();
	}

	public static void deleteRecord(Integer employeeId) {
		em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, employeeId);
		et  = em.getTransaction();
		et.begin();
			em.remove(employee);
			System.out.println("Employee Deleted");
			et.commit();
		em.close();
		
	}

	public static Employee findRecord(Integer employeeId) {
		em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, employeeId);
		System.out.println("Employee found!");
		em.close();
		return employee;
	}

	public static void listAll() {
		em = emf.createEntityManager();
		String jpql ="select e from Employee e";
		javax.persistence.Query q = em.createQuery(jpql);
		List<Employee> l = q.getResultList();
		Iterator<Employee> itr = l.iterator();
		System.out.println("\tEmployee Id\tEmployee UserName\tEmployee Password\tEmployee Name\tEmployee Email\tEmployee DOB\tEmployee DOJ\tEmployee Address");
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
		while(itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println("\t\t"+ employee.getEmployeeId()+ "\t\t"+ employee.getEmployeeUserName()+"\t\t"+employee.getEmployeePassword()+"\t\t"+employee.getDetails().getEmployeeName()
					+"\t\t"+employee.getDetails().getEmployeeEmail()+"\t\t"+employee.getDetails().getEmployeeDob()+"\t\t"+employee.getDetails().getEmployeeDoj()
					+"\t\t"+employee.getDetails().getEmployeeAddress());
		}
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		em.close();
	}

}
