package Lectures.First_Java;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Type Conversion
//        float num = input.nextFloat();
//        int num =input.nextFloat();  This will give error as int is smaller than float.

        //Type Casting
        /*
        int num = (int)(67.89f);
        System.out.println(num);
        */

        //Automatic type Promotion in expression
//        int a = 257;
        //maximum range of byte is 256
//        byte b = (byte)(a);  // 257 % 256 = 1
//        System.out.println(b);
        
        /*Following code will create error as in java during evaluation of byte datatype it is converted
        into int datatype.*/
//        byte b = 50;
//        b = b*2;
        
        byte b = 54;
        char c = 'a';
        short s = 1067;
        int i = 56746;
        float f = 45.78f;
        double d= 0.6473457;
        double result = (f*b) + (i / c) - (d*s);
        System.out.println(result);
    }
}
