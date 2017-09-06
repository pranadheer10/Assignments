package com.dhiru.shoppers.dao;

public class BuyDao {

	public boolean sellingObjects(String itemNumber, String name, String numberOfObj) {
		
		if(itemNumber.equals("1")&& name.equals("pen")&& numberOfObj.equals("10"))
		{		return true;
	}
	
	return false;
	
	}
	
}
