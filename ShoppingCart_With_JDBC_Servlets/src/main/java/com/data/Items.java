package com.data;

public class Items {

	private String description;
	private String price;
	private String itemName;
	private String itemNumber;
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Override
	public String toString() {
		return "Items [description=" + description + ", price=" + price + ", itemName=" + itemName + ", itemNumber="
				+ itemNumber + "]";
	}

}
