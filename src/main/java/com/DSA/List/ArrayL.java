package com.DSA.List;

import java.util.ArrayList;
import java.util.Collections;

/*
 * what is array list ?
 * An ArrayList is a dynamic array-like data structure provided by the Java Collections Framework. 
 * It's a part of the java.util package and implements the List interface. 
 * An ArrayList can dynamically resize itself, making it a flexible container for storing and manipulating elements.
 * array list allow to store duplicate element
 * array list not allow to store null value
 *  It provides us with dynamic arrays in Java
 *  
 *  
 *  Diff between arraylist and link list
 *  Array list
 *  ArrayList is implemented as a dynamic array, 
 *  which means that it uses an array to store the elements and can dynamically resize the array as needed. 
 *  This makes ArrayList a good choice for scenarios where you need fast access to elements by index, 
 *  but slower performance when inserting or removing elements from the middle of the list.
 *  
 *  Linklist
 *  LinkedList, on the other hand, is implemented as a doubly-linked list, 
 *  which means that each element in the list points to both its previous and next elements. 
 *  This makes LinkedList a good choice for scenarios
 *   where you need fast insertion or removal of elements from the middle of the list, 
 *  but slower performance when accessing elements by index.
 */
public class ArrayL {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		// add element in arraylist

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(0);

		System.out.println("original list:" + list);

		// get element
		int zero = list.get(0);

		System.out.println("get 0 index element:" + zero);

		// add element in between

		list.add(1, 5);

		System.out.println("add 5 in index 1:" + list);

		// set element

		list.set(2, 6);

		System.out.println("set 6 at index 2:" + list);

		// remove element from list

		list.remove(1);

		System.out.println("remove element at index 1:" + list);

		// count (size) of list
		int size = list.size();

		System.out.println("size of list:" + size);

		// loops
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index:" + i);
			System.out.println(list.get(i));
		}
		// used for each loop
		for (int it : list) {
			System.out.println("used for each loop:" + it);
		}

		// Sort the ArrayList in ascending order
		Collections.sort(list);
		System.out.println("sorted list:" + list);

		// check element is present or not

		boolean ispresent = list.contains(7);
		System.out.println("check 7 is present in list or not:" + ispresent);

		ispresent = list.contains(6);

		System.out.println("check 6 present in list or not:" + ispresent);

		// declaring array list with
		// initials size n

		int n = 10;

		ArrayList<Integer> listn = new ArrayList<>(n);

		listn.add(5);
		listn.add(6);

		System.out.println("list n with added with element:" + listn);
		System.out.println("size of listn:" + listn.size());

		for (int j = 1; j <= n; j++) {

			listn.add(j);

		}
		System.out.println("array list of size n=10 \t" + listn);

	}

}
