//20. Write a Java Program using below steps.
//20.1 Declare your Spain as static variable.
//20.2 Declare your United Kingdom as instance variable.
//20.3 Declare instance method name homeCountry()and call static variable.
//20.4 Declare static method name holidays() and call instance variable
//20.5 Call both methods in main method.

package Homework;

public class Que20 {

    // Declare "Spain" as a static variable.
    static String Spain = "Spain";

    // Declare "United Kingdom" as an instance variable.
    String UnitedKingdom = "United Kingdom";

    public static void main(String[] args) {
        // Create an object to call the instance method
        Que20 obj = new Que20();
        obj.homeCountry();
        holidays();
    }

    // Declare instance method and call the static variable.
    public void homeCountry() {
        System.out.println("Home Country : " + Spain + " (Static Variable)");
    }

    // Declare static method and call the instance variable.
    public static void holidays() {
        // Create an object To call an instance variable
        Que20 obj = new Que20();
        System.out.println("Holiday Destination : " + obj.UnitedKingdom + " (Instance Variable)");
    }
}
