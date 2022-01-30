package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Department;
import com.simran.service.DepartmentService;
import com.simran.service.TransactionService;

public class EmployeeSalary {

	public static void menu() {
		Scanner input = new Scanner (System.in);
		while(true) {
			System.out.println("Enter Transaction Id");
			Integer transactionId = Integer.parseInt(input.nextLine());
			TransactionService.getTransaction(transactionId);
			System.out.println("1. See Another Transaction details ");
			System.out.println("2. Back");
			System.out.println("3. Exit");
			System.out.println("Enter the Choice:");
			Integer option = Integer.parseInt(input.nextLine());

			switch(option)
			{
				case 1:
					EmployeeSalary.menu();
					break;
				case 2:
					AdminClient.menu();
					break;
				case 3:
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
