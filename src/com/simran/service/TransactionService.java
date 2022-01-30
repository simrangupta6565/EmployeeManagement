package com.simran.service;

import java.text.DecimalFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.simran.model.Department;
import com.simran.model.Grade;
import com.simran.model.GradeDetails;

public class TransactionService {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction et;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	static {
		emf = Persistence.createEntityManagerFactory("EmployeePersistence");
	}
	public static void getTransaction(Integer transactionId) {
		em = emf.createEntityManager();
		GradeDetails t = em.find(GradeDetails.class, transactionId);
		if(t!= null) {
			Department d = em.find(Department.class, t.getDepartmentId());
			Grade g = em.find(Grade.class, t.getGradeId());
			double basic = g.getGradeBasic();
			double da =g.getGradeDa();
			double hra= g.getGradeHra();
			double ma = g.getGradeMa();
			double bonus = g.getGradeBonus();
			double pf = g.getGradePf();
			da = basic*(da*0.01);
			hra = basic*(hra*0.01);
			ma = basic*(ma*0.01);
			bonus = basic*(bonus*0.01);
			pf = basic*(pf*0.01);
			double  gross = basic + da+hra+ma+bonus;
			double net = gross - pf;
			System.out.println("\t---------------------------------------------------------------------------------------------");
			System.out.println("\t--------------------------------- Transaction ID: "+transactionId+" -----------------------------------------");
			System.out.println("\t\tEmployee Id: "+t.getEmployeeId()+" \t\t\t\tDepartment Id: "+ t.getDepartmentId());
			System.out.println("\t\tGrade Id: "+t.getGradeId());
			System.out.println("\t---------------------------------------------------------------------------------------------");
			System.out.println("\t\tBasic : "+df.format(basic)+" \t\t\t\tDearness Allowance: "+ df.format(da));
			System.out.println("\t\tHouse Rent Allowance: "+df.format(hra)+" \t\t\tMedical Allowance: "+df.format(ma));
			System.out.println("\t\tBonus : "+df.format(basic)+" \t\t\t\tProvident Fund: "+ df.format(pf));
			System.out.println("\t\tGross Salary: "+df.format(gross)+" \t\t\t\tTotal Deduction: "+ df.format(pf));
			System.out.println("\t\tNet Salary: "+df.format(net));
			System.out.println("\t---------------------------------------------------------------------------------------------");
		}
		else
			System.out.println("Transaction not found!");
	}

}
