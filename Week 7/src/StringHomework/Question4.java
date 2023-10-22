//Write a java program which give length of string “I love java”.
//Expected output: 11

package StringHomework;

public class Question4 {
    public static void main(String[] args) {

        Question4 print = new Question4();
        print.length();
    }

    public static void length(){
        String text = "I love java";
        int length = text.length();

        System.out.println("Expected output: " + length);
    }
}
