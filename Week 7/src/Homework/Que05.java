//Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods. (Note: Two static and Two instance methods.)

package Homework;

public class Que05 {

    // Two instance methods
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    // Two static methods
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        Que05 calc = new Que05();

        int sum = calc.add(12, 6);
        int sub = calc.subtract(12, 6);
        int mlt = multiply(12, 6);
        double dvd = divide(12, 6);

        // Using string concatenation to display the results
        System.out.println("Sum of 10 and 5: " + sum);
        System.out.println("Subtraction between 10 and 5: " + sub);
        System.out.println("Multiplication of 10 and 5: " + mlt);
        System.out.println("Division of 10 by 5: " + dvd);
    }
}
