//2. Write a Java programme using the following steps.
//        2.1 Declare two static variables.
//        2.2 Declare one static method.
//        2.3 Call both static variables into the static method inside the print statement.
//        2.4 Declare the Main method.
//        2.5 Call the static method into the Main method and run the programme.


package Homework;

public class Que02 {

        // 2.1 Declare two static variables.
        static int x = 5;
        static int y = 7;

        // 2.2 Declare one static method.
        public static void show() {
                // 2.3 Call both static variables into the static method inside the print statement.
                System.out.println("Value of x: " + x);
                System.out.println("Value of y: " + y);
        }

        // 2.4 Declare Main method.
        public static void main(String[] args) {
                // 2.5 Call static method into the Main method.
                show();
        }
}






