package Functions_Methods.Functions.src.com.Nik;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

//        String personalised = mygreet("nik");
//        System.out.println(personalised);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String message = "hello " + name;
        return message;
    }


    static String greet(){
        String greeting = "how are You?";
        return greeting;
    }
}
