package com.rj;

public class CollumNotFixedMultiDimensional {
    public static void main(String[] args) {
        // Varying number of column inb the array

        int[][] ar = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for (int r = 0; r < ar.length; r++) {
            for (int c = 0; c < ar[r].length; c++) {
                System.out.print (ar[r][c] + " ");
            }
            System.out.println();
        }
    }
}
