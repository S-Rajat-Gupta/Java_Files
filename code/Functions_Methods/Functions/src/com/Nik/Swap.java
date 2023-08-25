package Functions_Methods.Functions.src.com.Nik;

public class Swap {
    public static void main(String[] args) {

        /*
            int a = 10;
            int b = 20;
                // Swap numbers code
            int temp = a ;
            a = b;
            b = temp;
            System.out.println (a + " " + b )
         */

        int a = 10;
        int b = 20;
        num(a,b);
        System.out.println(a +" " + b);

        String name = "Batman";
        changename(name);
        System.out.println(name);
    }

    static void changename(String name) {
        name = "Rajat"; // not modifing the original object but here We're Creating A New Object.

    }

    static void num(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // This change will only be valid in this function's Scope only.
    }
}
