package com.rj;

import java.util.Scanner;

public class Questions_Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(prime(n));


//        System.out.println(Armstrong(n));
        for (int i = 1; i < 10000; i++) {
            if (Armstrong(i)){
                System.out.println(i);
            }
        }

    }
        // Print 3 digit armstrong numbers
    static boolean Armstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0 ){
            int rem = n % 10;
            n = n/ 10;
            sum = sum + rem * rem *rem ;
        }
        return sum == original;
    }


                //Prime number or not
    static boolean prime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <=n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }



}
