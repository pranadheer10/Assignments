package com.dhiru.shoppers.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhiru.shoppers.BO.InventoryBo;



public class InventoryServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
		

		String itemNumber = req.getParameter("itemNumber");
		int itN= Integer.parseInt(itemNumber);
		String name= req.getParameter("name");
		String numberOfObjects= req.getParameter("numberOfObj");
		int noObj= Integer.parseInt(numberOfObjects);
		InventoryBo inventoryBo = new InventoryBo();
		inventoryBo.addInventory(itN,name,noObj);  
		RequestDispatcher dispatcher=req.getRequestDispatcher("inventory.jsp");
		dispatcher.forward(req, resp);
	
		
		
	}
	
	
}
