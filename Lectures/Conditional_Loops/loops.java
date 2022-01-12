package Lectures.Conditional_Loops;



public class loops {
    public static void main(String[] args) {
        /*
            Syntax of for loops:
            for (initialisation ; condition; increment/decrement) {
                // body
            }

         */

        for ( int i = 0; i <= 5; i++){
           // System.out.println(i);
        }

        /*
            Syntax of While loops:
            while (condition) {
                // body
            }
         */

        int num= 1;
        while (num <= 6) {
         //   System.out.print(num + " ");
            num += 1;
        }

        //do while loop
        /*
            syntax of do while loop:

            do {
                //body
            } while (condition);

         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

        //Difference between do while and while loop is that in do while loop loop will execute at least once.
        int m = 1;
        do {
            System.out.println("Hello world");
        } while ( m != 1);
    }
}
