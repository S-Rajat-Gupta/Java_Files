package com.rj;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,12,-7,3,14,28};
        int target = 14;

        int ans = (linerrsearch(arr, target,1,4));
        System.out.println(ans);
    }


    static int linerrsearch(int[] arr, int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
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
