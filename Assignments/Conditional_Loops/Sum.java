package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = scan.nextInt();
            sum += num;
            if (num == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
