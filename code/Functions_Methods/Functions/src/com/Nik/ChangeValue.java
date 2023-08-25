package Functions_Methods.Functions.src.com.Nik;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Creating an array
        int[] arr = {1,3,2,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] nums) {
        nums[0] = 99; //if you make a change via this reference variable, Same Object will be changed
    }
}
