package Lectures.Conditional_Loops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = scan.nextInt();
        int count = 2;
        int temp = 0;
        while (count <= n) {
            temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println(temp);
    }
}
