import java.util.Scanner;

public class XauDoiXung {
    static String checker(String s) {
        int n = (int) s.length() / 2;
        int full = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(full - 1 - i)) {
                count++;
                if (count > 1) {
                    return "NO";
                }
            }
        }
        if (count == 0 && full % 2 == 0) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String string = scanner.nextLine();
            System.out.println(checker(string));
        }
    }
}
