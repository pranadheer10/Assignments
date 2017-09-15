package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditDao {

	public boolean update(String userName, String email, String phoneNumber, String password, String originalUserName) {

		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("update users set name=?,email=?,phoneNumber=?,password=? where name=?");
			ps.setString(1,userName);
			ps.setString(2,email);
			ps.setString(3,phoneNumber);
			ps.setString(4,password);
			ps.setString(5, originalUserName);
			ps.executeUpdate();
			System.out.println("updated.. "+ userName+email+password+phoneNumber);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
