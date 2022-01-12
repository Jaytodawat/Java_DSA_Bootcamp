package Lectures.Conditional_Loops;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        int length = str.length();
        int a = 0;//This variable is used to store the information about the word in the form of 0 and 1
        for (int i = 0; i<length; i++){
            char ch = str.charAt(i);
            if ( (ch >= 'a' && ch <='z') || ch == 32) {
                a = 0;//if the character is lowercase
            } else {
                a = 1;//if any character found uppercase then value of a will change to 1 and loop will break here and value of a will be 1
                break;
            }
        }
        if ( a == 0){
            System.out.println(str + " is purely lowercase word");
        }else{
            System.out.println(str + " contains uppercase letters");
        }


    }
}
