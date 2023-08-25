package Functions_Methods.Functions.src.com.Nik;

public class Shadowing {
    static int x = 90; // This will be shadowed at line 7
    public static void main(String[] args) {
//        System.out.println(x);  //90
//        int x = 40; // the class variable at line 4 is shadowed by this local variable.
//        System.out.println(x);  //40
//        fun();  //90

        System.out.println(x);  //90
        int x ; // the class variable at line 4 is shadowed by this local variable.
//        System.out.println(x);  //Scope will begin when the value is initialised
        x = 40;
        fun();  //90
    }
    static void fun() {
        System.out.println(x);
    }
}
