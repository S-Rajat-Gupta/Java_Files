package Functions_Methods.Functions.src.com.Nik;

public class
PassingExample {
    public static void main(String[] args) {
//        String name = "Iron Man";
//        greet(name);

//        String name = "Nik";
//        convert(name);
//        System.out.println(name);

        int a = 10;
        int b = 20;
        swapping(a,b);
        System.out.println(a + "  " + b);

    }

    static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void convert(String call) {
        call = "Rj";
    }

    static void greet(String new_name) {
        System.out.println(new_name);
    }







}
