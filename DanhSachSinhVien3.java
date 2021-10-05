import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachSinhVien3 {
    public static class SV {
        String Name, Class, DOB, MSV;
        float GPA;

        private String name(String string) {
            StringBuilder res = new StringBuilder();
            String[] store = string.trim().split("\\s+");
            for (String i : store) {
                i = i.toLowerCase();
                res.append(Character.toUpperCase(i.charAt(0)));
                res.append(i.substring(1));
                res.append(" ");
            }
            return res.toString();
        }

        public SV(String Name, String Class, String DOB, float GPA, int MSV) {
            StringBuilder tmp = new StringBuilder("B20DCCN");
            if (MSV < 10) {
                tmp.append("00").append(MSV);
            } else {
                tmp.append("0").append(MSV);
            }
            String[] tmpBOD = DOB.split("/");
            if (tmpBOD[0].length() < 2) {
                tmpBOD[0] = "0" + tmpBOD[0];
            }
            if (tmpBOD[1].length() < 2) {
                tmpBOD[1] = "0" + tmpBOD[1];
            }
            this.MSV = tmp.toString();
            this.Name = this.name(Name);
            this.Class = Class;
            this.DOB = tmpBOD[0] + "/" + tmpBOD[1] + "/" + tmpBOD[2];
            this.GPA = GPA;
        }

        public float getGPA() {
            return this.GPA;
        }

        public void print() {
            System.out.printf("%s %s %s %s %.2f", this.MSV, this.Name, this.Class, this.DOB, this.GPA);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<SV> sv = new ArrayList<SV>();
        for (int i = 1; i <= t; i++) {
            String Name = scanner.nextLine();
            String Class = scanner.nextLine();
            String DOB = scanner.nextLine();
            float GPA = Float.parseFloat(scanner.nextLine());
            sv.add(new SV(Name, Class, DOB, GPA, i));
        }
        sv.sort(Comparator.comparing(SV::getGPA).reversed());
        for (SV s : sv) {
            s.print();
        }
    }
}
