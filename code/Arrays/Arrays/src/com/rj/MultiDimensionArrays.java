package com.rj;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
         */

        Scanner in = new Scanner(System.in);

       //Syntax
//       int[][] arr = new int[3][];

//       int [][] arr = {
//               {1,2,3},     //0th index
//               {4,5,6},     //1st index
//               {0,7,8,9}      //2nd index-> arr[2]  = {0,7,8,9}
//                              //arr[2][0] = {0}
//       };

        int[][] arr = new int[3][3];
        System.out.print("No. of row in the array is:-");
        System.out.println(arr.length);  // THis will give us number of rows

        //Input
        for (int row = 0; row < arr.length; row++) {
            // for each collum in every row we'll have to take input so another for loop
            for (int collum = 0; collum < arr[row].length; collum++) {
                arr[row][collum] = in.nextInt();
            }
        }
        // Output
//        for (int row = 0; row < arr.length; row++) {
//            // for each collum in every row we'll have to take input so another for loop
//            for (int collum = 0; collum < arr[row].length; collum++) {
//                System.out.print(arr[row][collum] + " ");
//            }
//            System.out.println();
//        }

        // another way of output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //enhanced way
        for (int[] a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
