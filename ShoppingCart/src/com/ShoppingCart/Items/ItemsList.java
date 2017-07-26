package com.ShoppingCart.Items;

public class ItemsList {

	private String itemName;
	private int itemNumber;
	private int price;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Override
	public String toString() {
		return "No "+itemNumber+", Item Name=" + itemName + ", price=" + price;
	}
	
	
	
	
}

