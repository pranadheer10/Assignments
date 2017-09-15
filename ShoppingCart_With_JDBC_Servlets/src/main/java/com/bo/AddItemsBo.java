package com.bo;

import com.dao.ItemsDao;
import com.data.Items;

public class AddItemsBo {

	

	public boolean addItems(Items items) {
		
		ItemsDao itemsDao= new ItemsDao();
		return itemsDao.addItems(items);
	}

}
