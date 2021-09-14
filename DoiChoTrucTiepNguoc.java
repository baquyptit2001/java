import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DoiChoTrucTiepNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            List<StringBuilder> res = new ArrayList<StringBuilder>();
            int[] a = new int[110];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int count = 1;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++)
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                StringBuilder temp = new StringBuilder("Buoc " + count + ": ");
                for (int j = 0; j < n; j++)
                    temp.append(a[j]).append(" ");
                count++;
                res.add(temp);
            }
            Collections.reverse(res);
            for(StringBuilder i: res)
                System.out.println(i);
        }
    }
}
