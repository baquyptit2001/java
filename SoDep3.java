import java.util.Scanner;

public class SoDep3 {
    static boolean[] prime = new boolean[]{false, false, true, true, false, true, false, true, false, false};

    static String checker(String s) {
        int n = (int) (s.length() / 2);
        int full = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(full - 1 - i))
                return "NO";
            if (!prime[Character.getNumericValue(s.charAt(i))]) {
                return "NO";
            }
        }
        if (!prime[Character.getNumericValue(s.charAt(n))]) {
            return "NO";
        }
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
