package Assignments.Functions;

//Q. Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for( int i = num1; i <= num2; i++) {
            if (is_prime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean is_prime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
