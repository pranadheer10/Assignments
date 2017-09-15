package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckOutDao;
import com.data.Orders;

public class CheckOutServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	List<Orders> orderList= (List<Orders>) req.getSession().getAttribute("orderList");
	
	for(Orders o:orderList) {
		System.out.println(o);
	}
	
	CheckOutDao checkoutDao= new CheckOutDao();
	
	if(checkoutDao.confirm(orderList)) {
		
		req.getSession().invalidate();
		/*for(int i=0;i<orderList.size();i++) {
			orderList.remove(i);
		}*/
		RequestDispatcher rd = req.getRequestDispatcher("DisplayItems.jsp");
		rd.forward(req, resp);
	}
	}
	
	

}
