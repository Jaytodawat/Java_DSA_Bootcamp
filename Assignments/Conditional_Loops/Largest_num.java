package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        while(true) {
            int num = scan.nextInt();
            if (num > max){
                max = num;
            }
            if (num == 0){
                break;
            }
        }
        System.out.println("Largest No. is " + max);
    }
}
