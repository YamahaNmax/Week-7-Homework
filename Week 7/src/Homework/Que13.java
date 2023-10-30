// Write a Java program to print the area and perimeter of a rectangle.
// Test Data: Width = 5.5 Height = 8.5
// Expected Output:
//                  Area is 5.6 * 8.5 = 47.60
//                  Perimeter is 2 * (5.6 + 8.5) = 28.20

package Homework;

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Que13 obj = new Que13();
        obj.rec1();
        rec2();
    }

    public void rec1() {
        double width = 5.5;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is : " + area);
        System.out.println("Perimeter is : " + perimeter);
    }


    // Trying this using scanner

    public static void rec2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height : ");
        double height = scanner.nextDouble();

        System.out.print("Enter the width : ");
        double width = scanner.nextDouble();

        double area = height * width;
        double perimeter = 2 * (height + width);

        System.out.println("Area is : " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}
