package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerHistory {

	public static void customerRecord(String customerName) {
		// check customer history
		Connection connection = null;
		String sql = "select productName, quantity, price, totalPrice from customerRecord where customerName = ?";
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, customerName);
		
			ResultSet resultSet = statement.executeQuery();
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Product Name\tQuantity\tPrice\t\tTotalPrice");
			while (resultSet.next()) {	
				System.out.println(resultSet.getString(1) + "\t\t" +resultSet.getInt(2) + "\t\t" +resultSet.getInt(3) + "\t\t" +resultSet.getInt(4) + "\t\t");
			}	
			System.out.println("------------------------------------------------------------------------");
		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}
}
