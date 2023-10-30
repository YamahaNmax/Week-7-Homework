//19. Write a Java Program using below steps.
//19.1 Declare one of your group member names as instance variable.
//19.2 Declare one of your group member names as static variable.
//19.3 Declare one instance method name with group name (e.g. selenium())and call both global
//variables.
//19.4 Declare static method name agile() and call both variable
//19.5 Call both user defined methods into main method.
//Note: Declare 1 local variables in all user defined method and main method and print in to statement

package Homework;

public class Que19 {

    // Declare one of your group member names as instance variable
    String member1 = "Ayan";

    // Declare one of your group member names as a static variable
    static String member2 = "Zarna";

    public static void main(String[] args) {

        agile();

        // Declare 1 local variable in main method and print
        int localVa = 10;
        System.out.println("This is Local Variable in Main Method = " + localVa);

        // Call both methods into the main method
        Que19 obj = new Que19();
        obj.code2();
    }

    // Declare one instance method and call both global variables
    public void code2() {

        // Declare 1 local variable and print
        int localInCode2 = 15;
        System.out.println("This is Local Variable in Instance Method = " + localInCode2);

        System.out.println("Group Member 1 : " + member1 + " (Is From Instance Method)");
        System.out.println("Group Member 2 : " + member2 + " (Is From Instance Method)");
    }

    // Declare static method named agile() and call both variables
    public static void agile() {
        // Accessing instance variable in static method by creating an object
        Que19 obj = new Que19();
        System.out.println("Group Member 1 : " + obj.member1 + " (Is From Static Method)");
        System.out.println("Group Member 2 : " + member2 + " (Is From Static Method)");

        // Declare 1 local variable and print
        int localInAgile = 20;
        System.out.println("This is Local Variable in Static Method = " + localInAgile);
    }
}
