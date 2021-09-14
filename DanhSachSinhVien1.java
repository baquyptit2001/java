import java.util.Scanner;

public class DanhSachSinhVien1 {
    public static class SV {
        String Name, Class, DOB, MSV;
        float GPA;

        public SV(String Name, String Class, String DOB, float GPA, int MSV) {
            StringBuilder tmp = new StringBuilder("B20DCCN");
            if (MSV < 10) {
                tmp.append("00").append(MSV);
            } else {
                tmp.append("0").append(MSV);
            }
            String[] tmpBOD = DOB.split("/");
            if(tmpBOD[0].length()<2){
                tmpBOD[0] = "0"+tmpBOD[0];
            }
            if(tmpBOD[1].length()<2){
                tmpBOD[1] = "0"+tmpBOD[1];
            }
            this.MSV = tmp.toString();
            this.Name = Name;
            this.Class = Class;
            this.DOB = tmpBOD[0]+"/"+tmpBOD[1]+"/"+tmpBOD[2];
            this.GPA = GPA;
        }

        public void print() {
            System.out.printf("%s %s %s %s %.2f", this.MSV, this.Name, this.Class, this.DOB, this.GPA);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= t; i++) {
            String Name = scanner.nextLine();
            String Class = scanner.nextLine();
            String DOB = scanner.nextLine();
            float GPA = Float.parseFloat(scanner.nextLine());
            SV sv = new SV(Name, Class, DOB, GPA, i);
            sv.print();
        }
    }
}
