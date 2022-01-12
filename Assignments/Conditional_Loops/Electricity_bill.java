package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        double units = scan.nextDouble();
        System.out.print("Enter price per unit: ");
        double price = scan.nextDouble();
        System.out.println("Eletricity bill : ₹ " + price * units);
    }
}
