package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bo.EditBo;

public class EditServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("userName");
		String email = req.getParameter("email");
		String phoneNumber = req.getParameter("phoneNumber");
		String password = req.getParameter("password");
		String sessionUser=req.getParameter("sessionUser");
		String originalUserName= req.getParameter("originalUserName");
		System.out.println(originalUserName);
		EditBo ebo=new EditBo(); 
		
		if(ebo.update(userName, email, phoneNumber, password,originalUserName)) {
			System.out.println(sessionUser);
			if(sessionUser.equals("Admin")) {
				
				RequestDispatcher rd = req.getRequestDispatcher("AdminHome.jsp");
				rd.forward(req, resp);
			}else {
				RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
				rd.forward(req, resp);
			}
			

		}
		
		
		
	}

	
	
	
}
