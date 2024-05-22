import java.util.Scanner;

public class E5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        int length = word.length();
        String firstHalf = word.substring(0, length / 2);
        String secondHalf = word.substring((length + 1) / 2);

        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half same");
        } else {
            System.out.println("First and second half different");
        }
    }
}
