package Question.Question.src.com.rj;

import java.util.Scanner;

public class Question_JAVA_Conditions_Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ////Conditions and loops Questions:-

//            //If_Else & Multiple-If Else Conditions (We can add multiple if_else-if conditions as required)
//        int salary = 25000;
//        if(salary<10000){
//            salary = salary + 5000;
//        }else {
//            salary += 3000;
//        }
//        System.out.println(salary);
//        int n = 35000;
//        if (n < 10000){
//            n += 8000;
//        } else if (n < 20000) {
//            n += 5000;
//        }else {
//            n += 3000;
//        }
//        System.out.println(n);


        //For Loop Basic
            //print the numbers from 1 to 5
//        for (int num = 0; num < 5; num += 1) {
//            System.out.println(num);
//        }
                    //or
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

            // Print hello world  5 times & then N times
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello! " + " World");
//        }
//        int n = in.nextInt();
//        for (int num = 0; num < n; num++) {
//            System.out.print(num + " ");
//            System.out.println("Hello World!");
//        }

            // print number from 1 to n by increment of 2
//        System.out.println("Enter the Number");
//        int n = in.nextInt();
//        for(int num = 0; num <= n; num+=2){
//            System.out.println(num);
//        }
            /*
              Experiment of taking input in condition of for loop
              it'll run but will give only one value because the input value is not stored in any variable so it cannot recall the value
             hence it'll just print first value only
            */
//        for (int n = 0; n < in.nextInt(); n++) {
//            System.out.println(n);
//        }

//                    //While Loop Basic
//        int n = 0;                            // Initialisation
//        while(n <= 5){                        // while (condition){
//            System.out.println(n +" Rj");              //body
//            n++;                                       //Increment/Decrement
//        }                                     // }

        // DO-While loop  {it'll atleast run once, then if the condition requirements are met it'll go on
        //because after running once it'll check for the conditions}

//        int n = 0;
//        do {
//            System.out.println("Hello World!");
//            n++;
//        }while (n!=3);

        // ********  Questions ******** //

        // Odd-Even Number
//        int num = in.nextInt();
//        if (num % 2 == 0){
//            System.out.println("Num is an Even Number");
//        }else {
//            System.out.println("Num is an Odd Number");
//        }

        // Multiplication Table
//        System.out.println("Input the number for Table ");
//        int num = in.nextInt();
//        System.out.println("how long will be the  multiple ");
//        int n = in.nextInt();
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(num*i);
//        }

//        // Taking number until user press x
//        int num = 0;
//        char input = in.next().toString().charAt(0);
//        if (input != 'x' || input != 'X') {
//            while (true) {
//                System.out.println("enter input");
//                int n = in.nextInt();
//                num += n;
//            }
//        }
//        System.out.println(num);

//        // Greeting
//        String  n = in.next();
//        System.out.println("hello "+ n);

//        // Simple Interest
//        float i = 0;
//        System.out.println("Input principal amount");
//        int p = in.nextInt();
//        System.out.println("enter rate");
//        float r = in.nextFloat();
//        System.out.println("enter time in year");
//        float t  = in.nextFloat();
//        i = p*(1+r*t/100);
//        System.out.println("simple interest is:- "+i);


//        //take an input and operator and calculate the value base on the operator
//        System.out.println("Enter number one");
//        float a = in.nextFloat();
//        System.out.println("Enter number two");
//        float b = in.nextFloat();
//        System.out.println("enter an operator");
//        char ch = in.next().toString().trim().charAt(0);
//        if (ch== '+' || ch =='-' || ch == '*' || ch == '/' || ch == '%'){
//            if (ch == '+'){
//                System.out.println("result = " +(a+b));
//            }
//            if (ch == '-'){
//                System.out.println("result "+ (a-b));
//            }
//            if (ch == '*'){
//                System.out.println("answer =" +(a*b));
//            }
//            if (ch =='/'){
//                if(b !=0){
//                    System.out.println("result = "+(a/b));
//                }
//                else {
//                    System.out.println("invalid input");
//                }
//            }
//            if (ch == '%'){
//                System.out.println("result = "+ (a%b));
//            }
//        }
//        else {
//            System.out.println("Invalid input");
//        }

        // Largest/Smallest number
//        System.out.println("enter number one");
//        float n = in.nextFloat();
//        System.out.println("enter number two");
//        float b = in.nextFloat();
////        float ans = 0;
//        if (n>b){
//            System.out.println("largest is n" + n);
//
//        }else {
//            System.out.println("b is largest" + b);
//        }
            // another way
//        if(b > ans ){
//            ans = b;
//            if (n> ans){
//                ans = n;
//            }
//        }
//        System.out.println("largest is "+ ans);

        // another way by using Math.max function
