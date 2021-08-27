import java.lang.Math;
import java.util.Scanner;

public class SoNguyenTo {

    static String checker(int num) {
        if (num < 2)
            return "NO";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int num = scanner.nextInt();
            System.out.println(checker(num));
        }
    }
}
