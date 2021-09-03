import java.util.Scanner;

public class KiemTraFibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            if (n == 0 || n == 1) {
                System.out.println("YES");
                continue;
            }
            long f1 = 1L;
            long f2 = 1L;
            while (f1 + f2 < n) {
                long tmp = f1;
                f1 = f2;
                f2 += tmp;
            }
            if (f1 + f2 == n) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
