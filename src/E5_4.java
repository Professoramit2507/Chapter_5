import java.util.Scanner;

public class E5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            System.out.println("First and last letter same");
        } else {
            System.out.println("First and last letter different");
        }
    }
}
