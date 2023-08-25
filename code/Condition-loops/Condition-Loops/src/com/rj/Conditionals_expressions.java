package com.rj;

public class Conditionals_expressions {
    public static void main(String[] args) {
        /*
        Syntax of If Statements:-
        if (boolean expression T or F) {
            //body
        } else  {
            //do this.
        }
        */

        int salary = 25500;
//        if (salary > 25000){
//            salary = salary + 2000;
//        } else {
//            salary+=1000;
//        }
//        System.out.println(salary);

        /*
        Multiple If-Else Condition
         if (boolean expression T or F) {
            //body
         } else-if (another boolean expression){
            //body
         } else{
            // Do this
         }
         */
//        if (salary<30000) {
//            salary += 3000;
//        } else if (salary<25000) {
//            salary += 2000;
//        } else {
//            salary += 1000;
//        }
//        System.out.println(salary);

        int a = 10;
        int b = 20;
//        if (a == 10 && b == 20){
//            System.out.println("Hello World");
//        }
        if (a==10 || b==20){
            System.out.println("Hello");
        }

        if (a != 35){
            System.out.println("hey");
        }

    }

}
