package com.numberconversion;

public class RomansToArabic {

	
	
public int arabicNumbers(String romans){
	int n=0;
	String s=romans;
	
	while(s.substring(0).contains("M")){
	n=n+1000;
	s= s.substring(1, s.length());
	}
	
	while(s.substring(0).contains("C")){

		if(s.substring(1).contains("M")){
			s= s.substring(2, s.length());
			n=n+900;
		}
	}
	while(s.substring(0).contains("D")){
		n=n+500;
		s= s.substring(1, s.length());
		}
	while(s.substring(0).contains("C")){

		if(s.substring(1).contains("D")){
			s= s.substring(2, s.length());
			n=n+400;
		}
	}
	while(s.substring(0).contains("C")){
		n=n+100;
		s= s.substring(1, s.length());
		}
	while(s.substring(0).contains("X")){

		if(s.substring(1).contains("C")){
			s= s.substring(2, s.length());
			n=n+90;
		}
	}
	while(s.substring(0).contains("L")){
		n=n+50;
		s= s.substring(1, s.length());
		}
	while(s.substring(0).contains("X")){

		if(s.substring(1).contains("L")){
			s= s.substring(2, s.length());
			n=n+40;
		}
	}
	while(s.substring(0).contains("X")){
		n=n+10;
		s= s.substring(1, s.length());
		}
	while(s.substring(0).contains("V")){
		n=n+5;
		s= s.substring(1, s.length());
		}
	if(s.substring(0).contains("I")){

		if(s.substring(1).contains("V")){
			s= s.substring(2, s.length());
			n=n+4;
		}
	}while(s.substring(0).contains("I")){
		n=n+1;
		s= s.substring(1, s.length());
		System.out.println(s);
		
		}
	return n;
	
	/*
	if(s.contains("D")){
		n=n+500;
		romans= romans.substring(1, romans.length());
		arabicNumbers(romans);
		}
	if(s.contains("C")){
		s= romans.substring(1, romans.length());
		s= romans.substring(0);
		if(s.contains("D")){
			n=n+400;
			arabicNumbers(romans);
		}
	}
	
	
	
	
	
	
*/	
	
}


}
