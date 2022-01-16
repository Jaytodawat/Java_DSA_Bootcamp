package Lectures.Arrays_arraylist;

public class Main {
    public static void main(String[] args) {
        //Syntax of arrays
        //datatype[] variable_name = new datatype[size];
        //store 5 integers:
        int[] rnos = new int[5];
        //or directly
        int[] rnos2 = {23, 13, 54, 32, 54};
        //all the type of data in the array should be same.

        int[] ros; //declaration of array. ros is getting defined in the stack.
        ros = new int[5]; //initialization: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);// 0: By default int array contain all zero element

        //String array:
        String[] arr = new String[4];
        System.out.println(arr[2]); // null

        /*
        *null*
        - it is not a datatype, it is a literal
        - it can only assign to non-primitives(Strings as it can be broken down into char)
         */
    }
}
