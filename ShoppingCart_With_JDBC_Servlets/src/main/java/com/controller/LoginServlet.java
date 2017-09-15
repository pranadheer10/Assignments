package com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bo.LoginBo;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String result = "login.jsp";

		/*
		 * ServletContext servletContext = getServletContext(); String value =
		 * servletContext.getInitParameter("applicationName");
		 */

		LoginBo loginBo = new LoginBo();

		if (loginBo.verify(userName, password)) {
			
			HttpSession session1= req.getSession();
			session1.setAttribute("userName", userName);
			
			result = "Home.jsp";
			if(userName.equals("Admin")) {
				result="AdminHome.jsp";
			}
			
			req.setAttribute("userName", userName);
			ServletConfig config = getServletConfig();
			String servletName = config.getInitParameter("servletName");
			req.setAttribute("servletName", servletName);
			//System.out.println(servletName);
		}
		RequestDispatcher rd = req.getRequestDispatcher(result);
		rd.forward(req, resp);

	}

}
