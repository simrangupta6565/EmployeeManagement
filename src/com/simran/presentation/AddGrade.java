package com.simran.presentation;

import java.util.Scanner;
import com.simran.service.GradeService;
import com.simran.model.Grade;

public class AddGrade {
	public static void menu() {
		Integer gradeId= null;
		String  gradeName=null;
		Double gradeBasic=null;
		Double gradeDa=null;
		Double gradeHra=null;
		Double gradeMa=null;
		Double gradeBonus=null;
		Double gradePf=null;

		
		
		Scanner input = new Scanner (System.in);
		while(true) {
			GradeService.findAll();
		System.out.println("1. Add Grade Details");
		System.out.println("2. Delete Grade");
		System.out.println("3. Back");
		System.out.println("4. Exit");
		
		System.out.println("Enter the Choice:");
		Integer option = Integer.parseInt(input.nextLine());
		Grade g = new Grade();
		
		switch(option)
		{
			case 1:
				System.out.println("Enter the Grade Name:");
				gradeName = input.nextLine();
				g.setGradeName(gradeName);
				System.out.println("Enter the  Grade Basic Pay:");
				gradeBasic = Double.parseDouble(input.nextLine());
				g.setGradeBasic(gradeBasic);
				System.out.println("Enter the  Dearness Allowance(Percentage Value):");
				gradeDa =  Double.parseDouble(input.nextLine());
				g.setGradeDa(gradeDa);
				System.out.println("Enter the House Rent Allowance(Percentage Value):");
				gradeHra = Double.parseDouble(input.nextLine());
				g.setGradeHra(gradeHra);
				System.out.println("Enter the  Medical Allowance(Percentage Value):");
				gradeMa =  Double.parseDouble(input.nextLine());
				g.setGradeMa(gradeMa);
				System.out.println("Enter the  Bonus(Percentage Value):");
				gradeBonus = Double.parseDouble(input.nextLine());
				g.setGradeBonus(gradeBonus);
				System.out.println("Enter the  Provident Fund(Percentage Value):");
				gradePf = Double.parseDouble(input.nextLine());
				g.setGradePf(gradePf);
				GradeService.addGrade(g);
				System.out.println("Grade Details Successfully Added");
				break;
			case 2:
				System.out.println("Enter Grade Id:");
				gradeId= Integer.parseInt(input.nextLine());
				GradeService.deleteGrade(gradeId);
				System.out.println("Grade Details Successfully Deleted");
				break;
			case 3:
				AdminClient.menu();
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
		}
		System.out.println("Do you want to continue");
		String choice = input.nextLine();
		if(choice.equals("no")) {
			System.out.println("User don't want to continue");;
			System.exit(0);
		}
		}	
	}
}
