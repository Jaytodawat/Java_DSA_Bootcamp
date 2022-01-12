
//Q.1 Write a program to print whether a number is even or odd, also take input.

package Assignments.First_Java;


import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The given no. is even ");
        }
        else {
            System.out.println("The given no. is odd ");
        }
    }
}
