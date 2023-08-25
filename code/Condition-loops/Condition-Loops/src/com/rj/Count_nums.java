package com.rj;

import java.util.Scanner;

public class Count_nums {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int count = 0;
        while (n>0){
            int rem = n%10;
            if(rem==5){
                count++;
            }
            n= n/10;  // or in short we can also write  n/=10
        }
        System.out.println(count);
//        System.out.println("The number "+ n + "occured," + count+ "times in the sequence");
    }
}
