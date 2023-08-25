package com.rj;

import java.util.Scanner;


public class Rough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();

//        int max = a ;
//        if(b> max){
//            max = b;
//        }
//        if (c> max){
//            max = c;
//        }
//        int max = Math.max(c, Math.max(a, b));
//        System.out.println(max);


//        char ch = in.next().trim().charAt(0);
//        if (ch >= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        } else{
//            System.out.println("Uppercase");
//        }

//        //fibonacci series
//        int a = 0;
//        int b = 1;
//        System.out.println("enter nth number" );
//        int n = in.nextInt();
//        int count = 2;
//        while (count <= n){
//            int temp = b;
//            b = a+ b;
//            a =  temp;
//            count++;
//        }
//        System.out.println(b);

                        //Count the numbers
//        System.out.println("enter a number");
//        int n = in.nextInt();
//        System.out.println("Number for check");
//        int x = in.nextInt();
//        int count = 0;
//        while (n!=0) {
//            int rem = n % 10;
//            n /= 10;
//            if (rem == x){
//                count++;
//            }
//        }
//        System.out.println(count);

//                //Reverse the number
//        System.out.println("enter a number ");
//        int a  = in.nextInt();
//        int ans = 0;
//        while (a >0){
//            int rem = a % 10;
//            a /= 10;
//            ans = ans * 10 + rem;
//        }
//        System.out.println(ans);


                //Calculator
        // Keep taking input from user until user press x or X
        while (true){
            System.out.println("enter the operator");
            char op = in.next().trim().charAt(0);
            int ans = 0;
            if (op == '+'|| op == '-'|| op =='*'|| op == '/' || op == '%'){
                System.out.println("enter number one");
                int n = in.nextInt();
                System.out.println("Enter number two");
                int v = in.nextInt();
                if (op == '+'){
                    ans = n + v;
                }
                if (op == '-'){
                    ans = n - v;
                }
                if (op == '*'){
                    ans = n * v;
                }
                if (v != 0){
                    if (op == '/'){
                        ans = n /v;
                    }
                }else {
                    System.out.println("invalid input. 'Cannot be divided by Zero'");
                }
                if (op == '%'){
                    ans = n % v;
                }
                System.out.println("Your answer is:- "+ ans);
            }else if (op == 'x'|| op == 'X') {
                break;
            }else {
                System.out.println("Please provide a valid Operation for calculation");
            }

        }











    }
}
