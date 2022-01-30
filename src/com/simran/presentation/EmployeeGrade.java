package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Department;
import com.simran.model.EmployeeDetails;
import com.simran.model.GradeDetails;
import com.simran.service.DepartmentService;
import com.simran.service.EmployeeGradeService;
import com.simran.service.GradeService;

public class EmployeeGrade {
	

	public static void menu() {
		DepartmentService.findAll();
		GradeService.findAll();
		Scanner input = new Scanner (System.in);
		while(true) {
			System.out.println("1. Perform Transaction ");
			System.out.println("2. Show All Transactions ");
			System.out.println("3. Delete Transaction");
			System.out.println("4. Back");
			System.out.println("5. Exit");
			System.out.println("Enter the Choice:");
			Integer option = Integer.parseInt(input.nextLine());
			GradeDetails details= new GradeDetails();
			
			switch(option)
			{
				case 1:
					System.out.println("Enter Employee Id:");
					Integer employeeId = Integer.parseInt(input.nextLine());
					details.setEmployeeId(employeeId);;
					System.out.println("Enter Department Id:");
					Integer departmentId = Integer.parseInt(input.nextLine());
					details.setDepartmentId(departmentId);
					System.out.println("Enter Grade Id:");
					Integer gradeId = Integer.parseInt(input.nextLine());
					details.setGradeId(gradeId);
					EmployeeGradeService.performTransaction(details);
					System.out.println("The transaction Id is: "+ details.getTransactionId());
					break;
				case 2:
					EmployeeGradeService.findAll();
					break;
				case 3:
					System.out.println("Enter Transaction Id:");
					int transactionId = Integer.parseInt(input.nextLine());
					EmployeeGradeService.deleteTransaction(transactionId);
					System.out.println("Transaction Deleted!");
					break;
				case 4:
					AdminClient.menu();
					break;
				case 5:
					System.out.println("Exit");
					System.exit(0);
			}
			System.out.println("Do you want to continue");
			String choice = input.nextLine() ;
			if(choice.equals("no")) {
				System.out.println("User don't want to continue");
				System.exit(0);
			}
		}	
		
		
	}

}
