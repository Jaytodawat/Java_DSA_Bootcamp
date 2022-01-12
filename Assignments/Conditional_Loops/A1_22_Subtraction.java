package Assignments.Conditional_Loops;

import java.util.Scanner;

public class A1_22_Subtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int product = 1;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            product *= rem;
            sum += rem;
            num /= 10;
        }
        int difference = product - sum;
        System.out.println(difference);
    }
}
