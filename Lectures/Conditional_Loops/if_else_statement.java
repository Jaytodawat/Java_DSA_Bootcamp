package Lectures.Conditional_Loops;

public class if_else_statement {
    public static void main(String[] args) {
        /*
            syntax of if-else statement

            if (Boolean statement T or F) {
            //if T do this
            } else {
            //do this
            }

         */
        int num = 10089 ;
        if (num >= 11000) {
            num += 2000;
        } else {
            num += 1000;
        }
        System.out.println(num);
        //multiple if-else statement

        int salary = 2000;
        if (salary > 1000){
            salary += 200;
        } else if (salary > 500) {
            salary += 50;
        } else {
            salary += 100;
        }
        System.out.println(salary);
    }
}
