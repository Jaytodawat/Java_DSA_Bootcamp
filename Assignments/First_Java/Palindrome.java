package Assignments.First_Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.nextLine();
        String rev="";
        int length = str.length(), i;
        for (i = length-1; i>=0; i--)
            rev = rev + str.charAt(i);

        if (rev.equals(str))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
