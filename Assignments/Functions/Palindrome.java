package Assignments.Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (palindrome_or_not(num) == num){
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not pallindrome");
        }
    }
    static int palindrome_or_not(int n){
        int l = (String.valueOf(n).length()-1);
        int original = n;
        int rev = 0;
        while (n > 0){
            int rem = n % 10;
            double temp = rem * Math.pow(10 , l);
            rev += temp;
            l--;
            n /= 10;

        }
        return rev;
    }
}
