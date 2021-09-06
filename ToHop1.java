import java.util.ArrayList;
import java.util.Scanner;

public class ToHop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            start.add(i + 1);
            end.add(n - k + 1 + i);
        }
        int dem = 1;
        for (Integer i : start) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (!start.equals(end)) {
            for (int i = k - 1; i >= 0; i--) {
                if (start.get(i) < end.get(i)) {
                    start.set(i, start.get(i) + 1);
                    for (int j = i + 1; j < k; j++) {
                        start.set(j, start.get(i) + (j - i));
                    }
                    break;
                }
            }
            for (Integer el : start) {
                System.out.print(el + " ");
            }
            System.out.println();
            dem++;
        }
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
