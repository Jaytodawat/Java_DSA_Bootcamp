//Q.2 Take name as input and print a greeting message for that name.

package Assignments.First_Java;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Happy New Year " + name);
    }
}
