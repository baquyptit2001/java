import java.math.BigInteger;
import java.util.Scanner;

public class UocChungSoNguyenLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger n1 = new BigInteger(scanner.next());
            BigInteger n2 = new BigInteger(scanner.next());
            System.out.println(n1.gcd(n2));
        }
    }
}
