package Personal;

import java.util.Scanner;

public class int_to_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int num1 = input.nextInt();

        //(1)String.valueOf(int i)
        String str_num1 = String.valueOf(num1);
        System.out.println(str_num1);

        //(2)Integer.toString(int i)
        String str_num2 = Integer.toString(num1);
        System.out.println(str_num2);

        //(3)String.format()
        String str_num3 = String.format("%d", num1);
        System.out.println(str_num3);
    }
    
}
