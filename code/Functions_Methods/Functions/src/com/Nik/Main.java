package com.Nik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. take the two numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum : " + sum);

    }
}