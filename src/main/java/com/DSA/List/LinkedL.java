package com.DSA.List;

import java.util.LinkedList;



public class LinkedL {
	
	public static void main(String[] args) {
		
	
	LinkedList<String> linklist=new LinkedList<>();
	
	linklist.add("XYZ");
	linklist.add("LMN");
	linklist.add("PQR");
	
	System.out.println("Original linked list:"+linklist);
	
	//get element at index 1
	
	String ele1=linklist.get(1);
	System.out.println("Element at index 1:"+ele1);
	
	//set element at index 2
	linklist.set(2, "ABC");
	
	System.out.println(linklist);
	
	//add element at 1
	linklist.add(1, "PQR");
	
	System.out.println("ADD element at 1:"+linklist);
	
	//for each loop
	System.out.println("value retrive from for each loop");
	for (String it:linklist)
	{
		System.out.println(it);
	}
	
	//check value contain or not
	boolean ispresent=linklist.contains("amol");
	System.out.println("Check Amol is present or not in link list:"+ispresent);
	
	ispresent=linklist.contains("PQR");
	System.out.println("Check PQR present or not in link list:"+ispresent);
	
	
	//check size of list
	int size=linklist.size();
	System.out.println("size of linked list:"+size);
	
	//for loop
	for(int i=0;i<size;i++) {
		System.out.println("at index:"+i);
		System.out.println(linklist.get(i));
	}
	}


	

}
