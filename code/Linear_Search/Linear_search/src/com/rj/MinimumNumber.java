package com.rj;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 33, 18, -7, -34, 8, 0, 99, 11};
        System.out.println(min(arr));
    }

    // assume arr.length != 0;
    // return the minimum value in the array
    static  int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }


}

