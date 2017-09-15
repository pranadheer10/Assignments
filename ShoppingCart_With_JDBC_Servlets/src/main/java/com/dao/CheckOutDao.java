package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.data.Orders;

public class CheckOutDao {

	public boolean confirm(List<Orders> orderList) {

	
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup","root","root");
			Statement stm= con.createStatement();
			for (Orders ol : orderList) {

				String itemNumber=ol.getItems().getItemNumber();
				String itemName=ol.getItems().getItemName();
				String price=ol.getItems().getPrice();
				String description=ol.getItems().getDescription();
				String quantity=ol.getQuantity();
				Integer price1=Integer.parseInt(price);
				Integer quantity1=Integer.parseInt(quantity);
				Integer totalPrice1=price1*quantity1;
				String totalPrice=totalPrice1.toString();
				
				String sql = "insert into checkouts (itemNumber, itemName, price, description, qunatity, totalPrice) values('"
						+ itemNumber + "', '" + itemName + "', '"
						+ price + "', '" + description + "', '" + quantity+ "', '"+totalPrice
						+ "');";
				stm.executeUpdate(sql);
			}
			System.out.println("Adding checkout data....");
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		
		}

		return false;

	}

}
