package Lectures.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    //Syntax of Method:
    /*
    access modifier (in oop) return_type name(arguments){
        //body
        return statement;
    }
    */

    static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int1: ");
        int int1 = scan.nextInt();
        System.out.print("Enter int2: ");
        int int2 = scan.nextInt();
        int sum = int1 + int2 ;
        System.out.println("Sum is " + sum);
    }
}
