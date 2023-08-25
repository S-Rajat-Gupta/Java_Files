package com.rj;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //Casting in compatible types:-
//        int num = (int)(5656.4446f);
//        System.out.println(num);

        //Automatic type promotion in expressions:-
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c ;
//        System.out.println(d);

//        byte b = 50;
//        b = b* 2;

        //Java support Unicode/ascii values....!
//        int number=  'A';
//        System.out.println(number);
//        int number = 你好;
//        System.out.println(number);

        //Type promotion rules
//        System.out.println(3*5.5656565f);
//        System.out.println(3*6);

        //One Example :- which explains entire scenario
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        // result will be :-
        // float + integer - double  = double
        System.out.println((f*b)+"  "+(i/c)+ " "+(d*s));
        System.out.println(result);

    }
}
