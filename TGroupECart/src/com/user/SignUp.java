package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.ConnectionTest;

public class SignUp {
	// sign up for new user
	public static void newUser(String username, String password) {
		Connection connection = null;
		String sql = "insert into userdata(username, password) values (?, ?)";
		PreparedStatement statement = null;
		try {
			connection = ConnectionTest.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.executeUpdate();
			System.out.println("Registration Successfull...");
			User.user();
			
		} catch (SQLException e) {
			//
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
