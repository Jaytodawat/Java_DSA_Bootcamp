package Personal;

import java.util.Scanner;

public class string_to_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str_n = input.nextLine();

        //(1)Integer.parseInt()
        int n = Integer.parseInt(str_n);
        System.out.println(n);

        //(2)Integer.valueOf()
        int n1= Integer.valueOf(str_n);
        System.out.println(n1);
    }
}
