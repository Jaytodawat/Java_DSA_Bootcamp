package Lectures.First_Java;

public class Basics {
    public static void main(String[] args) {
//        int a = 10;
//        if (a == 10) {
//            System.out.println("Namaste Duniya");
//        }

//        int a = 1;

        //While loops :
//        while (boolean condition){
//            loop statements...
//        }
//        while(a != 5){
//            System.out.println(a);
//            a++;
//        }

        //for loops:

        /*
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }

        for (initialization condition; testing condition; increment/decrement) {
            statement(s)
        }

        Statement 1 is executed (one time) before the execution of the code block.

        Statement 2 defines the condition for executing the code block.

        Statement 3 is executed (every time) after the code block has been executed.
         */
        for(int count = 1; count != 5; count++) {
            System.out.println(count);
        }
    }
}

