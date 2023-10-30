// Write a program to convert the upper case to lower case.

package Homework;

public class Que09 {
    public static void main(String[] args) {
        convert();
    }

    public static void convert() {
        String upperCaseStr = "HELLO THERE, HOW ARE YOU TODAY?!";
        String lowerCaseStr = upperCaseStr.toLowerCase();
        System.out.println("Original: " + upperCaseStr);
        System.out.println("Converted: " + lowerCaseStr);
    }
}

