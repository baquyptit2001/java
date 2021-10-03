import java.util.Scanner;

public class DanhSachNhanVien {
    public static class NhanVien {
        String Name, DOB, Gender, MST, Address, HD, MNV;

        public NhanVien(String Name, String DOB, String Gender, String MST, String Address, String HD, int MNV) {
            String tmp = "000";
            if (MNV < 10) {
                tmp = tmp + "0" + MNV;
            } else {
                tmp = tmp + MNV;
            }
            this.Name = Name;
            this.DOB = DOB;
            this.Gender = Gender;
            this.MST = MST;
            this.Address = Address;
            this.HD = HD;
            this.MNV = tmp;
        }

        public void print() {
            System.out.printf("%s %s %s %s %s %s %s", this.MNV, this.Name, this.Gender, this.DOB, this.Address, this.MST, this.HD);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            String Name = scanner.nextLine();
            String Gender = scanner.nextLine();
            String DOB = scanner.nextLine();
            String Address = scanner.nextLine();
            String MST = scanner.nextLine();
            String HD = scanner.nextLine();
            NhanVien nv = new NhanVien(Name, DOB, Gender, MST, Address, HD, i);
            nv.print();
        }
    }
}
