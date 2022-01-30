package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Employee;


public class AdminClient {

	public static void menu() {
		Scanner input = new Scanner (System.in);
		while(true) {
		System.out.println("----------------------");
		System.out.println("Welcome Admin");
		System.out.println("----------------------");
		
		System.out.println("1. Manage Employee");
		System.out.println("2. Add new Department");
		System.out.println("3. Add new Grade");
		System.out.println("4. Employee Grade Details");
		System.out.println("5. Prepare Monthly Salary");
		System.out.println("6. Exit");
		
		System.out.println("Enter the Choice:");
		Integer option = Integer.parseInt(input.nextLine());
		
		switch(option)
		{
			case 1:
				 ManageEmployee.menu();
				break;
			case 2:
				AddDepartment.menu();
				break;
			case 3:
				AddGrade.menu();
				break;
			case 4:
				EmployeeGrade.menu();
				break;
			case 5:
				EmployeeSalary.menu();
				break;
			case 6:
				System.out.println("Exit");
				System.exit(0);
		}
		System.out.println("Do you want to continue");
		String choice =input.nextLine();
		if(choice.equals("no")) {
			System.out.println("User don't want to continue");;
			System.exit(0);
		}
		
	}
	}

}
