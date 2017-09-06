package com.dhiru.shoppers.BO;

import com.dhiru.shoppers.dao.BuyDao;

public class BuyBo {

	public boolean sellingObjects(String itemNumber, String name, String numberOfObj) {
		
		
		BuyDao buyDao= new BuyDao();
		buyDao.sellingObjects(itemNumber,name,numberOfObj);
		
		return true;
	}

}
