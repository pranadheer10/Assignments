package com.sort;

import java.io.IOException;

public class InsertionSort {

public void insertionSort() throws NumberFormatException, IOException{
		
		int[] a= {1,-11,0,81,29,5};
	/*	System.out.println("enter array length 6");
		for(int i=0;i<6;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
	*/	/*for(int i=0;i<6;i++){
		System.out.println(a[i]);	
		}*/
		System.out.println("++++++++++++++++++++++++++");
		insertSort(a);
		
	}

private void insertSort(int[] a) {

	int n=a.length;
	int s;
	
	for(int i=1;i<n;i++) {
		
		for(int j=i;j>0;j--) {
			if(a[j]<a[j-1]) {
				s=a[j];
				a[j]=a[j-1];
				a[j-1]=s;
			}
		}
		
	
		
	}
	for(int k=0;k<n;k++)
		System.out.print(a[k]+" ");
}


}
