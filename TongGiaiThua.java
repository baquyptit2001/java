import java.math.BigInteger;
import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        long base = 1;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= t; i++) {
            base *= i;
            sum+=base;
        }
        System.out.println(sum);
    }
}
