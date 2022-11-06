package com.user;

import java.util.Scanner;

public class User {// User Registration page
	// view as Customer
	public static void user() {
		System.out.println("---------------------------------|E-Mart|--------------------------------------");
		System.out.println("View as a Customer\n");
		System.out.println("\t\tChoose Option :- \n\t\t1 :- Login\n\t\t2 :- Sign Up\n");
		System.out.println("---------------------------------|E-Mart|--------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ::");
		int userInput = sc.nextInt();

		if (userInput == 1) {// if press 1 login

			System.out.println("Enter Username : ");
			String uName = sc.next();
			System.out.println("Enter Password : ");
			String uPass = sc.next();
			Login.getUser(uName, uPass);
		} else if (userInput == 2) { // if press 2 register
			System.out.println("Enter Username : ");
			String username = sc.next();
			System.out.println("Enter Password : ");
			String password = sc.next();
			System.out.println("---------------------------------|E-Mart|--------------------------------------");
			SignUp.newUser(username, password);
		}

	}

}
