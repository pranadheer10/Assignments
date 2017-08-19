package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterating_Collections {
	private List<Users> aryList =new ArrayList<>();

	Users u= new Users();
	Users u1= new Users();
	Users u2= new Users();
	Users u3= new Users();
	
	
	
	public List<Users> create(){
		
		u.setfName("dheeru");
		u.setlName("bhai");

		u1.setfName("d29");
		u1.setlName("babe");
		
		u2.setfName("dh23");
		u2.setlName("mccdc");
		
		u3.setfName("d31");
		u3.setlName("MCBC");
		
		aryList.add(u);
		aryList.add(u1);
		aryList.add(u2);
		aryList.add(u3);
		
		return aryList;
		
	}
	
	public boolean display() {
		
		Iterator<Users> it = aryList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		return true;
	}
}
