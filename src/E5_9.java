import java.util.Scanner;

public class E5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a <= b && b <= c) || (a >= b && b >= c)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }
    }
}
