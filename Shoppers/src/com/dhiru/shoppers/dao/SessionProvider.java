package com.dhiru.shoppers.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {
private static Session session;
	public static Session  getSession(){
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		session= factory.openSession();
		return session;
}
}
