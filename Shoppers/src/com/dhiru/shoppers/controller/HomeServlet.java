package com.dhiru.shoppers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhiru.shoppers.BO.LoginBo;

public class HomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
		
		
		String userName=req.getParameter("name");
		String password=req.getParameter("password");
		String result="error.jsp";
		
		
		
		LoginBo bo= new LoginBo(); 
		if(bo.verifyUser(userName,password)){
		
			
			HttpSession session= req.getSession();
			
			//setting attribute name to display in home_page
			req.setAttribute("userName", userName);
			result="home_page.jsp";
			// this is used to display application name inside tab
			// we are getting everywhere (context)
			
			
			ServletContext context= getServletContext();
			String value=context.getInitParameter("applicationName");
			ServletConfig config=getServletConfig();
			
			//to get only page name
			String page=config.getInitParameter("pageName");
			req.setAttribute("pageName", page);
			
			session.setAttribute("userName", userName);
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher(result);
		dispatcher.forward(req, resp);
	
}
}