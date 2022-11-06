package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDetails {
	// method to check stock details by Admin
	public void stockDetails() {
		System.out.println("********************_Full Stock Details_*******************");
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			String sql = "select * from productlist";
			statement = connection.prepareStatement(sql);

			ResultSet resultSet = statement.executeQuery();
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Product ID\tDescription\t\tPrice\t\tName\t\tQuantity");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t\t" + resultSet.getString(2) + "\t\t\t" + resultSet.getInt(3)
						+ "\t\t" + resultSet.getString(4) + "\t\t" + resultSet.getInt(5));
			}
			System.out.println("----------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				//
				e.printStackTrace();
			}

		}
	}

}
