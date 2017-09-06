package com.dhiru.shoppers.dao;

import org.hibernate.Session;

public class InventoryDao {
/*
	public boolean addInventory(String itemNumber, String name, String numberOfObjects) {
		
		Session session= SessionProvider.getSession();
		Inventory i = new Inventory();
		i.setItemNumber(itemNumber);
		i.setName(name);
		i.setNumberOfObjects(numberOfObjects);
		session.beginTransaction();
		session.save(i);
		session.getTransaction().commit();
		return true;
	}*/

	public boolean addInventory(int itN, String name, int noObj) {
		
		Session session= SessionProvider.getSession();
		Inventory i = new Inventory();
		i.setItN(itN);
		i.setName(name);
		i.setNoObj(noObj);
		session.beginTransaction();
		session.save(i);
		session.getTransaction().commit();
		return true;
	}

}
