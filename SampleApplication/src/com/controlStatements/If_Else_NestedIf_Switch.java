package com.controlStatements;

public class If_Else_NestedIf_Switch {

	public String testIfElse(String name1, String name2) {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		String reverse = "";
		System.out.println("if name1 equals name 2 we will reverse the String");
		System.out.println("if name1 doesnt matches name 2 we will concatinate strings and we will reverse it");
		if (name1.equals(name2)) {

			int n = name1.length();
			for (int i = n-1; i >= 0; i--) {
				reverse = reverse+name1.charAt(i) ;
			}
			
			return reverse;
		} else {

			reverse = name1.concat(name2);
			
			System.out.println("String 1 "+name1+" is concinated with "+name2+"\n the concinated string is "+reverse);
			System.out.println("reversing the String");
			String concatedReverse = "";
			int n = reverse.length();
			for (int i = n-1; i >= 0; i--) {
				concatedReverse = concatedReverse +reverse.charAt(i) ;
			}
			
			return concatedReverse;
		}

	}

}
