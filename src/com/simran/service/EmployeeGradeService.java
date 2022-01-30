package com.simran.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.simran.model.GradeDetails;

public class EmployeeGradeService {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	static {
		emf = Persistence.createEntityManagerFactory("EmployeePersistence");
	}
	public static void findAll() {
		em = emf.createEntityManager();
		String jpql ="select t from GradeDetails t";
		javax.persistence.Query q = em.createQuery(jpql);
		List<GradeDetails> l = q.getResultList();
		Iterator<GradeDetails> itr = l.iterator();
		System.out.println("\t--------------------------------------------------------------------");
		System.out.println("\tTransaction Id \tEmployee Id\tDepartment Id\t  Grade Id");
		System.out.println("\t--------------------------------------------------------------------");
		while(itr.hasNext()) {
			GradeDetails d = itr.next();
			System.out.println("\t\t"+d.getTransactionId()+"\t\t"+d.getEmployeeId()+"\t\t"+d.getDepartmentId()+"\t\t"+d.getGradeId());
		}
		System.out.println("\t---------------------------------------------------------------------");
		
		em.close();
	}

	public static void performTransaction(GradeDetails details) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
			em.persist(details);
		et.commit();
		em.close();
	}

	public static void deleteTransaction(int transactionId) {
		em = emf.createEntityManager();
		GradeDetails d = em.find(GradeDetails.class, transactionId);
		et  = em.getTransaction();
		et.begin();
			em.remove(d);
			et.commit();
		em.close();
	}

}
