package com.simran.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.simran.model.Department;
import com.simran.model.Grade;

public class GradeService {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	static {
		emf = Persistence.createEntityManagerFactory("EmployeePersistence");
	}

	public static void findAll() {
		em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Grade> cq = cb.createQuery(Grade.class);
		Root<Grade> r = cq.from(Grade.class);
		CriteriaQuery<Grade> select = cq.select(r);
		TypedQuery<Grade> tq = em.createQuery(select);
		List<Grade> l = tq.getResultList();
		Iterator<Grade> itr = l.iterator();
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tGrade Id\tGrade Name\tBasic Pay\tDearness Allowance\tHouse Rent Allowance\tMedical Allowance\tBonus\t Provident Fund");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------------");
		while(itr.hasNext()) {
			Grade g = itr.next();
			System.out.println("\t\t"+g.getGradeId()+"\t"+g.getGradeName()+"\t\t"+g.getGradeBasic()+"\t\t"+g.getGradeDa()+"\t\t\t"+g.getGradeHra()+"\t\t\t"+g.getGradeMa()+"\t\t\t"+g.getGradeBonus()
			+"\t\t"+g.getGradePf());
		}
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		em.close();
		
	}

	public static void addGrade(Grade g) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
			em.persist(g);
		et.commit();
		em.close();
		GradeService.findAll();
		
	}

	public static void deleteGrade(Integer gradeId) {
		em = emf.createEntityManager();
		Grade g = em.find(Grade.class, gradeId);
		et  = em.getTransaction();
		et.begin();
			em.remove(g);
		et.commit();
		em.close();
		GradeService.findAll();
		
	}

}
