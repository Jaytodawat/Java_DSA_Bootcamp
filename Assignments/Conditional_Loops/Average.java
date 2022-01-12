package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        int total = scan.nextInt();
        for (int i = 0; i < total; i++) {
            float num = scan.nextInt();
            sum += num;
        }
        System.out.println("average is " + (sum/total));
    }
}
