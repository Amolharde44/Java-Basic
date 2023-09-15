package com.DSA.Pattern;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		}
		
	

	}

}
