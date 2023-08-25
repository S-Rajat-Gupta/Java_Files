package com.rj;

import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {12,36,18}
        };

        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(maximum(arr));
        System.out.println(Integer.MIN_VALUE);
    }


         // maximum in 2d array using enhanced for loop
         static int maximum(int[][] arr){
             int max = Integer.MIN_VALUE;
             for (int[] ints : arr) {
                 for (int element : ints) {
                     if (element > max) {
                         max = element;
                     }
                 }
             }
             return max;
         }

        // Maximum in 2d array using simple for loop
        static int max(int[][] arr){
            int max = Integer.MIN_VALUE;
            for(int row=0; row < arr.length; row++){
                for (int col = 0; col < arr[row].length ; col++) {
                    if(arr[row][col] > max){
                        max = arr[row][col];

                    }
                }
            }
            return max;
        }


        //Searching in 2d array
    static int[] search(int[][] arr, int target){
        for(int row=0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
