import java.util.*;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        List<Integer> b = new ArrayList<>();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            b.add(a[i]);
            dem++;
            Collections.sort(b);
            System.out.print("Buoc " + i + ": ");
            for (int j = 0; j < dem; j++) {
                System.out.print(b.get(j) + " ");
            }
            System.out.println();
        }
    }
}
