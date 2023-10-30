// Write a Java program that takes a number as input and prints its multiplication table up to 10.

package Homework;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Que10 obj = new Que10();        // Create an object to call instance method
        obj.table();
    }


    public void table() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}
