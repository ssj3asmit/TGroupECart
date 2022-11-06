package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.customer.CustomerRecord;
import com.jdbc.ConnectionTest;

public class Billing {

	public static void cartProduct() {
		int overAllPrice = 0;
		char choice = '\0';

		Scanner scan = new Scanner(System.in);
		// to store product
		List<Product> product = new ArrayList<Product>();
		System.out.println("Enter your Name :- ");
		String customerName = scan.next();
		//
		do {
			// read input values
			System.out.println("****************************_Available Products_***************************");

			System.out.println("Enter the Product Id to Buy  ::");
			int id = scan.nextInt();

			Connection connection = null;
			ResultSet rs = null;
			try {
				connection = ConnectionTest.getConnection();
				String sql = "Select name, price, quantity from productlist where product_id = ?";
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setInt(1, id);
				rs = pst.executeQuery();
				int totalPrice = 0;
				while (rs.next()) {
					String productName = rs.getString(1);
					int price = rs.getInt(2);
					int quantity = rs.getInt(3);

					productName = productName;

					System.out.println("Enter the Product Quantity  ::");
					int quantity1 = scan.nextInt();
					quantity = quantity1;

					price = price;

					// calculate total price for  product
					totalPrice = price * quantity;

					// calculate price
					overAllPrice += totalPrice;

					// create Product class object and add it to the list
					product.add(new Product(productName, quantity, price, totalPrice));

					// ask for continue?
					System.out.print("Want to add more item? (y or n): ");
					choice = scan.next().charAt(0);

					// read remaining characters, don't store (no use)
					scan.nextLine();
					CustomerRecord.customerRecord(customerName, productName, quantity, price, totalPrice);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} while (choice == 'y' || choice == 'Y');

		Product.displayFormat();
		for (Product p : product) {
			p.display();
		}
		System.out.println("-------------------------------------------------------------------------------");
		// overall price
		System.out.println("\nTotal Price = " + overAllPrice);
		System.out.println("*******************| THANK YOU |*******************");
	}

}
