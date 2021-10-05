import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BangDiemHocSinh {
    public static class HocSinh {
        String name, level;
        double diem;
        int ma;

        public HocSinh(int ma, String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            this.name = name;
            this.ma = ma;
            this.diem = (d1*2 + d2*2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) / 12.0;
            this.diem = Math.round(this.diem * 10.0) / 10.0;
            if (this.diem >= 9.0) {
                level = "XUAT SAC";
            } else if (diem >= 8 && diem <= 8.9) {
                level = "GIOI";
            } else if (diem >= 7 && diem <= 7.9) {
                level = "KHA";
            } else if (diem >= 5 && diem <= 6.9) {
                level = "TB";
            } else {
                level = "YEU";
            }
        }

        public double getDiem() {
            return diem;
        }

        public void print() {
            System.out.printf("HS%02d %s %.1f %s", ma, name, diem, level);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HocSinh> hs = new ArrayList<HocSinh>();
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            scanner.nextLine();
            hs.add(new HocSinh(
                    i,
                    scanner.nextLine(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble(),
                    scanner.nextDouble()
            ));
        }
        hs.sort(Comparator.comparing(HocSinh::getDiem).reversed());
        for (HocSinh i : hs)
            i.print();
    }
}
