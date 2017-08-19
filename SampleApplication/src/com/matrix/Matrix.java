package com.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Matrix {
	public void arrays() throws NumberFormatException, IOException {
		
		Array a = new Array();
			
		try{
			System.out.println("we have 8 dimensions...\n enter the dimension of array... \n to view all 8 arrays press any number after 8... ");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int n= Integer.parseInt(br.readLine());
			
				switch(n)
				{
					
				case 1:
					a.single();
				    break;
				case 2:
					a.doubles();
					break;
				case 3:
						a.triple();
						break;
				case 4:
						a.fourDArray();
						break;
				case 5:
					a.fiveDArray();
					break;
				case 6:
			        a.sixDArray();
			        break;
				case 7:
					a.sevenDArray();
					break;
				case 8:
					a.eightDArray();
					break;
				default :
					 a.single();
				     a.doubles();
				     a.triple();
				     a.fiveDArray();
				     a.sixDArray();
				     a.sevenDArray();
				     a.eightDArray();
			        break;
					
				
		}
		   

		
	}catch(Exception e){
		System.out.println("enter correct number 1-8");
		arrays();
	}

		
	}
	
}
