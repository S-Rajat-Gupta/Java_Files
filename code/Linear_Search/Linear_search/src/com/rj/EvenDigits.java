package com.rj;

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
//        System.out.println(findNumbers(nums));
//        System.out.println(digits(-7879465));  // this will give how many digits in a number
//        System.out.println(digits(123456789));
        System.out.println(digits2(345678));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numOfDigits = digits(num);
        /* Either this :----->
            if(numOfDigits % 2 ==0){
            return true;
        }
        return false;
         */ // or this ---->
        return numOfDigits % 2 == 0;
    }

    // 2nd way of finding the digits
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }


    // count number of digits in a number (both negative and positive numbers)
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num> 0){
            count++;
            num = num/10;
        }
        return count;
    }



}
