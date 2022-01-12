package Lectures.Conditional_Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //My Approach:
    /*
        int number = scan.nextInt();
        int n = String.valueOf(number).length();
        int rev = 0;
        while (number > 0){
            int rem = number % 10;
            rev += rem *(Math.pow(10,(n-1)));
            number = number/10;
            n--;
        }
        System.out.println(rev);

    */
        //Another Approach:
        long num = scan.nextLong();
        long ans = 0;
        while ( num > 0){
            long rem = num%10;
            ans = ans*10 + rem;
            num/=10;
        }
        System.out.println(ans);
    }
}
