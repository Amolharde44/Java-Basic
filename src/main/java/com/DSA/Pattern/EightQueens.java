package com.DSA.Pattern;

public class EightQueens {
    private static final int N = 8;
    private static int[] queens = new int[N];

    public static void main(String[] args) {
        solveNQueens(0);
    }

    private static void solveNQueens(int row) {
        if (row == N) {
            printQueens();
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isValid(row, col)) {
                queens[row] = col;
                solveNQueens(row + 1);
            }
        }
    }

    private static boolean isValid(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queens[prevRow];
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
