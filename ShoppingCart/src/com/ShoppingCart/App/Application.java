package com.ShoppingCart.App;

import java.io.IOException;

import com.ShoppingCart.Items.Items;

public class Application {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome to shopping cart");
		
		
		Items items= new Items();
		items.items();
		items.display();
		items.select();
		items.checkout();
		items.modify();
	}
	
}
