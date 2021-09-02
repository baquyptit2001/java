import java.util.Scanner;

public class DiemCanBang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] store = new int[n + 2];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                store[i] = scanner.nextInt();
                sum += store[i];
            }
            if (n < 3) {
                System.out.println(-1);
                continue;
            }
            int tmp = 0, index = -1;
            for (int i = 0; i < n - 2; i++) {
                tmp += store[i];
                if (tmp == (sum - store[i + 1]) / 2) {
                    index = i + 2;
                    break;
                }
            }
            System.out.println(index);
        }
    }
}

