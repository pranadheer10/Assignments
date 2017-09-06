package com.dhiru.shoppers.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {
	
	@Id
	private String name; 
	private int itN;
    private int noObj;
	
	
	public int getItN() {
		return itN;
	}
	public void setItN(int itN) {
		this.itN = itN;
	}
	public int getNoObj() {
		return noObj;
	}
	public void setNoObj(int noObj) {
		this.noObj = noObj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
