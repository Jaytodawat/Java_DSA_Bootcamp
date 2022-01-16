package Lectures.Arrays_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of primitives:
        int[] arr = new int[5];

//        //Input using for loop:
//        for (int i = 0; i < 5; i++){
//            arr[i] = in.nextInt();
//        }
//
//        //toString Method
//        System.out.println(Arrays.toString(arr)); // prints the whole array

        /*
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }

        //Enhanced for loop:
        for (int num : arr) { //here num represents the element of array
            System.out.print(num + " ");// for every element in array, print the element
        }
        */

//        System.out.println(arr[5]);// index out of bound error

        //Array of object:

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
