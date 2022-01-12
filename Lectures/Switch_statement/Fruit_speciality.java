package Lectures.Switch_statement;

import java.util.Scanner;

public class Fruit_speciality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.next();

//        switch (fruit) {
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Mango":
//                System.out.println("The king");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }

        //Enhanced switch:
        switch (fruit) {
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Mango" -> System.out.println("The king");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Invalid input");
        }

    }
}