//        float m = Math.max(n,b);
//        System.out.println(m);

        //Rupee to $ or # convertor
//        float pound = 104.31f;
//        float USD = 82.01f;
//        System.out.println("enter currency in rupee");
//        float rupee = in.nextFloat();
//        System.out.println("Convert in $ or #");
//        char op = in.next().trim().charAt(0);
//        float ans = 0;
//        if(op== '$'){
//            ans = rupee/USD;
//            System.out.println("$ Value= "+ ans);
//        }else {
//            ans = rupee/pound;
//            System.out.println("# Value= "+ans);
//        }

//        // FIbonacci series
//        int num1 = 0;
//        int num2 = 1;
//        int count = 2;
//        System.out.println("Enter the  Number");
//        int n = in.nextInt();
//        while (count <=n){
//            int temp = num2;
//            num2 = num1 + num2;
//            num1 = temp;
//            count++;
//        }
//        System.out.println(num2);


        // Largest
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int max = 0;

                //one way
//        if(max<a){
//            max = a;
//        }
//        if(max <b){
//            max =b;
//        }
//        if (max<c){
//            max = c;
//        }
//        System.out.println(max);
                //Another Way
//        if (a<b){
//            max= b;
//        } else {
//            max = a;
//        }
//        if (max< c){
//            max = c;
//        }
//        System.out.println(max);
            //Another way
//        System.out.println(Math.max(Math.max(a,b),c));
            //Another way
//        max = a;
//        if(b>max){
//            max = b;
//        }
//        if (c> max){
//            max = c ;
//        }
//        System.out.println(max);

                //Uppercase/Lowercase
//        char ch = in.next().trim().charAt(0);
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        }else {
//            System.out.println("uppercase");
//        }

//            //Fibonacci series
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        System.out.println("enter the nth number");
//        int n = in.nextInt();
//        while (count<=n){
//            int temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);

//            //Number of times a number occurring in a given number
//        System.out.println("provide a number for checking");
//        int n = in.nextInt();
//        System.out.println("which number do you want to check");
//        int check = in.nextInt();
//        int count = 0;
//        while(n > 0){
//            int rem = n % 10;
//            if(rem == check){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

//            //Reverse a Given number
//        System.out.println("provide a number");
//        int n = in.nextInt();
//        int ans = 0;
//        while(n>0) {
//            int rem = n % 10;
//            n /= 10;
//            ans = ans * 10  + rem;
//        }
//        System.out.println(ans);


//                //Calculator
//        System.out.println("enter number one");
//        int num1 = in.nextInt();
//        System.out.println("enter number two");
//        int num2 = in.nextInt();
//        System.out.println("enter an operator");
//        char op = in.next().trim().charAt(0);
//        int ans = 0;
//        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//            if(op == '+'){
//                 ans = num1 + num2;
//            }
//            if (op == '-'){
//                ans = num1 - num2;
//            }
//            if (op == '*'){
//                ans = num1 * num2;
//            }
//            if (op == '/'){
//                if(num2 != 0){
//                    ans = num1 / num2;
//                }else {
//                    System.out.println("Invalid Input :- Cannot be divided by Zero");
//                }
//            }
//            if(op == '%'){
//                ans = num1 % num2;
//            }
//        }
//        System.out.println(ans);



//         //keep taking input for calculator until user press 'x' or 'X'

//        while(true){
//            System.out.println("enter an operator");
//            char op = in.next().trim().charAt(0);
//            int ans = 0;
//            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                //Input the numbers
//                System.out.println("enter number one");
//                int num1 = in.nextInt();
//                System.out.println("enter number two");
//                int num2 = in.nextInt();
//                if(op == '+'){
//                    ans = num1 + num2;
//                }
//                if (op == '-'){
//                    ans = num1 - num2;
//                }
//                if (op == '*'){
//                    ans = num1 * num2;
//                }
//                if (op == '/'){
//                    if(num2 != 0){
//                        ans = num1 / num2;
//                    }else {
//                        System.out.println("Invalid Input :- Cannot be divided by Zero");
//                    }
//                }
//                if(op == '%'){
//                    ans = num1 % num2;
//                }
//            } else if (op == 'x' || op == 'X') {
//                break;
//            }else {
//                System.out.println("Invalid input");
//                System.out.println("Try again?? type Y or N");
//                char x = in.next().trim().charAt(0);
//                if (x == 'y'|| x == 'Y'){
//                }else {
//                    break;
//                }
//            }
//            System.out.println("Answer is :- " + ans);
//        }


                //Function questions
            //Prime or not
















    }
}



