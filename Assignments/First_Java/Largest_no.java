
//Q.5 Take 2 numbers as input and print the largest number.

package Assignments.First_Java;

import java.util.Scanner;

public class Largest_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st No.: ");
        float num1 = input.nextFloat();
        System.out.println("Enter 2nd No.: ");
        float num2 = input.nextFloat();
        if (num1 > num2) {
            System.out.println("Largest No. is " + num1);
        }
        else if (num1 == num2) {
            System.out.println("Both No. are same");
        }
        else {
            System.out.println("Largest No. is " + num2);
        }
    }
}
