package Assignments.Functions;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        even_odd(num);
    }

    static void even_odd(int n){
        if (n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
