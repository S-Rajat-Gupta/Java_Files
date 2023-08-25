package com.rj;

public class MaxWealth {
    public static void main(String[] args) {


    }
    public int maximumWealth(int[][] accounts){
        //person = row
        // account = col

        // Enhanced way of same code below

        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            //  when you start a new colum, take a new sum for that row
            for (int anInt : ints) {
                sum += anInt;
            }
            // when you come out of this loop:-
            //now we have sum of accounts of person
            // check with overall  answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    /*

            for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            //  when you start a new colum, take a new sum for that row
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // when you come out of this loop:-
            //now we have sum of accounts of person
            // check with overall  answer
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
     */

}
