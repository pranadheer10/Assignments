package com.assignment.overriding;

public class Overriding {
	public static void main(String[] args) {

//		implementing parent class methods in our subclasses!
		
		Breakfast bf= new Breakfast();
		Breakfast cereals= new Cereals();
		cereals.info();
		bf.info();
	}
}
