import java.util.Scanner;

public class SoDep1 {
    static String checker(String n) {
        for (int i = 0; i < n.length() / 2; i++) {
            if ((int) n.charAt(i) % 2 != 0) {
                return "NO";
            }
            if (n.charAt(i) != n.charAt(n.length() - 1 - i)) {
                return "NO";
            }
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
