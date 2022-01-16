package Assignments.Functions;

import java.util.Scanner;

public class Sum_upto_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println("Sum is " + sum(N));
    }

    static int sum(int a){
        int temp = 0;
        for (int i = 0; i <= a; i++) {
            temp += i;
        }
        return temp;
    }
}
