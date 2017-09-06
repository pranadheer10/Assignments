package com.dhiru.shoppers.BO;

import com.dhiru.shoppers.dao.InventoryDao;

public class InventoryBo {

	/*public boolean addInventory(String itemNumber, String name, String numberOfObjects) {
		
		InventoryDao inventoryDao= new InventoryDao();
		
		return inventoryDao.addInventory(itemNumber,name,numberOfObjects);
	}*/

	public boolean addInventory(int itN, String name, int noObj) {

	InventoryDao inventoryDao= new InventoryDao();
		
	return inventoryDao.addInventory(itN,name,noObj);

		
	}

}
