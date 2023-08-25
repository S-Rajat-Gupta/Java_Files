package com.rj;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int emp_id = in.nextInt();
        String department = in.next();

        switch (emp_id){
            case 1:
                System.out.println("rj");
                break;
            case 2:
                System.out.println("nik");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Mechanical":
                        System.out.println("Mechanical Department");
                        break;
                    default:
                        System.out.println("No Department found");
                }
                break;
            default:
                System.out.println("Enter correct emp_id");
        }

        // A Better way for Clean Code:-
        switch (emp_id) {
            case 1 -> System.out.println("rj");
            case 2 -> System.out.println("nik");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Mechanical" -> System.out.println("Mechanical Department");
                    default -> System.out.println("No Department found");
                }
            }
            default -> System.out.println("Enter correct emp_id");
        }
    }
}
