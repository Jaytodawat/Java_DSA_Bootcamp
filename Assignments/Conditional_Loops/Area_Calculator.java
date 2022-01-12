package Assignments.Conditional_Loops;

import java.util.Scanner;

public class Area_Calculator {
    public static void main(String[] args) {
        while(true){
            System.out.println("Select shape to calculate area:"
                                +"\n1) Circle"
                                +"\n2) Triangle"
                                +"\n3) Rectangle"
                                +"\n4) Parallelogram"
                                +"\n5) Rhombus"
                                +"\n6) Close the program");
            Scanner scan = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Enter your choice(1/2/3/4/5/6): ");
            int choice = scan.nextInt();

            //Area of Circle:
            if (choice == 1) {
                System.out.print("Enter Radius: ");
                double radius = scan.nextDouble();
                double area = (Math.PI)*Math.pow(radius, 2);
                System.out.println("Area of Circle is " + area);
                System.out.println("...");
            }

            //Area of Triangle:
            else if (choice == 2){
                System.out.println("Select type of triangle to calculate area:"
                                    +"\n1) Isosceles triangle"
                                    +"\n2) Equilateral Triangle");
                System.out.println(" ");
                System.out.print("Enter option: ");
                int opt = scan.nextInt();
                System.out.println(" ");
                if (opt == 1){
                    System.out.print("Enter perpendicular length: ");
                    double height = scan.nextDouble();
                    System.out.print("Enter base length: ");
                    double base = scan.nextDouble();
                    double area = 0.5 * height * base;
                    System.out.println("Area of Isosceles triangle is " + area);
                    System.out.println("...");
                }
                else if (opt == 2){
                    System.out.print("Enter side length: ");
                    double side = scan.nextDouble();
                    double area = (Math.pow(3, 0.5)/4) * side;
                    System.out.println("Area of Equilateral triangle is " + area);
                    System.out.println("...");
                }
                else {
                    System.out.println("Invalid Option");
                    System.out.println("...");
                }
            }

            //Area of rectangle:
            else if (choice == 3) {
                System.out.print("Enter length: ");
                double length = scan.nextDouble();
                System.out.print("Enter Breadth: ");
                double breadth = scan.nextDouble();
                double area = breadth * length;
                System.out.println("Area of rectangle is " + area);
                System.out.println("...");
            }

            //Area of parallelogram:
            else if (choice == 4) {
                System.out.print("Enter perpendicular length: ");
                double per_length = scan.nextDouble();
                System.out.print("Enter base length: ");
                double base_length = scan.nextDouble();
                double area = per_length * base_length;
                System.out.println("Area of parallelogram is " + area);
                System.out.println("...");
            }

            //Area of Rhombus:
            else if (choice == 5) {
                System.out.print("Enter length of 1st diagonal: ");
                double d1 = scan.nextDouble();
                System.out.print("Enter length of 2nd diagonal");
                double d2 = scan.nextDouble();
                double area = (d1 * d2) / 2;
                System.out.println("Area of rhombus is " + area);
                System.out.println("...");
            }
            else if (choice == 6){
                System.out.println("Program is closing...");
                break;
            }
            else{
                System.out.println("Invalid choice...");
                System.out.println("...");
            }
        }
    }
}
