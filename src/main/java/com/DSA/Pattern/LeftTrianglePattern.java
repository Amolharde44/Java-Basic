package com.DSA.Pattern;
/*
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 2
 */
public class LeftTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=5;
 
 //outer for loop used for no of row
 
//so here no of row is 5 ,it start from 1 and increased it
 
 for(int i=1;i<=n;i++)
 {
	 //inner for loop used for no of column 
	 //no of column start from row value so j=i
	 //value for column decreased
	 for(int j=i;j>=1;j--)
	 {
		 System.out.print(j +" ");
	 }
	 System.out.println();	 
 }
	 
	}

}
