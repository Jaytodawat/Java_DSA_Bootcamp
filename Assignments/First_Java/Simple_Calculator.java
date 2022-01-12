package Assignments.First_Java;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd no.: ");
        int num2 = input.nextInt();
        System.out.println("Enter Operator for Operation : ");
        char operator;
        operator = input.next().charAt(0);

        //Important Point:
        /*In if condition String == "String" is not legal
        So use if (operator.equals("String"))
        * */


        if (operator == '+') {
            System.out.println("Sum of numbers = " + (num1 + num2));
        }
        else if (operator == '-') {
            System.out.println("Difference of numbers = " + (num1 - num2));
        }
        else if (operator == '*') {
            System.out.println("Product of Numbers = " + (num1 * num2));
        }
        else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Denominator can not be zero while division.");
            }
            else {
                System.out.println("Division of numbers = " + (num2 / num1));
            }
        }
    }
}