import java.util.Scanner;

public class LcmGcd {
    static long GCD(long a, long b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long gcd = GCD(a, b);
            System.out.printf("%d %d\n", (a * b / gcd), gcd);
        }
    }
}
