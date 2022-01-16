package Assignments.Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial_num(num));
    }

    static long factorial_num(int n) {
        long fact = 1;
        while (n > 0) {
            fact = fact * n;
            n = n-1;
        }
        return fact;
    }
}
