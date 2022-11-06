package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProduct {

	public static void input(int id, String description, int price, String name, int quantity) {
		// insert product into database by Admin
		Connection connection = null;
		String sql = "insert into productlist(product_id, description, price, name, quantity) values(?, ?, ?, ?, ?)";
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, description);
			statement.setInt(3, price);
			statement.setString(4, name);
			statement.setInt(5, quantity);
			int i = statement.executeUpdate();
			System.out.println("Product added Successfully..." + i);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
