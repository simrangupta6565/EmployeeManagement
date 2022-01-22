package com.simran.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.simran.model.Employee;

public class EmployeeService {

	public static void addRecord(Employee employee) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("raj");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();
		System.out.println("Employee Added");
		em.close();
		emf.close();
		
	}

	public static void updateRecord(Employee employee) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("raj");
		EntityManager em = emf.createEntityManager();
		Employee employee1 = em.find(Employee.class, employee.getEmployeeId());
		EntityTransaction et = em.getTransaction();
		et.begin();
			employee1.setEmployeeName(employee.getEmployeeName());
			employee1.setEmployeeEmail(employee.getEmployeeEmail());
		et.commit();
		System.out.println("Employee Added");
		em.close();
		emf.close();
	}

	public static void delateRecord(Integer employeeId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("raj");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, employeeId);
		EntityTransaction et  = em.getTransaction();
		et.begin();
			em.remove(employee);
			System.out.println("Employee Deleted");
			et.commit();
		em.close();
		emf.close();
		
	}

	public static Employee findRecord(Integer employeeId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("raj");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, employeeId);em.close();
		System.out.println("Employee found!");
		emf.close();
		return employee;
	}

}
