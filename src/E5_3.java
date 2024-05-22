import java.util.Scanner;

public class E5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        number = Math.abs(number);
        int digits = (number == 0) ? 1 : 0;

        while (number > 0) {
            number /= 10;
            digits++;
        }

        System.out.println("Number of digits: " + digits);
    }
}
