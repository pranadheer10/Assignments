package com.pyramid;

public class CompletePyramid {
	public void display(int n){
		int rows=1;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=rows-1;j>=1;j--){
			System.out.print(j+" ");}
			System.out.println();
			rows++;
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");}

}
