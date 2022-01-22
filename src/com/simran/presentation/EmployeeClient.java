package com.simran.presentation;

import java.util.Scanner;

import com.simran.model.Employee;
import com.simran.service.EmployeeService;

public class EmployeeClient {
	public static void main(String[] args) {
		Integer employeeId=null;
		String  employeeName=null;
		String employeeEmail=null;
		Scanner input = new Scanner (System.in);
		while(true) {
		System.out.println("----------------------");
		System.out.println("Teacher Information");
		System.out.println("----------------------");
		
		System.out.println("1. Add Records");
		System.out.println("2. Update Record");
		System.out.println("3. Delete  Record");
		System.out.println("4. Find Record");
		System.out.println("5. Find All Recored");
		System.out.println("6. Exit");
		
		System.out.println("Enter the Choice:");
		Integer option = input.nextInt();
		Employee employee = new Employee();
		
		switch(option)
		{
			case 1:
				System.out.println("Enter Employee Id:");
				employeeId = input.nextInt();
				System.out.println("Enter the Employee Name:");
				employeeName = input.next();
				System.out.println("Enter the Employee Email:");
				employeeEmail = input.next();
				employee.setEmployeeId(employeeId);
				employee.setEmployeeName(employeeName);
				employee.setEmployeeEmail(employeeEmail);
				EmployeeService.addRecord(employee);
				System.out.println("Add Record");
				break;
			case 2:
				System.out.println("Enter Employee Id:");
				employeeId = input.nextInt();
				System.out.println("Enter the Employee Name:");
				employeeName = input.next();
				System.out.println("Enter the Employee Email:");
				employeeEmail = input.next();
			
				employee.setEmployeeId(employeeId);
				employee.setEmployeeName(employeeName);
				employee.setEmployeeEmail(employeeEmail);
				
				EmployeeService.updateRecord(employee);
				System.out.println("Update Record");
				break;
			case 3:
				System.out.println("Enter the Teacher Id:");
				employeeId = input.nextInt();
				
				EmployeeService.delateRecord(employeeId);
				System.out.println("Delete Record");
				break;
			case 4:
				System.out.println("Enter the Teacher Id:");
				employeeId = input.nextInt();
				
				employee =EmployeeService.findRecord(employeeId);
				if(employee==null) {
					System.out.println("Record Not Found:");
				}
				else {
					System.out.println("1. Employee Id is :"+employee.getEmployeeId());
					System.out.println("2. Employee Name is :"+employee.getEmployeeName());
					System.out.println("3. Employee Email is: "+employee.getEmployeeEmail());
				}
				break;
			case 5:
				System.out.println("Method to be added...");
				break;
			case 6:
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
