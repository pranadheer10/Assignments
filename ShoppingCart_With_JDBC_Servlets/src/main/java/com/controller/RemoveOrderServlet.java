package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.Orders;

public class RemoveOrderServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String itemNumber= req.getParameter("itemNumber");
	
	List<Orders> order= (List<Orders>) req.getSession().getAttribute("orderList");;
	int count=0;
	int index=0;
	for(Orders o:order) {
		
		String itemNo=o.getItems().getItemNumber();
		if(itemNo.equals(itemNumber)) {
	     index=count;
		}
		count=count+1;
	}
	order.remove(index);
	for(Orders o1:order) {
		System.out.println(o1);
	}
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayOrder.jsp");
	dispatcher.forward(req, resp);
	
	}
	
	

}
