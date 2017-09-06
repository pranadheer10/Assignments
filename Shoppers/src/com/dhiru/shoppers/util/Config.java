package com.dhiru.shoppers.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Config implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {

	
	String data="welcome to shoppers.com";
	
	System.out.println("data can be deployed....");
	ServletContext context= event.getServletContext();
	context.setAttribute("info", data);
	
	
	
	}

	
}
