package Lectures.Functions;

//Variable Length Arguments:  a method that takes a variable number of arguments.

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1,2,3,6,87,98,4657,67);
        multiple(12, 13, "jay Todawat", "Rahul");
    }

    //When we want mixed argument:
    //Variable length parameters must be at last
    static void multiple(int a, int b, String ...v){

    }

    static void fun (int ...v){ //internally it is taking it as array/collection of integer
        System.out.println(Arrays.toString(v));

    }
}
