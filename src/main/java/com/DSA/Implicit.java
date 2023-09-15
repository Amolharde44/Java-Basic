package com.DSA;

public class Implicit {
	
	
	public static void main(String[] args) {
		
		byte a = 1;
		short b = a;
		int c = b;
		long d = c;
		float e = d;
		double f = e;

		System.out.println(f);
	
	int y=3;
	float x=y;
	
	
	short number = 32767; 
	short numberTwo = (short)(number + 1); 
	System.out.println(numberTwo);
	
	float r=4,r1=10;
	float pi=3.14f;
	System.out.println("radius=4"+"\n"+(pi*r*r));
	System.out.println("radius=10"+"\n"+(pi*r1*r1));
	
	}

}
