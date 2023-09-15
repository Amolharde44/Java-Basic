package com.DSA.Pattern;

public class PascalTriangle {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			char alphabet = 'a';  
			for(int j=1;j<=i;j++)
			{
				System.out.print(alphabet+" ");
				alphabet++;
			}
			System.out.println();
		}
		
	}

}
