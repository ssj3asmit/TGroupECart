package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisteredUserList {

	public static void getRegisteredUser() {
		// retrive register user list
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Connection connection = ConnectionTest.getConnection();

			String sql = "Select * from userdata";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			System.out.println("----------------------<<< Registered User List >>>----------------------");
	
			while (rs.next()) {
				System.out.println(" " + rs.getString(1) );

			}
			System.out.println("------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
