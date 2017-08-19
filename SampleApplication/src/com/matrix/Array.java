package com.matrix;
import java.util.*;
public class Array {
	int i,j,k,l,m,n,o,p,a=1;
public void single(){	 
	String[] javaClass = {"dinesh","dhiru","ibrahim","nunna","ram"};
	System.out.println("this is 1d array");
for(i=0;i<javaClass.length;i++){
	System.out.println(javaClass[i]);
}
}
public void doubles(){	
	String[][] a2 ={{"1","2","3","4","5"},
			{"4","6","1","2","6"},
			{"1","2","3","4","5"},
			{"4","6","1","2","6"},
			{"4","6","1","2","6"}}; 
System.out.println("this is 2 d array....");
	for(i=0;i<a2.length;i++){
		
		for(j=0;j<a2.length;j++){
			System.out.print(a2[i][j]+"\t");
		}System.out.println("\n");
	}
}
public void triple(){
	

	int[][][] a3 ={{{1,2,3,4,5},{4,6,1,2,6},{1,2,3,4,5}},
		{{1,2,3,4,5},{4,6,1,2,6},{1,2,3,4,5}},
		{{1,2,3,4,5},{4,6,1,2,6},{1,2,3,4,5}}};
	System.out.println("this is 3 d array....");

	for(i=0;i<a3.length;i++){
				for(j=0;j<a3.length;j++){
					for(k=0;k<a3.length;k++){
						System.out.print(" position  'a["+i+"]"+"a["+j+"]"+"a["+k+"] == "+a3[i][j][k]+"\t");
						}System.out.println();
					}System.out.println();
				}
			
		

}	
public void fourDArray()
{
	int i,j,k,l,m,n,o,p,a=1;
	int four[][][][] =new int[4][4][4][4];
	System.out.println("this is 4 d array....");
	for(i=0;i<=3;i++){
		for(j=0;j<=3;j++){
			for(k=0;k<=3;k++){
				for(l=0;l<=3;l++){
					four[i][j][k][l]=a;
					System.out.println("position  'a["+i+"]"+"a["+j+"]"+"a["+l+"] == \t"+a);
					a++;
					}System.out.println();
			}System.out.println();
		}System.out.println();
	}
}

public void fiveDArray()
{
	System.out.println("this is 5 d array....");

	int i,j,k,l,m,n,o,p,a=1;
	int five[][][][][] =new int[3][3][3][3][3];
	for(i=0;i<=2;i++)
		for(j=0;j<=2;j++)
			for(l=0;l<=2;l++)
				for(m=0;m<=2;m++)
					for(n=0;n<=2;n++)
					{
						System.out.println("position  'a["+i+"]"+"a["+j+"]"+"a["+l+"]"+"a["+m+"] == "+a+"\t");
						a++;
					
					}
	 
}
public void sixDArray()
{
	System.out.println("this is 6 d array....");

	int i,j,k,l,m,n,o,p,a=1;
	int[][][][][][] six =new int[2][2][2][2][2][2];
	for(i=0;i<=1;i++)
		for(j=0;j<=1;j++)
			for(l=0;l<=1;l++)
				for(m=0;m<=1;m++)
					for(n=0;n<=1;n++)
				       for(o=0;o<=1;o++)
					{
				    	six[i][j][l][m][n][o] =a;
						System.out.println("position  'a["+i+"]"+"a["+j+"]"+"a["+l+"]"+"a["+m+"]"+"a["+n+"]== "+a+"\t");
						a++;
					
					}
	 
}
public void sevenDArray()
{
	System.out.println("this is 7 d array....");

	int i,j,k,l,m,n,o,p,a=1;
	int[][][][][][][] seven =new int[2][2][2][2][2][2][2];
	for(i=0;i<=1;i++)
		for(j=0;j<=1;j++)
			for(l=0;l<=1;l++)
				for(m=0;m<=1;m++)
					for(n=0;n<=1;n++)
				       for(o=0;o<=1;o++)
				    	   for(p=0;p<=1;p++)
					{
				    	seven[i][j][l][m][n][o][p] =a;
						System.out.println("position  'a["+i+"]"+"a["+j+"]"+"a["+l+"]"+"a["+m+"]"+"a["+n+"]"+"a["+o+"]"+"a["+p+"]== "+a+"\t");
						a++;
					
					}
	}

public void eightDArray()
{
	System.out.println("this is 8 d array....");

	int i,j,k,l,m,n,o,p,r,a=1;
	int[][][][][][][][] seven =new int[3][3][3][3][3][3][3][3];
	for(i=0;i<=2;i++)
		for(j=0;j<=2;j++)
			for(l=0;l<=2;l++)
				for(m=0;m<=2;m++)
					for(n=0;n<=2;n++)
				       for(o=0;o<=2;o++)
				    	   for(p=0;p<=2;p++)
				    	   {  for(r=0;r<=2;r++)
					{
				    	// seven[i][j][l][m][n][o][p][r] =a;
						//System.out.println("position  'a["+i+"]"+"a["+j+"]"+"a["+l+"]"+"a["+m+"]"+"a["+n+"]"+"a["+o+"]"+"a["+p+"]"+"a["+r+"]' == "+a);
						System.out.print(a+"\t \t");
				    			   a++;
					
					}System.out.println();
				    	   }
	}




}












