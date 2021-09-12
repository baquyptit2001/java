import java.math.BigInteger;
import java.util.Scanner;

public class TongSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n1 = new BigInteger(scanner.next());
        BigInteger n2 = new BigInteger(scanner.next());
        System.out.println(n1.add(n2));
    }
}
