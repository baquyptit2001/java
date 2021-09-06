import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] store = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                store[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (store[i][j] == 1) {
                    tmp.add(j + 1);
                }
            }
            System.out.print("List(" + (i + 1) + ") =");
            for (Integer k : tmp) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
