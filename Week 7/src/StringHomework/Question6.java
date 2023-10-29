//Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java

package StringHomework;

public class Question6 {
    public static void main(String[] args) {

        Question6 print = new Question6();
        print.replace();
    }

    public void replace(){
        String original = "I@love@java";
        String replaced1 = original.replace("@", " ");
        String replaced2 = replaced1.replace("I", "We");
        System.out.println("Expected output: " + replaced2);

    }
}
