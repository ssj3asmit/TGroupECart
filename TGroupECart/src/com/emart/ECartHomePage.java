package com.emart;

import java.util.Scanner;
import com.administration.Admin;
import com.administration.InvalidInput;
import com.user.User;

public class ECartHomePage {

	public static void main(String[] args) throws InvalidInput {

		System.out.println("---------------------------------|E-Mart|--------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t\tChoose Option : \n\t\t1 : Admin\n\t\t2 : User\n\n");
		System.out.println("---------------------------------|E-Mart|--------------------------------------");
		System.out.println("Enter ::");
		// Choose between Admin and User
		int input = sc.nextInt();
		if (input == 1) {// >> call Admin method()
			Admin.admin();
		} else if (input == 2) {
			User.user();// >> call User method();
		} else {
			throw new InvalidInput("Invalid Input... Please! Enter Valid Input");
		}
		
	}
}
