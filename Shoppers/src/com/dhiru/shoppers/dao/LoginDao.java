package com.dhiru.shoppers.dao;

public class LoginDao {

	public boolean verifyUser(String userName, String password) {

		if(userName.equals("d") && password.equals("d"))
		{
		return true;
	}

	return false;
	}
	
}
