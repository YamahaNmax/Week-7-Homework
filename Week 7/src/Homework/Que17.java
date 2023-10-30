//17 Write a Java Program using below steps.
//17.1 Declare your city as instance variables.
//17.2 Declare your country as static variables.
//17.3 Declare one instance method and call static variable in print statement
//17.4 Declare static method and call instance variable in print Statement.
//17.5 Call both user defined methods into main method.


package Homework;


public class Que17 {

    //Declare city as an instance variable
    String city = "Harrow";

    //Declare country as a static variable
    static String country = "England";

    public static void main(String[] args) {

        //Call both methods into main method
        Que17 obj1 = new Que17();
        obj1.itcMethod();
        stcMethod();
    }

    //Declare one instance method and call static variable in print statement
    public void itcMethod() {
        System.out.println("Country (from instance method): " + country);
    }

    //Declare static method and call instance variable in print statement
    public static void stcMethod() {
        Que17 obj = new Que17();
        System.out.println("City (from static method): " + obj.city);
    }
}