package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.RegisterBo;

public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String userName= req.getParameter("userName");
		String email= req.getParameter("email");
		String phoneNumber= req.getParameter("phoneNumber");
		String password= req.getParameter("password");
		String result="Registration.jsp";
		
		RegisterBo registerBo= new RegisterBo();
		if(registerBo.register(userName,email,phoneNumber,password)) {
			result="login.jsp";
			req.setAttribute(userName,"userName");
		}
		System.out.println(result);
		RequestDispatcher dispatcher=req.getRequestDispatcher(result);
		dispatcher.forward(req, resp);
	}

}
