package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/emartdb?characterEncoding=utf8";
			connection = DriverManager.getConnection(url, "root", "password");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
