package com.ShoppingCart.Items;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Items {

	static List<ItemsList> items = new ArrayList<ItemsList>();
	static List<ItemsList> selectedItems = new ArrayList<ItemsList>();

	static Map<Integer, Integer> mapItems = new HashMap<Integer, Integer>();
	static Map<Integer, List> checkout = new HashMap<Integer, List>();
	static int totalprice = 0;

	public static void items() {

		ItemsList il = new ItemsList();
		il.setItemNumber(1);
		il.setItemName("Apple");
		il.setPrice(2);
		mapItems.put(0, 2);

		ItemsList il1 = new ItemsList();
		il1.setItemNumber(2);
		il1.setItemName("Banana");
		il1.setPrice(1);
		mapItems.put(1, 1);

		ItemsList il2 = new ItemsList();
		il2.setItemNumber(3);
		il2.setItemName("Onions");
		il2.setPrice(3);
		mapItems.put(2, 3);

		ItemsList il3 = new ItemsList();
		il3.setItemNumber(4);
		il3.setItemName("Mango");
		il3.setPrice(5);
		mapItems.put(3, 4);

		ItemsList il4 = new ItemsList();
		il4.setItemNumber(5);
		il4.setItemName("Potato");
		il4.setPrice(3);
		mapItems.put(4, 3);

		ItemsList il5 = new ItemsList();
		il5.setItemNumber(6);
		il5.setItemName("Beans");
		il5.setPrice(2);
		mapItems.put(5, 2);

		ItemsList il6 = new ItemsList();
		il6.setItemNumber(7);
		il6.setItemName("peanuts");
		il6.setPrice(1);
		mapItems.put(6, 1);

		items.add(il);
		items.add(il1);
		items.add(il2);
		items.add(il3);
		items.add(il4);
		items.add(il5);
		items.add(il6);

	}

	public void display() {

		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i));
		}
	}

	

	
	public void select() throws IOException {

		System.out.println("to select items press any key to exit press y");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (!br.readLine().equals("y")) {

			System.out.println("please select items by item number");
			System.out.println("");
			int item = Integer.parseInt(br.readLine());

			System.out.println("you have selected " + items.get(item - 1));
			selectedItems.add(items.get(item - 1));
			System.out.println("please selcet number of items...");

			int num = Integer.parseInt(br.readLine());
			int price = num * mapItems.get(item - 1);

			checkout.put(price, selectedItems);

			totalprice = totalprice + price;

			System.out.println("Price of this item is " + price);

			System.out.println("to continue press enter to exit press y");
		}

		System.out.println("selected items are");

	}

	
	
	
	
	
	public void checkout() throws IOException {
		int i = 0;
		for (Map.Entry<Integer, List> entry : checkout.entrySet()) {

			System.out.println("Item  = " + selectedItems.get(i) + ", Total price of Item = " + entry.getKey());
			i++;
		}
	}


	
	
	
	
	
	

	public void modify() throws IOException {
		int i = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("want to remove an item from list? if yes press y");
		if (br.readLine().equals("y")) {
			System.out.println("enter item number....");
			String itm = br.readLine();

			for (Map.Entry<Integer, List> entry : checkout.entrySet()) {
				String value = entry.getValue().toString();

				if (value.contains(itm)) {
					

					checkout.remove(entry.getKey());
				}
			}
		}
		for (Map.Entry<Integer, List> entry : checkout.entrySet()) {

			System.out.println("Item  = " + selectedItems.get(i) + ", Total price of Item = " + entry.getKey());
			i++;
		}
		System.out.println("total price is " + totalprice);

	}

}
