import java.util.Scanner;
import java.lang.Math;

public class UocChiaHai {
    static int countDivisors(int n, int k) {
        int count = 0, i;
        for (i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i % k == 0) {
                    count++;
                }
                if ((n / i) % k == 0) {
                    count++;
                }
            }
        }

        i--;
        if ((i * i == n) && (i % k == 0)) {
            count--;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 2 == 1) {
                System.out.println(0);
                continue;
            }
            System.out.println(countDivisors(n, 2));
        }
    }
}
