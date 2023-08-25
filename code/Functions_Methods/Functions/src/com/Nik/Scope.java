package Functions_Methods.Functions.src.com.Nik;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Neha";
        // Values initialised outside the block can be used inside the block & also can be modified or reassign the value, but we cannot reassign them again.
        {
//            int a = 70;   // already initialised outside the block so cannot re-initialise it again though we can modify it
            a = 50; //Reassigning the original reference variable to some other value
            System.out.println(a);
            int c = 60;
            name= "Rajat";
            System.out.println(name);
                // Values initialised in this block will remain in block we cannot use them outside the block
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // we cannot use the values outside the block which are initialised inside the block

            // Scoping in For loops:-
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
//        System.out.println(i);  // cannot use outside the scope of for loop (^_^)
    }

}
