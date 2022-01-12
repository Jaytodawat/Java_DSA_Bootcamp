package Lectures.Switch_statement;

import java.util.Scanner;

public class weekday_weekend {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int week_number = scan.nextInt();

        //Normal Switch Statement

//        switch (week_number) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }
        //Enhanced Switch Statement

        switch (week_number){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
