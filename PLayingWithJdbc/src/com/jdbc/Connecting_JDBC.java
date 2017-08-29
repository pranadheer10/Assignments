package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connecting_JDBC {

	
	public static void main(String[] args) {
		Connecting_JDBC cJDBC= new Connecting_JDBC();
		cJDBC.getConnection();
		cJDBC.insertIntoDataBase();
		cJDBC.getConnection();
	}
	public void getConnection() {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup", "root", "root");
			Statement stm = con.createStatement();
			ResultSet myResult = stm.executeQuery("select * from students");
			while (myResult.next()) {
				System.out.println(myResult.getString("fname") + ", " + myResult.getString("lname"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void insertIntoDataBase() {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			Statement stm= con.createStatement();
			String query="insert into students"+"(fname,lname)"+" values('john', 'jj')";
			stm.executeUpdate(query);
			System.out.println("Inserted............");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	//	try {
/*			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup", "root", "root");
			Statement stm = con.createStatement();
			ResultSet myResult = stm.executeQuery("select * from students");
			while (myResult.next()) {
				System.out.println(myResult.getString("fname") + ", " + myResult.getString("lname"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/	}

}

