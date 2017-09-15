package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public boolean verify(String userName, String password) {

		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup", "root", "root");
			Statement stm = con.createStatement();

			String query = "SELECT name, password FROM users;";
			stm.executeQuery(query);
			ResultSet rs = stm.getResultSet();

			while (rs.next()) {
				String dbUsername = rs.getString("name");
				String dbPassword = rs.getString("password");

				if (dbUsername.equals(userName) && dbPassword.equals(password)) {
					System.out.println("OK");
					return true;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
