package com.bo;

import com.dao.RegisterDao;

public class RegisterBo {

	public boolean register(String userName, String email, String phoneNumber, String password) {
		
		RegisterDao registerDao= new RegisterDao();
		if(registerDao.registerUser(userName,email,phoneNumber,password)) {
			System.out.println("registering users");
			return true;
		}
		
		
		return false;
	}

}
