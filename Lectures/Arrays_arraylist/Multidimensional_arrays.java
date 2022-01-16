package Lectures.Arrays_arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*

            1 2 3
            4 5 6
            7 8 9

         */

        //Syntax for 2D array:

        //datatype[][] variable_name = new datatype[no. of rows*][no. of columns]
        //no. of rows is mandatory
        /*


        int[][] arr_2d = new int[3][];

        int[][] arr_1= {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        System.out.println(arr_1.length); //no. of rows


        */

        int[][] arr = new int[3][3];

        //input using for loop:

        for(int row = 0; row < arr.length; row++) {
            //for each column in a row
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //Output using 1)for loops:
        for(int row = 0; row < arr.length; row++) {
            //for each column in a row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Output using 2)For loops:
        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //Output using 1)Enhanced for loop:
        for(int[] a : arr){
            for (int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }

        //Output using 2)Enhanced for loop:
        for(int[] a: arr ){
            System.out.println(Arrays.toString(a));
        }
    }
}
