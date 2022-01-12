
//Q.Count the no. of occurrence of input in input integer

package Lectures.Conditional_Loops;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int n = scan.nextInt();
        int count = 0;
        while (num>0){
            if (num%10 == n){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
