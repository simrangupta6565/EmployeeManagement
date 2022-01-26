package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Employee;
import com.simran.model.EmployeeDetails;
import com.simran.service.EmployeeService;

public class ManageEmployee {
	public static void menu() {
		{
			String  employeeUserName=null;
			String employeepassword = null;
			String employeeEmail=null;
			String employeeName= null;
			String employeeDob = null;
			String employeeDoj = null;
			String employeeAddress = null;
			
			Scanner input = new Scanner (System.in);
			while(true) {
			System.out.println("----------------------");
			System.out.println("Manage Employee");
			System.out.println("----------------------");
			
			System.out.println("1. Add Records");
			System.out.println("2. Update Record");
			System.out.println("3. Delete  Record");
			System.out.println("4. Find Record");
			System.out.println("5. List All Recored");
			System.out.println("6. Exit");
			
			System.out.println("Enter the Choice:");
			Integer option = Integer.parseInt(input.nextLine());
			Employee employee = new Employee();
			EmployeeDetails details = new EmployeeDetails();
			switch(option)
			{
				case 1:
					System.out.println("Enter the Employee UserName:");
					employeeUserName = input.nextLine();
					System.out.println("Enter the Employee Password:");
					employeepassword = input.nextLine();
					System.out.println("Enter the Employee Email:");
					employeeEmail = input.nextLine();
					System.out.println("Enter the Employee Name:");
					employeeName = input.nextLine();
					System.out.println("Enter the Employee Date Of Birth:");
					employeeDob = input.nextLine();
					System.out.println("Enter the Employee Date Of Joining:");
					employeeDoj = input.nextLine();
					System.out.println("Enter the Employee Address:");
					employeeAddress = input.nextLine();
					employee.setEmployeeUserName(employeeUserName);
					employee.setEmployeePassword(employeepassword);
					System.out.println("Employee Details given "+employee.getEmployeeUserName()+" "+employee.getEmployeePassword());
					details.setEmployeeEmail(employeeEmail);
					details.setEmployeeName(employeeName);
					details.setEmployeeDob(employeeDob);
					details.setEmployeeDoj(employeeDoj);
					details.setEmployeeAddress(employeeAddress);
					employee.setDetails(details);
					EmployeeService.addRecord(employee);
					System.out.println("Employee Added!");
					break;
				case 2:
					System.out.println("Enter the Employee UserName:");
					employeeName = input.nextLine();
					System.out.println("Enter the Employee Password:");
					employeeEmail = input.nextLine();
					System.out.println("Enter the Employee Email:");
					employeeEmail = input.nextLine();
					System.out.println("Enter the Employee Name:");
					employeeName = input.nextLine();
					System.out.println("Enter the Employee Date Of Birth:");
					employeeDob = input.nextLine();
					System.out.println("Enter the Employee Date Of Joining:");
					employeeDoj = input.nextLine();
					System.out.println("Enter the Employee Address:");
					employeeAddress = input.nextLine();
					
					employee.setEmployeeUserName(employeeUserName);
					employee.setEmployeePassword(employeepassword);
					details.setEmployeeEmail(employeeEmail);
					details.setEmployeeName(employeeName);
					details.setEmployeeDob(employeeDob);
					details.setEmployeeDoj(employeeDoj);
					details.setEmployeeAddress(employeeAddress);
					employee.setDetails(details);
					EmployeeService.updateRecord(employee);
					System.out.println("Employee Updated!");
					break;
				case 3:
					System.out.println("Enter the Teacher Id:");
					Integer employeeId = Integer.parseInt(input.nextLine());
					
					EmployeeService.deleteRecord(employeeId);
					System.out.println("Employee Removed!");
					break;
				case 4:
					System.out.println("Enter the Teacher Id:");
					employeeId = Integer.parseInt(input.nextLine());
					
					employee =EmployeeService.findRecord(employeeId);
					if(employee==null) {
						System.out.println("Record Not Found!");
					}
					else {
						System.out.println("\tEmployee Id\tEmployee UserName\tEmployee Password\tEmployee Name\tEmployee Email\tEmployee DOB\tEmployee DOJ\tEmployee Address");
						System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("\t"+ employee.getEmployeeId()+ "\t"+ employee.getEmployeeUserName()+"\t"+employee.getEmployeePassword()+"\t"+employee.getDetails().getEmployeeName()
								+"\t"+employee.getDetails().getEmployeeEmail()+"\t"+employee.getDetails().getEmployeeDob()+"\t"+employee.getDetails().getEmployeeDoj()
								+"\t"+employee.getDetails().getEmployeeAddress());
						System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------------------");
					}
					break;
				case 5:
					EmployeeService.listAll();
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
}
