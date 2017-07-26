package com.assignment.overload;

public class Overloading {

	public static void main(String[] args) {

	employee("dhiru");
	employee("James",1000);
	}
	// same method but different parameters
	public static String employee(String name){
		System.out.println(name+ " is non paid employee");
		return name;
	}
	
	public static String employee(String name, int n){
		System.out.println(name+" is paid employee with salory "+n );
		return "name";
	}

}
