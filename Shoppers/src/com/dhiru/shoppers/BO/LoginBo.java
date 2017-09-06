package com.dhiru.shoppers.BO;

import com.dhiru.shoppers.dao.LoginDao;

public class LoginBo {

	public boolean verifyUser(String userName, String password) {
		
		
		LoginDao logindao= new LoginDao();
		
		return logindao.verifyUser(userName, password);
	}

}
