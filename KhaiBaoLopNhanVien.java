import java.util.Scanner;

public class KhaiBaoLopNhanVien {
    public static class NhanVien {
        String Name, DOB, Gender, MST, Address, HD, MNV;

        public NhanVien(String Name, String DOB, String Gender, String MST, String Address, String HD) {
            this.Name = Name;
            this.DOB = DOB;
            this.Gender = Gender;
            this.MST = MST;
            this.Address = Address;
            this.HD = HD;
            this.MNV = "00001";
        }

        public void print() {
            System.out.printf("%s %s %s %s %s %s %s", this.MNV, this.Name, this.Gender, this.DOB, this.Address, this.MST, this.HD);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        String Gender = scanner.nextLine();
        String DOB = scanner.nextLine();
        String Address = scanner.nextLine();
        String MST = scanner.nextLine();
        String HD = scanner.nextLine();
        NhanVien nv = new NhanVien(Name, DOB, Gender, MST, Address, HD);
        nv.print();
    }
}
