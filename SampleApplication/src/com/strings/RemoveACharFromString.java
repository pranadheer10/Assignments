package com.strings;

public class RemoveACharFromString {

public String removing(String s,char c) {
	
	System.out.println("removing a char");
	
	String charecter= Character.toString(c);
	String s1= s.replace(charecter, "");
	return s1;
}
}
