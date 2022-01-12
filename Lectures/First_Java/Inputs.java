package Lectures.First_Java;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter some input: ");
//        String name = input.next();
        String name = input.nextLine();

//        float marks = input.nextFloat()

//        int rno = input.nextInt()

        System.out.println("My name is " + name);
//        int a = 234_000_000;
//        System.out.println(a);
    }
}
