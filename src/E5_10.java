import java.util.HashMap;
import java.util.Scanner;

public class E5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(a, counts.getOrDefault(a, 0) + 1);
        counts.put(b, counts.getOrDefault(b, 0) + 1);
        counts.put(c, counts.getOrDefault(c, 0) + 1);
        counts.put(d, counts.getOrDefault(d, 0) + 1);

        if (counts.size() == 2 && counts.containsValue(2)) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
    }
}
