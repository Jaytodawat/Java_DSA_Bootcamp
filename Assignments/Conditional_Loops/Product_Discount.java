package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Product_Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter original price : ₹ ");
        float ori_price = scan.nextFloat();
        System.out.print("Enter discount in %: ");
        float discount = scan.nextFloat();
        float final_price = ori_price - (ori_price * discount / 100);
        System.out.println("Final price is : ₹ " + final_price);
    }
}
