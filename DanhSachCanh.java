import java.util.Scanner;

public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] store = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                store[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (store[i][j] == 1) {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }
}
