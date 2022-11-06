package com.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.ConnectionTest;

public class Purchase {

	public static void productList() {
		// if press show product list
		Connection connection = null;
		String sql = "select  * from productlist";
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			statement = connection.prepareStatement(sql);

			ResultSet resultSet = statement.executeQuery();
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Product ID\tProduct Description\tPrice\t\tProduct Name\t\tquantity");
			System.out.println();
			while (resultSet.next()) {
				System.out.println( resultSet.getInt(1) + "\t\t" + resultSet.getString(2) + "\t\t"
						+ resultSet.getInt(3) + "\t\t" + resultSet.getString(4)+"\t\t" + resultSet.getInt(5));
			}
			System.out.println("---------------------------------------------------------------------------");

		} catch (SQLException e) {
			//
			e.printStackTrace();
		}
	}
}
