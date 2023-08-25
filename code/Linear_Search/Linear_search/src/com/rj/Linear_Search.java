package com.rj;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums= {11, 52, 25, -3, -11, 19, 8, 28,1,2,23,76};
        int target = 77;
        int ans = linerrsearch(nums, target);
        System.out.println(ans);
    }

    // search the array and return true or false
    static boolean linerrsearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        // run a for loop(enhanced) (same loop as below but we are not using index so make it enhanced for loop)
        for (int element : arr) {
            // check for every element at every element if it is = target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above  have executed
        // hence the target not found
        return false;
    }


    // search the array and return the element
    static int linerrsearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop(enhanced) (same loop as below but we are not using index so make it enhanced for loop)
        for (int element : arr) {
            // check for every element at every element if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above  have executed
        // hence the target not found
        return -1;
    }


    // Search in the array : return the index if item found
    //otherwise if item not found return -1
    static int linerrsearch(int[] arr, int target){
        if(arr.length == 0){
         return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for every element at every element if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above  have executed
        // hence the target not found
        return -1;
    }
}
