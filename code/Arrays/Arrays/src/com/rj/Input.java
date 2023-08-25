package com.rj;

import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 34;
//        arr[3] = 11;
//        arr[4] = 9;
//        // [23,45,34,11,9]
//        System.out.println(arr[3]);

        // Input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));  //it'll do the same

//        //this
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        // or this enhanced for loop
//        for (int num : arr) {              // for every element in the array print the element
//            System.out.println(num);       // here num represent element of the array
//        }

//        System.out.println(arr[5]);    // index out of bound error


        // Array of objects
        String[] str = new String [4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // Modify the array
        str[1] = "Nik";
        str[2] = "Neha";
        System.out.println(Arrays.toString(str));
    }
}
