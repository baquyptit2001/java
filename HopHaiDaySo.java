import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class HopHaiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        SortedSet<Integer> set = new TreeSet<>();
        for (int i=0;i<a;i++){
            set.add(scanner.nextInt());
        }
        for (int i=0;i<b;i++){
            set.add(scanner.nextInt());
        }
        for(Integer i:set)
            System.out.printf("%d ", i);
    }
}
