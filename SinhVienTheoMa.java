import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVienTheoMa {
    public static class SV {
        String Name, Class, Email, MSV;

        public SV(String name, String aClass, String emal, String MSV) {
            Name = name;
            Class = aClass;
            Email = emal;
            this.MSV = MSV;
        }

        public void print() {
            System.out.printf("%s %s %s %s", this.MSV, this.Name, this.Class, this.Email);
            System.out.println();
        }

        public String getMSV() {
            return MSV;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SV> sv = new ArrayList<SV>();
        while (scanner.hasNext()) {
            String msv = scanner.nextLine();
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            sv.add(new SV(ten,lop, email, msv));
        }
        sv.sort(Comparator.comparing(SV::getMSV));
        for (SV i : sv) {
            System.out.println(i.MSV + " " + i.Name + " " + i.Class + " " + i.Email);
        }
    }
}
