// Write a Java program to print the sum (addition), multiply, subtract, divide and
// remainder of two numbers.
// Test Data:
//              Input first number: 125
//              Input second number: 24
// Expected Output:
//                  125 + 24 = 149
//                  125 - 24 = 101
//                  125 x 24 = 3000
//                  125 / 24 = 5
//                  125 mod 24 = 5

package Homework;

import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        math();
    }

    public static void math() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double multi = num1 * num2;
        double subs = num1 - num2;
        double slash = num1 / num2;
        double per = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " x " + num2 + " = " + multi);
        System.out.println(num1 + " - " + num2 + " = " + subs);
        System.out.println(num1 + " / " + num2 + " = " + slash);
        System.out.println(num1 + " mod " + num2 + " = " + per);
    }
}
