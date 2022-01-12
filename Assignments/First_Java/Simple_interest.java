
// Q.3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package Assignments.First_Java;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float P = input.nextFloat();
        float T = input.nextFloat();
        float R = input.nextFloat();

        double interest = (P * T * R) / 100;
        System.out.println(interest);
    }
}
