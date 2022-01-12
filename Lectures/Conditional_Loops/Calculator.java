package Lectures.Conditional_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter Operator");
            char op = scan.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.print("Enter two numbers:");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }else {
                        System.out.println("Can not divide by zero");
                    }
                }
                System.out.println(ans);
            }
            else if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Operation!!");
            }
        }
    }
}
