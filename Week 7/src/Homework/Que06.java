// Write a program to enter any radius value of the circle and find out the area. (Formula of Area A=PI*r*r).

package Homework;

import java.util.Scanner;

public class Que06 {

    public static void main(String[] args) {
        radCirc();
    }

    public static void radCirc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area using the formula A = PI*r*r
        double area = Math.PI * radius * radius;

        // Display the calculated area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

    }
}
