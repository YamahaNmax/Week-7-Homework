//Write a Java program to convert a given string into lowercase.
//Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//Output: the quick brown fox jumps over the lazy dog.

package Homework;

public class Que15 {

    public static void main(String[] args) {

        Que15 print = new Que15();
        print.lowerClass();
    }

    public void lowerClass() {
        String original = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String lowerCase = original.toLowerCase();

        System.out.println("Uppercase: " + lowerCase);

    }
}
