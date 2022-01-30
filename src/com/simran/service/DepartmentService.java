package com.simran.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.simran.model.Department;
import com.simran.model.Employee;

public class DepartmentService {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeePersistence");
	}
	public static void findAll() {
		em = emf.createEntityManager();
		String jpql ="select d from Department d";
		javax.persistence.Query q = em.createQuery(jpql);
		List<Department> l = q.getResultList();
		Iterator<Department> itr = l.iterator();
		System.out.println("\t----------------------------------------------------------------------------");
		System.out.println("\t\tDepartment Id\t\t\t Department Name");
		System.out.println("\t----------------------------------------------------------------------------");
		while(itr.hasNext()) {
			Department d = itr.next();
			System.out.println("\t\t\t"+d.getDepartmentId()+"\t\t\t"+d.getDepartmentName());
		}
		System.out.println("\t----------------------------------------------------------------------------");
		
		em.close();
	}

	public static void addDepartment(Department d) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
			em.persist(d);
		et.commit();
		em.close();
		DepartmentService.findAll();
	}

	public static void deleteDepartment(int departmentId) {
		em = emf.createEntityManager();
		Department d = em.find(Department.class, departmentId);
		et  = em.getTransaction();
		et.begin();
			em.remove(d);
			et.commit();
		em.close();
		DepartmentService.findAll();
	}
	

}
