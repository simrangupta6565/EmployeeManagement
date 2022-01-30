package com.simran.presentation;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		while(true) {
			System.out.println("----------------------");
			System.out.println("Login Screen");
			System.out.println("----------------------");
			
			System.out.println("1. Admin Login ");
			System.out.println("2. Employee Login ");
			System.out.println("3. Exit");
			System.out.println("Enter the Choice:");
			Integer option = input.nextInt();
			
			
			switch(option)
			{
				case 1:
					
					LoginAdmin.menu();
					break;
				case 2:
					LoginEmployee.menu();
					break;
				
				case 3:
					System.out.println("Exit");
					System.exit(0);
			}
			System.out.println("Do you want to continue");
			String choice = input.next();
			if(choice.equals("no")) {
				System.out.println("User don't want to continue");
				System.exit(0);
			}
		}	
		
	}
}
