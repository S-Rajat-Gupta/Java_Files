package Functions_Methods.Functions.src.com.Nik;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(25,75);
        System.out.println(ans);
    }

    //passing the value via arguments
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }


    //returning the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number two ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
    /*
                //Function/Methods
            access_modifiers(we'll look in OOP) return_type name () {
                //body
                return_statement;
            }
     */
}
