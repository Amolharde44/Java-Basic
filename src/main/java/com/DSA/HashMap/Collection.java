package com.DSA.HashMap;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List ---->Its interface in the collection
		 * List Allow duplicate element
		 * Implementation include 'ArrayList','LinekedList',Vector
		 * 
		 */
		
		
		/*
		 * ArrayList---->
		 */
		
		List<String>  arrayList=new ArrayList<>();
		
		arrayList.add(null);
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("1");
		
		
		
		System.out.println(arrayList);
		System.out.println("Element at index o:"+arrayList.get(0));
		System.out.println("Element at index 1:"+arrayList.get(1));
	
		
 
	}

}
