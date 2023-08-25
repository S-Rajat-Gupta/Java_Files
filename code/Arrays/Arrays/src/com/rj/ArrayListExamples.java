package com.rj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
                //Syntax:-
        ArrayList<Integer> list = new ArrayList<>(10);
                //Adding values in List manually one by one
        //        list.add(0);
//        list.add(5);
//        System.out.println(list);

                // set any value of element using index and assign value
//        list.set(0,99);
//        System.out.println(list);

                //is any element is in array list or not give boolean value
//        System.out.println(list.contains(99));

                //removing element
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

                //Input using for loop for multiple values
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());

        }
            // get item at any index
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));  // have to pass index here,  list[index] syntax will not work here

        }
        System.out.println(list);







    }
}
