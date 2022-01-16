package Assignments.Functions;

import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max_num = max(num1, num2, num3);
        System.out.println("Maximum number is " + max_num);
        int min_num = min(num1, num2, num3);
        System.out.println("Minimum number is " + min_num);
    }

    static int max(int a, int b, int c) {
        int max = 0;
        if (max < a) {
            max = a;
        }
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;

        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }
}
