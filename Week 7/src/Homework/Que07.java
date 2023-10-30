//Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
//((F − 32) × 5/9 = 0°C).


package Homework;


import java.util.Scanner;

public class Que07 {

    public static void main(String[] args) {
        Que07 obj = new Que07();        // Creating an object to call instance method.
        obj.tempConverter();
    }

    public void tempConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
    }
}