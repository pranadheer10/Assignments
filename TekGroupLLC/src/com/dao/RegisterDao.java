package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.data.Users;



public class RegisterDao {

	public boolean registerUser(String userName, String email, String phoneNumber, String password) {

		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			Statement stm= con.createStatement();
			String sql="insert into users (name, email, phoneNumber, password) values('"+userName+"', '"+email+"', '"+phoneNumber+"', '"+password+"');";
			stm.executeUpdate(sql);
			System.out.println("registered data....");
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}


	public boolean editUsers(Users u) {	
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("update users set name=?,email=?,phoneNumber=?,password=? where name=?");
			ps.setString(1,u.getUserName());
			ps.setString(2,u.getEmail());
			ps.setString(3,u.getPhoneNumber());
			ps.setString(4,u.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	
	public static List<Users> getAllRecords(){
		List<Users> list=new ArrayList<Users>();
		
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("select * from users");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Users u=new Users();
				u.setUserName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPhoneNumber(rs.getString("phoneNumber"));
				u.setPassword(rs.getString("password"));
				u.setOriginalUserName(rs.getString("name"));
				
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public static int delete(String userName){
		int status=0;
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("delete from users where name=?");
			ps.setString(1,userName);
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	
	public static Users getRecordByName(String userName){
		Users u=null;
		try{
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("select * from users where name=?");
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Users();
				u.setUserName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPhoneNumber(rs.getString("phoneNumber"));
				u.setPassword(rs.getString("password"));			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
}
