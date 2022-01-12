package Lectures.Functions;

import java.util.Scanner;

public class Return_types {
    /*
    - Every method in Java is declared with a return type & it is mandatory for all java methods.
    - A return type may be a primitive type like int, float, double, a reference type or void type(returns nothing).
    - void return type is used when we don't want return some value
    - The type of data returned by a method must be compatible with the return type specified by the method.
      For instance, if the return type of some method is boolean, we can not return an integer.
    - The variable receiving the value returned by a method must also be compatible with the return type specified for the method.
    */
    public static void main(String[] args) {
        sum_1();
        //When we just call function in case1 then it doesn't print anything

        int fin = sum_1();
        System.out.println(fin);
        //When we store the value return by function sum_1()  then it prints value

        sum_2();
        //sum_2() function return nothing
    }

    //1) Methods Returning a value:
    static int sum_1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int1: ");
        int int1 = scan.nextInt();
        System.out.print("Enter int2: ");
        int int2 = scan.nextInt();
        int sum = int1 + int2 ;
        System.out.println("Test");
        return sum;
    }

    //Method Not Returning a value:
    static void sum_2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int1: ");
        int int1 = scan.nextInt();
        System.out.print("Enter int2: ");
        int int2 = scan.nextInt();
        int sum = int1 + int2 ;
        System.out.println("Sum is " + sum);
    }
}
