package com.simran.presentation;
import java.util.*;
public class LoginAdmin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String userName;
		String password;
		do {
			System.out.println("Enter Admin User Name:");
			userName = s.nextLine();
			System.out.println("Enter Password:");
			password = s.nextLine();
			if(userName.equals("admin") && password.equals("admin"))
				break;
			else
				System.out.println("Invalid Credentials!");
		}while( true);
		AdminClient.menu(userName, password);
		
	}
}
