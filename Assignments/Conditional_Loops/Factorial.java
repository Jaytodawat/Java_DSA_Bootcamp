package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int number = num;
        double fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
