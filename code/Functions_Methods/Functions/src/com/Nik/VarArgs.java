package Functions_Methods.Functions.src.com.Nik;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,45,6,4,6,48,9,8,74,54,454,45,2,5151,55,44,555,21,212,368,45,1513,54,864684,45,311);
//        multiple(2,3,'r',"rj","neha","hfdjkhjkdhfkjhkj","jkdfhj");

//        demo(2,3,4,5);
//        demo("Rajat", "Neha");
//        demo();  // Error Known as ambiguity:- At Compile time it cannot determine at overloading which method to call because we are not providing any data type so it is unable to figure it out.
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        //fun(...any values here ...)

    }
    static void multiple(int a, int b, char c, String...v){
        System.out.println(Arrays.toString(v));
    }


            //Syntax of variable length arguments
    /*
    static void fun (int/char/String ...name){
        System.out.println(Arrays.toString(name))
    }
     */
}
