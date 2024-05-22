//E5.1
import java.util.Scanner;

public class E5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("Zero");
        } else {
            String sign = number > 0 ? "Positive" : "Negative";
            String size = Math.abs(number) < 1 ? "small" : (Math.abs(number) > 1000000 ? "large" : "");

            System.out.println(sign + (size.isEmpty() ? "" : " " + size));
        }
    }
}
