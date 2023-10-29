//Write a Java programme using the following steps.
//        4.1 Declare two instance and two static variables.
//        4.2 Declare one instance method.
//        4.3 Declare one static method.
//        4.4 Call all four instance and static variables into both instance and static methods inside the
//        print statement.
//        4.5 Declare the Main method.
//        4.6 Call both instance and static methods into the Main method and run the programme.

package Homework;

public class Que04 {

    // 4.1 Declare two instance and two static variables.
    int itcVar1 = 7;
    int itcVar2 = 3;
    static int stcVar1 = 28;
    static int stcVar2 = 32;

    // 4.2 Declare one instance method.
    public void itcMethod() {

        // Calling all four variables inside the instance method.
        System.out.println("Instance Variable 1: " + itcVar1);
        System.out.println("Instance Variable 2: " + itcVar2);
        System.out.println("Static Variable 1 (from instance method): " + stcVar1);
        System.out.println("Static Variable 2 (from instance method): " + stcVar2);
    }

    // 4.3 Declare one static method.
    public static void stcMethod() {

        // Calling both static variables directly
        System.out.println("Static Variable 1: " + stcVar1);
        System.out.println("Static Variable 2: " + stcVar2);

        // For displaying instance variables, we need to create an object
        Que04 call = new Que04();
        System.out.println("Instance Variable 1 (from static method): " + call.itcVar1);
        System.out.println("Instance Variable 2 (from static method): " + call.itcVar2);
    }

    // 4.5 Declare the Main method.
    public static void main(String[] args) {

        // 4.6 Call both instance and static methods into the Main method.
        // Creating an object to call the instance method

        Que04 call = new Que04();
        call.itcMethod();
        stcMethod();        // Calling the static method directly
    }
}
