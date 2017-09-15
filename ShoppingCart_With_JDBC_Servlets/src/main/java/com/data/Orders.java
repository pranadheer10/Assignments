package com.data;

public class Orders {
	
	private Items items;
	private String quantity;
	
	
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "Orders [items=" + items + ", quantity=" + quantity + "]";
	}
	
	
}
