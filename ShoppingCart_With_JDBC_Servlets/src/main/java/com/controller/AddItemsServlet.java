package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.AddItemsBo;
import com.bo.RegisterBo;
import com.data.Items;

public class AddItemsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	Items items= new Items();
			
		items.setItemNumber(req.getParameter("itemNumber"));
		items.setItemName(req.getParameter("itemName"));
		items.setPrice(req.getParameter("price"));
		items.setDescription(req.getParameter("description"));
		String result="Error.jsp";
			
			AddItemsBo additemsBo= new AddItemsBo();
			if(additemsBo.addItems(items)) {
				result="AddItems.jsp";
				//req.setAttribute(userName,"userName");
			}
			System.out.println(result);
			RequestDispatcher dispatcher=req.getRequestDispatcher(result);
			dispatcher.forward(req, resp);
		}

	}

	


