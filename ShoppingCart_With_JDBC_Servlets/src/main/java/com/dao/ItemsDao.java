package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.data.Items;
import com.data.Users;

public class ItemsDao {

	public boolean addItems(Items items) {
		Connection con=null;
		Statement stm=null;
		try {
			con= ConnectionPool.getInstance().getConnection();
			stm= con.createStatement();
			String sql="insert into Items (itemNumber, itemName, price, description) values('"+items.getItemNumber()+"', '"+items.getItemName()+"', '"+items.getPrice()+"', '"+items.getDescription()+"');";
			stm.executeUpdate(sql);
			System.out.println("Adding Items data....");
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stm!=null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}
	
		return false;
	}

	public static List<Items> getAllRecords(){
		List<Items> list=new ArrayList<Items>();
		
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("select * from Items");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Items items= new Items();
				items.setItemNumber(rs.getString("itemNumber"));
				items.setItemName(rs.getString("itemName"));
				items.setPrice(rs.getString("price"));
				items.setDescription(rs.getString("description"));
				list.add(items);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public static Items getRecordByNumber(String itemNumber){
		Items items=null;
		try{
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			PreparedStatement ps=con.prepareStatement("select * from Items where itemNumber=?");
			ps.setString(1, itemNumber);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				items=new Items();
				items.setItemNumber(rs.getString("itemNumber"));
				items.setItemName(rs.getString("itemName"));
				items.setPrice(rs.getString("price"));
				items.setDescription(rs.getString("description"));			}
		}catch(Exception e){System.out.println(e);}
		return items;
	}
	
}
