package com.DSA.Pattern;

public class Chessboard {
	
	public static void main(String[] args) {
		int size = 8; // Size of the chessboard

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                char square = (row + col) % 2 == 0 ? '#' : ' '; // Alternating black and white squares
                System.out.print(square + " ");
            }
            System.out.println();
        }
	}

}
