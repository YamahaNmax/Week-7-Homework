//Write a Java program print your full name on screen and then print your surname on a separate line.

package StringHomework;

public class Question1 {

    public static void main(String[] args) {

        Question1 print = new Question1();
        print.printFullName();

    }
    public static void printFullName() {
         String firstName = "Miten";
         String lastName = "Patel";

        System.out.println(firstName + " " + lastName);
        printSurname(lastName);
    }

    public static void printSurname(String surname) {
        System.out.println(surname);
    }

}
