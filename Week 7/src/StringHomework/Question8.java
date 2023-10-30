//Write a java program which replace string to lower case.

package StringHomework;

public class Question8 {
    public static void main(String[] args) {

        Question8 print = new Question8();
        print.lowerClass();
    }

    public void lowerClass() {
        String original = "I AM SOFTWARE TESTER!";
        String lowerCase = original.toLowerCase();

        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + lowerCase);

    }
}
