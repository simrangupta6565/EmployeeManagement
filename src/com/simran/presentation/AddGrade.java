package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Grade;

public class AddGrade {
	public static void gradeUI() {
		Integer gradeId=null;
		String  gradeName=null;
		Integer gradeBasic=null;
		Integer gradeDa=null;
		Integer gradeHra=null;
		Integer gradeMa=null;
		Integer gradeBonus=null;
		Integer gradePf=null;

		
		
		Scanner input = new Scanner (System.in);
		while(true) {
		System.out.println("----------------------");
		System.out.println("Grade Details");
		System.out.println("----------------------");
		
		System.out.println("1. Add Grade Details");
		System.out.println("2. Exit");
		
		System.out.println("Enter the Choice:");
		Integer option = input.nextInt();
		Grade g = new Grade();
		
		switch(option)
		{
			case 1:
				System.out.println("Enter the  Grade Id:");
				gradeId = Integer.parseInt(input.nextLine());
				System.out.println("Enter the Grade Name:");
				gradeName = input.nextLine();
				System.out.println("Enter the  Grade Basic:");
				gradeBasic = Integer.parseInt(input.nextLine());
				System.out.println("Enter the  Dearness Allowance:");
				gradeDa = Integer.parseInt(input.nextLine());
				System.out.println("Enter the House Rent Allowance:");
				gradeHra = Integer.parseInt(input.nextLine());
				System.out.println("Enter the  Medical Allowance:");
				gradeMa = Integer.parseInt(input.nextLine());
				System.out.println("Enter the  Bonus:");
				gradeBonus = Integer.parseInt(input.nextLine());
				System.out.println("Enter the  Provident Fund:");
				gradePf = Integer.parseInt(input.nextLine());
				g.setGradeId(gradeId);
				g.setGradeName(gradeName);
				g.setGradeBasic(gradeBasic);
				g.setGradeDa(gradeDa);
				g.setGradeHra(gradeHra);
				g.setGradeMa(gradeMa);
				g.setGradeBonus(gradeBonus);
				g.setGradePf(gradePf);
				
				
			//	GradeDetailsService.addRecord(employee);
				System.out.println("Grade Details Successfully Added");
				break;
			
			case 2:
				System.out.println("Exit");
				System.exit(0);
		}
		System.out.println("Do you want to continue");
		String choice = input.next();
		if(choice.equals("no")) {
			System.out.println("User don't want to continue");;
			System.exit(0);
		}
		}	
	}
}
