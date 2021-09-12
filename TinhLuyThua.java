import java.util.Scanner;

public class TinhLuyThua {
    static long power(long x, long y) {
        long res = 1;
        long p=1000000007;
        x = x % p;
        if (x == 0) return 0;

        while (y > 0) {
            if ((y & 1)==1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a == 0 && b == 0)
                break;
            System.out.println(power(a, b));
        }
    }
}
