package com.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubble {
	
	public boolean sort(int array[]){
		int n= array.length;
		System.out.println("the length of the array is "+n);
		System.out.println("++++++++++++++++++++++++++");
		int temp=0;
		for(int i=0;i<n;i++){
			for (int j=1;j<(n-i);j++){
				if(array[j-1]>array[j]){
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
			
		}
		for(int i=0;i<6;i++){
			System.out.print(array[i]+" ");	
			}
		return true;
	}
	public void bubblesort() throws NumberFormatException, IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[] a= {1,-11,0,81,29,5};
	/*	System.out.println("enter array length 6");
		for(int i=0;i<6;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
	*/	/*for(int i=0;i<6;i++){
		System.out.println(a[i]);	
		}*/
		System.out.println("++++++++++++++++++++++++++");
		sort(a);
		
	}
		

}
