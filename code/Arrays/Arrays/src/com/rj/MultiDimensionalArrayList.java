package com.rj;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // ater creating it this will be empty(null) so we have to initialise it first in order to use it

              // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

             // Add the elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);



    }
}
