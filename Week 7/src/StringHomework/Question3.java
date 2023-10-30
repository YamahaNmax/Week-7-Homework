//Write a java program which replace a “I love java” to “we love java”
//Expected output: We love java

package StringHomework;

public class Question3 {
    public static void main(String[] args) {

        Question3 print = new Question3();
        print.replace();

    }

    public void replace() {

        String original = "I love java";
        String replaced = original.replace("I", "We");

        System.out.println("Expected output: " + replaced);
    }
}
