package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String rev ="";
        for (int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
