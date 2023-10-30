//2. Write a Java programme using the following steps.
//        2.1 Declare two static variables.
//        2.2 Declare one static method.
//        2.3 Call both static variables into the static method inside the print statement.
//        2.4 Declare the Main method.
//        2.5 Call the static method into the Main method and run the programme.


package Homework;

public class Que03 {


    int x = 32;  // 3.1 Declare one instance and one
    static int y = 72;  // 3.1 Declare static variable.

    // 3.2 Declare one instance method.
    public void itc() {

        // Calling both instance and static variables inside the instance method.
        System.out.println("Instance variable: " + x);
        System.out.println("Static variable (from instance method): " + y);
    }

    // 3.3 Declare one static method.
    public static void stc() {

        // Calling static variable inside the static method.
        System.out.println("Static variable: " + y);

        // For displaying instance variable, we need to create an object
        Que03 call = new Que03();
        System.out.println("Instance variable (from static method): " + call.x);
    }

    // 3.5 Declare the Main method.
    public static void main(String[] args) {
        // 3.6 Call instance and static methods into the Main method.
        Que03 call = new Que03();              // Creating object to call the instance method
        call.itc();
        stc();          // Calling the static method
    }
}






