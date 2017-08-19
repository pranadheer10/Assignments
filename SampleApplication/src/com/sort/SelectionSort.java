package com.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {

	
	public void selectionSort() throws NumberFormatException, IOException{
		
		int[] a= {1,-11,0,81,29,5};
	/*	System.out.println("enter array length 6");
		for(int i=0;i<6;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
	*/	/*for(int i=0;i<6;i++){
		System.out.println(a[i]);	
		}*/
		System.out.println("++++++++++++++++++++++++++");
		selectSort(a);
		
	}

	private void selectSort(int[] a) {
		int n= a.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
