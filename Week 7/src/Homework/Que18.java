//18. Write a Java Program using below steps.
//18.1 Declare your council name as static variables.
//18.2 Declare your house number as instance variables.
//18.3 Declare one instance method name borough() and call Static variable
//18.4 Declare static method name address() and call instance variable
//18.5 Call both user defined methods into main method.


package Homework;

public class Que18 {

    // Declare council name as a static variable
    static String council = "Harrow";

    // Declare house number as an instance variable
    String houseNumber = "476";

    public static void main(String[] args) {
        //Call both methods into the main method
        Que18 obj1 = new Que18();
        obj1.borough();
        address();
    }

    // Declare one instance method named borough() and call the static variable
    public void borough() {
        System.out.println("Council Name: " + council);
    }

    // Declare static method named address() and call the instance variable
    public static void address() {
        Que18 obj = new Que18();
        System.out.println("House Number: " + obj.houseNumber);
    }
}
