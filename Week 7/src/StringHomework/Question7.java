//Write a java program which replace string to upper case.

package StringHomework;

public class Question7 {
    public static void main(String[] args) {

        upperCase();
    }

    public static void upperCase() {
        String original = "hello, i am codebuster student!";
        String upperCase = original.toUpperCase();

        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upperCase);

    }
}
