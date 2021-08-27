import java.util.Scanner;

public class MangDoiXung {

    static String checker(int[] a, int le) {
        for (int i = 0; i < le / 2; i++) {
            if (a[i] != a[le - i - 1])
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n + 2];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(checker(a, n));
        }
    }
}
