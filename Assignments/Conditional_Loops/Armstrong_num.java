package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem = 0;
        int number = num;
        int cube_sum = 0;
        while (num > 0){
            rem = num % 10;
            cube_sum += Math.pow(rem, 3);
            num /= 10;
        }
        System.out.println(cube_sum);
        if (cube_sum == number) {
            System.out.println("The Given no. is armstrong number.");
        }
    }
}
