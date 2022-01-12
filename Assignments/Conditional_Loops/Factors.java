package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
           if (num % i == 0){
               System.out.print(i + " ");
           }
        }
    }
}
