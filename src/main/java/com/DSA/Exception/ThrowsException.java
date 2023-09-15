package com.DSA.Exception;

import java.util.Scanner;

public class ThrowsException {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		
		int num=sc.nextInt();
		
		int div=100/num;
		
		System.out.println(div);
		}
		catch(Throwable e)
		{
			System.out.println("Message:"+e.getMessage());
			System.out.println("String :"+e.toString());
			System.out.println("Trace:"+e.getStackTrace());
		}
		
	}
}
