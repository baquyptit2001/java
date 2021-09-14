import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepChenNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        List<Integer> b = new ArrayList<>();
        List<StringBuilder> store = new ArrayList<>();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            b.add(a[i]);
            dem++;
            Collections.sort(b);
            StringBuilder tmp = new StringBuilder("Buoc " + i + ": ");
            for (int j = 0; j < dem; j++) {
                tmp.append(b.get(j)).append(" ");
            }
            store.add(tmp);
        }
        Collections.reverse(store);
        for(StringBuilder i : store)
            System.out.println(i);
    }
}
