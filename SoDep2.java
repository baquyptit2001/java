import java.util.Scanner;

public class SoDep2 {
    static String checker(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < (int) (n / 2); i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return "NO";
            }
            sum += Character.getNumericValue(s.charAt(i));
        }
        if (s.charAt(0) != '8')
            return "NO";
        sum *= 2;
        if (n % 2 == 1)
            sum += Character.getNumericValue(s.charAt((int)n/2));
        if (sum % 10 != 0)
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String number = scanner.nextLine();
            System.out.println(checker(number));
        }
    }
}
