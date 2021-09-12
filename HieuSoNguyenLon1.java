import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon1 {
    static String pop(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger n1 = new BigInteger(scanner.next());
            BigInteger n2 = new BigInteger(scanner.next());
            int l1 = n1.toString().length();
            int l2 = n2.toString().length();
            int compare = l1;
            if (compare < l2) {
                compare = l2;
            }
            BigInteger res = n1.subtract(n2);
            String result = res.toString();
            if(result.charAt(0) == '-'){
                result = pop(result);
            }
            for (int i = 0; i < compare - result.length(); i++) {
                System.out.print(0);
            }
            System.out.println(result);
        }
    }
}
