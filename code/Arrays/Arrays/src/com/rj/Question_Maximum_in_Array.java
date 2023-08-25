package com.rj;

public class Question_Maximum_in_Array {
    public static void main(String[] args) {
        int[]arr = {1, 2, 55, 99 , 111, 2007, 9999};
        System.out.println(max(arr));
        System.out.println(range(arr, 3 , 6));
    }


    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int range(int[] arr, int start , int end) {
        int max = arr[start];
        for (int i = start; i <= end ; i++) {
            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }




}
