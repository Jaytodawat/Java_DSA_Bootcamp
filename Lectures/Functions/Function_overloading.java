package Lectures.Functions;

import java.util.Arrays;

public class Function_overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("jay");
        demo(1,2,3,4,5,6);
        demo("jay", "Kunal", "Rahul");
        //demo(); //This will show error as it can not decide in which function to go.
    }

    /*
    Function overloading happen when two same function used in a program with either the no. of argument is different
    or different argument type
     */

    //In case of varags:

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a +b + c;
    }

    static void fun(int a) {
        System.out.println("first");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second");
        System.out.println(name);
    }
}
