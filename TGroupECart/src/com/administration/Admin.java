package com.administration;

import java.util.Scanner;

import com.jdbc.StockDetails;
import com.jdbc.CustomerHistory;
import com.jdbc.InsertProduct;
import com.jdbc.RegisteredUserList;

public class Admin {

	public static void admin() throws InvalidInput {
		//
		String pass = "admin123";
		Scanner password = new Scanner(System.in);
		System.out.println("---------------------------------|E-Mart|--------------------------------------");
		// Admin Verification
		System.out.println("Please Enter password : ");
		String pWord = password.next();
		System.out.println("---------------------------------|E-Mart|--------------------------------------");
		// Compare if Password is Correct or Not...
		if (pass.equals(pWord)) {
			// if correct view as Admin choose option
			System.out.println("View as an Admin\n");
			System.out.println(
					"\t\tChoose Option :- \n\t\t1 :- Add Product\n\t\t2 :- Stock Details\n\t\t3 :- RegisteredUserList\n\t\t4 :- Customer History\n");
			System.out.println("Enter ::");
			System.out.println("---------------------------------|E-Mart|--------------------------------------");

			System.out.println("Enter ::");
			int adminInput = password.nextInt();

			if (adminInput == 1) {// if 1 add new product
				Scanner newProduct = new Scanner(System.in);
				System.out.println("Enter Product ID :- ");
				int id = newProduct.nextInt();
				System.out.println("Enter Product Description :- ");
				String description = newProduct.next();
				System.out.println("Enter Product Price :- ");
				int price = newProduct.nextInt();
				System.out.println("Enter Product Name :- ");
				String name = newProduct.next();
				System.out.println("Enter Product Quantity :- ");
				int quantity = newProduct.nextInt();

				InsertProduct.input(id, description, price, name, quantity);

			} else if (adminInput == 2) { // if 2 check stock details

				StockDetails checkQuantity = new StockDetails();
				checkQuantity.stockDetails();

			} else if (adminInput == 3) { // if 3 registered user list
				RegisteredUserList.getRegisteredUser();
			} else if (adminInput == 4) { // if 4 check customer history
				Scanner customerRec = new Scanner(System.in);
				System.out.println("Enter Customer Name :- ");
				String customerName = customerRec.next();
				CustomerHistory.customerRecord(customerName);

			} else {
				System.out.println("Please Enter Correct Choice!!");
				admin();
			}
		} else {// if password is incorrect
			throw new InvalidInput("Wrong Password! Please Enter Correct Choice!!");
		}

	}
}
