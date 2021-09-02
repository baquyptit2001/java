import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long res = 0L;
            res = ((long) n + 1) * ((long) n / 2);
            if (n % 2 == 1) {
                res += (long)(n/2)+1L;
            }
            System.out.println(res);
        }
    }
}
