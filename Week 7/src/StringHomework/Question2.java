//Write a java program which remove extra space from both side “ I love java ”
//Expected output: “I love java”

package StringHomework;

public class Question2 {
    public static void main(String[] args) {

        Question2 print = new Question2();
        print.trim();
    }

    public void trim() {
        String input = "  I love java  ";
        String print = input.trim();

        System.out.println("Expected output: \"" + print + "\"");
    }

}
