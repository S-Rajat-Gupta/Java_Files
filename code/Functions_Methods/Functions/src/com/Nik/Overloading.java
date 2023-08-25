package Functions_Methods.Functions.src.com.Nik;

public class Overloading {
    public static void main(String[] args) {
        fun(97);
        fun("Rajat"+"   "+"neha");
        int ans = sum(2,3);
        System.out.println(ans);
        int sol = sum(20,30,50);
        System.out.println(sol);
    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
