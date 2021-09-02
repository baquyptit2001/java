import java.util.*;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int u = 1; u <= t; u++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                list.add(x);
            }
            Set<Integer> unique = new LinkedHashSet<>(list);
            System.out.println("Test " + u + ':');
            for (Integer key : unique) {
                System.out.println(key + " xuat hien " + Collections.frequency(list, key) + " lan");
            }
        }
    }
}
