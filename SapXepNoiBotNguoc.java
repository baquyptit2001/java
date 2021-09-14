import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepNoiBotNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int dem = 1;
            List<StringBuilder> res = new ArrayList<StringBuilder>();
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
                    StringBuilder tmp = new StringBuilder("Buoc "+dem+": ");
                    dem++;
                    for (int j = 0; j < n; j++)
                        tmp.append(a[j]).append(" ");
                    res.add(tmp);
                }
            }
            Collections.reverse(res);
            for(StringBuilder i: res)
                System.out.println(i);
        }
    }
}
