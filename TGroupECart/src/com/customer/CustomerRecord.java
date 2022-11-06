package com.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.ConnectionTest;

public class CustomerRecord {

	public static void customerRecord(String customerName, String productName, int quantity, int price, int totalPrice) {

		Connection connection = null;
		String sql = "insert into customerRecord(customerName, productName, quantity, price, totalPrice) values(?, ?, ?, ?, ?)";
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, customerName);
			statement.setString(2, productName);
			statement.setInt(3, quantity);
			statement.setDouble(4, price);
			statement.setDouble(5, totalPrice);
			statement.executeUpdate();
		//	System.out.println("Customer Record added Successfully..." + i);
		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}
}
