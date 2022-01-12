package Lectures.Functions;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        int fin = sum(20, 30);
        System.out.println(fin);

        Scanner input = new Scanner(System.in);
        String naam = input.nextLine();
        String greeting = my_greet(naam);
        System.out.println(greeting);
    }

    //1) Integer Function:
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    //2) String function:
    static String my_greet(String name){
        String greet = "Hello " + name;
        return greet;
    }
}
