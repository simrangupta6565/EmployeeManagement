package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Department;
import com.simran.service.DepartmentService;

public class AddDepartment {

	public static void menu() {
		DepartmentService.findAll();
		Scanner input = new Scanner (System.in);
		while(true) {
			System.out.println("1. Add Department ");
			System.out.println("2. Delete Department ");
			System.out.println("3. Back");
			System.out.println("4. Exit");
			System.out.println("Enter the Choice:");
			Integer option = Integer.parseInt(input.nextLine());
			Department d = new Department();
			
			switch(option)
			{
				case 1:
					System.out.println("Enter Department Name:");
					String departmentname = input.nextLine();
					d.setDepartmentName(departmentname);
					DepartmentService ds = new DepartmentService();
					ds.addDepartment(d);
					System.out.println("Department Added!");
					break;
				case 2:
					System.out.println("Enter Department Name:");
					int departmentId = Integer.parseInt(input.nextLine());
					DepartmentService.deleteDepartment(departmentId);
					System.out.println("Department Deleted!");
					break;
				case 3:
					AdminClient.menu();
					break;
				case 4:
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
