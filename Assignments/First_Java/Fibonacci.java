package Assignments.First_Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1;
        int n3;
        int i = input.nextInt();
        n3 = n1 + n2;
        while(n3 <= i) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
