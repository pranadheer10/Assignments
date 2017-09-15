package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.dao.ItemsDao;
import com.data.Items;
import com.data.Orders;

public class OrderServlet extends HttpServlet{

	private static List<Orders> orderList= new ArrayList<Orders>();
	//private List<Orders> orderList;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Orders order= new Orders();
		
		HttpSession session=req.getSession();
		if(session.isNew()) {
			orderList= new ArrayList<Orders>();
			session.setAttribute("orderList", orderList);
		}
		else {
			
			String itemNumber=req.getParameter("itemNumber");
			String quantity=req.getParameter("quantity");
			
			
			//items.setItemNumber(req.getParameter("itemNumber"));
			
	
			
			ItemsDao itemsDao= new ItemsDao();
			Items item=itemsDao.getRecordByNumber(itemNumber);
			req.getSession().getAttribute("orderList");
			System.out.println(itemNumber+ quantity+" printing text");
			
			order.setItems(item);
			order.setQuantity(quantity);
			
			
			 
			System.out.println(order);
			orderList.add(order);
			req.getSession().setAttribute("orderList", orderList);
			
			for(Orders myorder:orderList) {
				System.out.println(myorder.getItems()+" "+myorder.getQuantity());
				
			}
		RequestDispatcher rd = req.getRequestDispatcher("DisplayItems.jsp");
			rd.forward(req, resp);
		}
	}
	

}
