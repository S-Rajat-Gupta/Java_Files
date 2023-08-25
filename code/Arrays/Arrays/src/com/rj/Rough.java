package com.rj;

import java.util.Arrays;
import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {

            /*
                    //Arrays of primitives
            */
//        int[] number = new int[5];
//        //store 5 roll numbers
//        int[] rno = {23, 45, 56, 77, 2};
//
//        System.out.println(number[0]); // by default it is having 0 elements
//
//        number[0] = 1;
//        number[1] = 2;
//        number[2] = 3;
//        number[3] = 4;
//        number[4] = 5;
//        System.out.println(Arrays.toString(number));

        // Arrays of objects (String) :- Details in lower section
////        String[] arr = new String[5];
//        String[] arr;
//        arr = new String[5];
//        System.out.println(arr[1]); // by default string arrays are of null type



        //Inputs in arrays :-
                // 1:- inputting manually
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2]   = 111;
//        arr[3] = 15;
//        arr[4] = 21;
//        //  [ 1,2,111,15,21 ]   It looks something like this
//        System.out.println(arr[3]);

//                //2 :- Inputs via for Loop
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]  = in.nextInt();
//        }

//        //print the array
//            //1st way using for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//                // 2nd way For-Each loop
//        for(int num : arr){     // For every element in the array print the element
//            System.out.print(num + " "); // here num represent element of the array
//        }
//        System.out.println();
//                // 3rd way using Arrays.toString(arr) method
//        System.out.println(Arrays.toString(arr));

//        //Modify primitives arrays manually
//        arr[0] = 99;
//        System.out.println(Arrays.toString(arr));


                /*
                        //Arrays of objects
                 */
                    //String array
//        Scanner in = new Scanner(System.in);
//        String[] a = new String[5];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = in.next();
//        }

//        System.out.println(Arrays.toString(a));
//        for(String rj : a){
//            System.out.print(rj + "  ");
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
                    // Modify element manually
//        a[1] = "RJ";
//        System.out.println(Arrays.toString(a));

                //Arrays in function
//        int[] nums = {1,2,3,4,5};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));



                    //Multi-Dimensional Arrays
                // 2-D Arrays

        /*
                1 2 3
                4 5 6
                7 8 9
         */
                // Syntax int[][] arr = new int [3- Row* ][ column]
                        // * -> Mandatory to specify
        Scanner in =  new Scanner(System.in);

//        int [][] arr = new int[3][];
//        int [][] ary = {
//                {1, 2, 3},    // oth index
//                {4, 5, 6},    // 1st index
//                {7, 8, 9, 0}  // 2nd index
//        };

                //Fixed size of row-column of array
//        int [][] arr = new int[3][3];
//        System.out.println(Arrays.toString(arr)); // this will give number of rows

                // Input :- for 2D array

//        for (int row = 0; row < arr.length ; row++) {
//                // for each column in every row taking the input via using another loop [ because 2d array is an array of arrays]
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }

                // Output:- for 2D array

//        for (int row = 0; row < arr.length; row++) {
//                // for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

            // Via using Arrays.toString Method
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
                // Enhanced for loop
//        for (int[] n : arr) {
//            System.out.println(Arrays.toString((n)));
//        }


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
    static  void change(int[] arr){
        arr[0] = 999;
    }
}
