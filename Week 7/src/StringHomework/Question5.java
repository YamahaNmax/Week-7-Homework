//Write a java program to concat 2 string.
//Expected output: I love java I dream java

package StringHomework;

public class Question5 {
    public static void main(String[] args) {

        Question5 print = new Question5();
        print.connect();

    }

    public void connect() {
        String name1 = "I love java";
        String name2 = "I dream java";

        String result = name1 + " " + name2;

        System.out.println("Expected output: " + result);

    }
}
