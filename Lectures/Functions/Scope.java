package Lectures.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Jay Todawat";

        //Scoping in Blocks
        /*
        - Anything initialised outside the block can be used inside the block
          but anything initialised inside the block cannot be used outside the block.
        - Anything initialised outside the block cannot be again initialised inside the block
          but anything initialised inside the block can be initialised outside the block again.
         */
        {
        //    int a = 100; This can't be initialised here as it is already initialised outside the box.
            a = 100; //reassigning can be done as it is already initialised outside the box.
            System.out.println(a);

            name = "Jayu";
            System.out.println(name);


            int c = 40; //this is a new variable initialised inside the block.
        }
        //int c = 50; //The variable c can be initialised again outside the block even after initialised inside the block.
        //System.out.println(c);//Here the variable c initialised inside the block can not be used outside the block.
        System.out.println(a);
        System.out.println(name);
        //In above cases values reassigned inside the block will print.

        //Scoping in for loop:
        //Same rule as block
        for (int i = 0 ; i<=0 ; i++){
            int v = 67;//initialised inside the loop
            System.out.println(v);
        //    int a = 10; can not be reinitialised again inside the loop
            a = 78;//updated inside the loop
        }
    //    System.out.println(i); can not use variable initialised inside the loop
        System.out.println(a);
    //    System.out.println(v); can not use variable initialised inside the loop
    }

    //Scoping in Methods:
    /*
    - Variables initialised inside in any function can only be used inside that function
      it can not be used in any other function
    - variables initialised in any other function can again be initialised in another funtion.
     */
    static void random(int marks){
        int num = 57;
        System.out.println(num);
        System.out.println(marks);
    }
}
