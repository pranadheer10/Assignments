package com.strings;

import java.util.Scanner;

public class ReplaceACharFromString {

	public String replace(String s, String s1) {
		
		
		System.out.println("Please enter what u want to replace");
		Scanner sc= new Scanner(System.in);
		String replace= sc.nextLine();
		String newString= s.replace(s1, replace);
		return newString;
		
	
	}

}
