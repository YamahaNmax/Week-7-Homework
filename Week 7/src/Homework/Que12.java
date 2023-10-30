// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


package Homework;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        avg();
    }

    public static void avg() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of the numbers is: " + average);
    }
}

