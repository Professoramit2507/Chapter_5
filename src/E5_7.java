import java.util.Scanner;

public class E5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Increasing");
        } else if (a > b && b > c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
