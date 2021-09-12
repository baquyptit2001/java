import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n1 = new BigInteger(scanner.next());
        BigInteger n2 = new BigInteger(scanner.next());
        BigInteger res = n1.subtract(n2);
        System.out.println(res);
    }
}
