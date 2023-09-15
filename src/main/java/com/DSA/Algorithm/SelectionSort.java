package com.DSA.Algorithm;

/*
 * Selection Sort:
This algorithm divides the input array into two parts: the sorted part and the unsorted part.
 It repeatedly selects the smallest (or largest) element from the unsorted part and adds it to the sorted part.
 */

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 12, 76, 64, 90, 6, 80, 100 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
