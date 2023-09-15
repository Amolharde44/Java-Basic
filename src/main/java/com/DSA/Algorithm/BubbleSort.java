package com.DSA.Algorithm;
/*
 A simple sorting algorithm that repeatedly steps through the list, 
 compares adjacent elements,
  and swaps them if they are in the wrong order. 
  It's not very efficient for large datasets.
 */

public class BubbleSort {
	
	public static void main(String[] args) {
		
		 int [] arr= {45,78,9,34,12,89,90,98,5};
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=0;j<arr.length-i-1;j++) {
				 if(arr[j]>arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
		 
		 System.out.println("Sorted Array...");
		 for(int num:arr) 
		 {
			 System.out.print(num+" ");
		 }
	} 

}
