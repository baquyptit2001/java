import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int dem = 1;
        for (int i = 0; i < n - 1; i++) {
            boolean doi = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    doi = true;
                }
            }
            if (doi) {
                System.out.print("Buoc " + dem + ": ");
                dem++;
                for (int j = 0; j < n; j++)
                    System.out.print(a[j] + " ");
                System.out.println();
            }
        }
    }
}
