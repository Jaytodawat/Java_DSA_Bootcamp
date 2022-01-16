package Lectures.Arrays_arraylist;

import java.util.Arrays;

public class Parsing_gin_functions {
    public static void main(String[] args) {
        int[] nums = {1,34,54,32};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
