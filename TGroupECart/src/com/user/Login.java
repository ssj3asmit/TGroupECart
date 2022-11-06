package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.customer.Purchase;
import com.jdbc.ConnectionTest;
import com.products.Billing;

public class Login {
	// login for already existing user
	public static void getUser(String uName, String uPass) {

		Connection connection = null;
		String sql = "select * from userdata where username = ? and password = ?";
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, uName);
			statement.setString(2, uPass);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				if (resultSet.getString(1).equals(uName)) {
					if (resultSet.getString(2).equals(uPass)) {
						System.out.println("Login Successfull...");
						Scanner scan = new Scanner(System.in);
						System.out.println("Press 1 for Product List : ");
						int list = scan.nextInt();
						System.out.println(
								"---------------------------------|E-Mart|--------------------------------------");
						Purchase.productList();//>> display product list
						Billing.cartProduct();//>> billing system
						
					}
				}

			}

		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}

}
