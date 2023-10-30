// Write a Java programme using the following steps.
//        1.1 Declare two instance variables.
//        1.2 Declare one instance method.
//        1.3 Call both instance variables into the instance method inside the print statement.
//        1.4 Declare the Main method.
//        1.5 Call the above instance method into the Main method and run the programme.

package Homework;

public class Que01 {

    // 1.1 Declare two instance variables.
    int x = 10;
    int y = 20;

    // 1.2 Declare one instance method.
    public void show() {

        // 1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println("Value of a: " + x);
        System.out.println("Value of b: " + y);
    }

    // 1.4 Declare Main method.
    public static void main(String[] args) {

        Que01 call = new Que01();
        call.show();

    }
}






