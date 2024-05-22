import java.util.Scanner;

public class E5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All the same");
        } else if (a != b && b != c && a != c) {
            System.out.println("All different");
        } else {
            System.out.println("Neither");
        }
    }
}
