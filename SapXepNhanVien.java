import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SapXepNhanVien {
    public static class NhanVien {
        String Name, DOB, Gender, MST, Address, HD;
        String[] dob = new String[3];
        int ngay, thang, nam, MNV;

        public NhanVien(String Name, String DOB, String Gender, String MST, String Address, String HD, int MNV) {
            this.Name = Name;
            this.DOB = DOB;
            this.Gender = Gender;
            this.MST = MST;
            this.Address = Address;
            this.HD = HD;
            this.MNV = MNV;
            dob = DOB.split("/");
            ngay = Integer.parseInt(dob[0]);
            thang = Integer.parseInt(dob[1]);
            nam = Integer.parseInt(dob[2]);
        }

        public int getNgay() {
            return ngay;
        }

        public int getThang() {
            return thang;
        }

        public int getNam() {
            return nam;
        }

        public void print() {
            System.out.printf("%05d %s %s %s %s %s %s", this.MNV, this.Name, this.Gender, this.DOB, this.Address, this.MST, this.HD);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<NhanVien> nv = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String Name = scanner.nextLine();
            String Gender = scanner.nextLine();
            String DOB = scanner.nextLine();
            String Address = scanner.nextLine();
            String MST = scanner.nextLine();
            String HD = scanner.nextLine();
            nv.add(new NhanVien(Name, DOB, Gender, MST, Address, HD, i));
        }
        nv.sort(Comparator.comparing(NhanVien::getNam).thenComparing(NhanVien::getThang).thenComparing(NhanVien::getNgay));
        for(NhanVien i:nv){
            i.print();
        }
    }
}
