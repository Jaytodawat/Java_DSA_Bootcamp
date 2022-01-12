package Assignments.Conditional_Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int min = num1 * num2;
        int large = 0;
        int small = 0;
        if (num1 > num2){
            large = num1;
            small = num2;
        } else if (num2 > num1){
            large = num2;
            small = num1;
        }
        for (int i = 1; i <= large; i++) {
            for (int j = 1; j <= large ; j++) {
                if (small * j == large * i && large * i < min){
                    min = large * i;
                }
            }
        }
        System.out.println(min);
    }
}
