package Assignments.Conditional_Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int max = 1;
        for (int i = 1; i <=num2; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                if (i > max){
                    max = i;
                }
            }
        }
        System.out.println("HCF of " + num1 + " & " + num2 + " is " + max);
    }
}
