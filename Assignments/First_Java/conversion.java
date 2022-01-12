
//Q.6 Input currency in rupees and output in USD.

package Assignments.First_Java;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter INR: ");
        float inr = input.nextFloat();
        System.out.println("1 INR = 0.013 USD");
        System.out.println(inr + " INR = " + (inr*0.013) + " USD");
    }
}
