package com.rj;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q. Print numbers from 1 to 5

        //Syntax of For Loop:-
        /*
        for (initialization; condition; increment/decrement) {
            //body
        }
         */

//        for (int num = 1; num<=5; num++){
//            System.out.println(num);
//            }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <=n ; num++) {
////            System.out.print(num + "  ");
//            System.out.println("Hello, World!");
//        }


        //Syntax of While Loop
        /*
            Syntax:-
            while(condition){
                //body
            }
         */
//        int n = 1;
//        while(n <=5 ) {
//            System.out.println(n);
//            n++;
//        }

        //Do-while Loop
        /*
            Syntax:-
            do{
            }while(condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n<=5);
    }
}
