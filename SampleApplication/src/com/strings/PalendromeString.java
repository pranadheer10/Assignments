package com.strings;

public class PalendromeString {

	public boolean check(String s) {
		if(s.equals(new StringBuilder(s).reverse().toString()))
		{
			return true;
		}	
		else {
			String s1= new StringBuilder(s).reverse().toString();
			System.out.println(s1);
			String s2="";
			System.out.println("using for loop to reverse");
			int n=s.length();
			for(int i=n-1;i>=0;i--) {
			s2=s2+s.charAt(i);	
			}

			System.out.println(s2);
		}
		
		/*int n= s.length();
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				return false;
			}
			
		}
		
		
	*/
		return false;
	}
}
