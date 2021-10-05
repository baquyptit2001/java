import java.util.Scanner;

public class ThuNhapGiaoVien {
    public static class GiaoVien {
        String name, ma;
        int base, heso, salary, bonus;

        public GiaoVien(String ma, String name, int base) {
            if (ma.substring(0, 2).compareTo("HT") == 0) {
                bonus = 2000000;
            } else if (ma.substring(0, 2).compareTo("HP") == 0) {
                bonus = 900000;
            } else {
                bonus = 500000;
            }
            this.ma = ma;
            this.name = name;
            this.base = base;
            this.heso = Integer.parseInt(ma.substring(2));
            this.salary = base * this.heso + bonus;
        }

        public void print(){
            System.out.printf("%s %s %d %d %d", ma, name, heso, bonus, salary);
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.nextLine();
        String name = scanner.nextLine();
        int base = Integer.parseInt(scanner.nextLine());
        GiaoVien gv = new GiaoVien(ma, name, base);
        gv.print();
    }
}
