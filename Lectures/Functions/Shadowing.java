package Lectures.Functions;

public class Shadowing {
    /*
    What is Shadowing?:
        Shadowing in Java is the practice of using variables in overlapping scopes with the same
    name where the variable in low-level scope overrides the variable of high-level scope.
    Here the variable at high-level scope is shadowed by the low-level scope variable.
     */

    static int x = 100;//this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x); //100
        int x;
        //System.out.println(x); //scope will begin when value is initialised
        x = 40; //here the variable is initialised
        System.out.println(x); //40
        fun();
    }
    static void fun() {
        System.out.println(x); //100
    }
}
