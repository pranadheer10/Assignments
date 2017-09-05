package com.bo;

import com.dao.EditDao;

public class EditBo {

	public boolean update(String userName, String email, String phoneNumber, String password, String originalUserName) {

		EditDao editDao= new EditDao();
		return editDao.update(userName,email,phoneNumber,password,originalUserName);
	}

}
