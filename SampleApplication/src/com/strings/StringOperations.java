package com.strings;

import java.util.Scanner;

public class StringOperations {

	public boolean stringOperations() {
		
		System.out.println("please enter your options for String operations");
		System.out.println("1 for removing a String");
		System.out.println("2 for replacing a String");
		System.out.println("3 for checking palendrome String");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		switch(n){
		case 1:
			String s=removing();
			break;
		case 2:
			String s1=replace();
			break;
		case 3:
			String s2=palendrome();
		}
				return true;
	}
	
	private String palendrome() {
		
		System.out.println("please enter a String if it is palendrome it displays true");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		PalendromeString ps= new PalendromeString();
		
		boolean newString= ps.check(s);
		System.out.println(newString);
		return s;
	}

	private String replace() {
		
		System.out.println("please enter a String");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("please enter String to replace");
		String s1=sc.nextLine();
		
		ReplaceACharFromString rm= new ReplaceACharFromString();
		String newString= rm.replace(s, s1);
		System.out.println(newString);
		return newString;
		
	}
	
	
	
	
	
	
	

	public String removing() {
		System.out.println("please enter a String");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("please enter Char to remove");
		char c= sc.next().charAt(0);
		
		RemoveACharFromString rm= new RemoveACharFromString();
		String newString= rm.removing(s, c);
		System.out.println(newString);
		return newString;
	}
}
