package com.DSA.Pattern;
/*
 * 1 2 3 4 5 
    1 2 3 4 
     1 2 3 
      1 2 
       1 
       
       this logic build by Mr.Amol Appa Harde
 */
public class InversePyramid {

	public static void main(String[] args) {
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 
			 for(int j=i-1;j>=1;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=(n-i)+1;k++)
			 {
				 System.out.print(k+" ");
			 }
			 System.out.println();
		 }
	}
}
