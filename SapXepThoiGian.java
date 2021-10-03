import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SapXepThoiGian {
    public static class Time {
        int h, m, s, sum;

        public Time(int h, int m, int s) {
            this.h = h;
            this.m = m;
            this.s = s;
            this.sum = h * 3600 + m * 60 + s;
        }

        public int getSum() {
            return this.sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Time> store = new ArrayList<Time>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            store.add(new Time(h, m, s));
        }
        store.sort(Comparator.comparing(Time::getSum));
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", store.get(i).h, store.get(i).m, store.get(i).s);
        }
    }
}
