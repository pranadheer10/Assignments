package com.bo;

import com.dao.LoginDao;

public class LoginBo {

	public boolean verify(String userName, String password) {

		LoginDao loginDao = new LoginDao();
		if (loginDao.verify(userName, password)) {
			System.out.println("verified user details");
			return loginDao.verify(userName, password);
		}

		return false;
	}

}
