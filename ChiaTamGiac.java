import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            double n = scanner.nextDouble();
            double h = scanner.nextDouble();
            for (double i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt(i/n)*h);
            }
            System.out.println();
        }
    }
}
