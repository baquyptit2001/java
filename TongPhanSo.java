import java.util.Scanner;

public class TongPhanSo {
    public static Long gcd(Long a, Long b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long p1 = scanner.nextLong();
        Long q1 = scanner.nextLong();
        Long p2 = scanner.nextLong();
        Long q2 = scanner.nextLong();
        Long p = p1 * q2 + p2 * q1;
        Long q = q1 * q2;
        Long GCD = gcd(p, q);
        System.out.println((p / GCD) + "/" + (q / GCD));
    }
}
