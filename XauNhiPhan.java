import java.util.Scanner;

public class XauNhiPhan {
    static Character bin(long[] f, int n, long k) {
        if (n == 1)
            return '0';
        if (n == 2)
            return '1';
        if (k > f[n - 2])
            return bin(f, n - 1, k - f[n - 2]);
        return bin(f, n - 2, k);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        while (t-- > 0) {
            long k;
            int n;
            n = scanner.nextInt();
            k = scanner.nextLong();
            long[] f = new long[100];
            f[1] = 1;
            f[2] = 1;
            for (int i = 3; i <= 93; i++)
                f[i] = f[i - 1] + f[i - 2];
            System.out.println(bin(f, n, k));
        }
    }
}
