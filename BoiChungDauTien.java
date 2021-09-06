import java.util.Scanner;

public class BoiChungDauTien {
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long res = 1;
            int n = scanner.nextInt();
            for (int i = 2; i <= n; i++) {
                if (res % i == 0)
                    continue;
                res = (res * i) / gcd(res, i);
            }
            System.out.println(res);
        }
    }
}
