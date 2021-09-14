import java.util.Scanner;

public class KhaiBaoLopSinhVien {
    public static class SV {
        String Name, Class, DOB, MSV;
        float GPA;

        public SV(String Name, String Class, String DOB, float GPA) {
            String[] tmpBOD = DOB.split("/");
            if(tmpBOD[0].length()<2){
                tmpBOD[0] = "0"+tmpBOD[0];
            }
            if(tmpBOD[1].length()<2){
                tmpBOD[1] = "0"+tmpBOD[1];
            }
            this.MSV = "B20DCCN001";
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
        String Name = scanner.nextLine();
        String Class = scanner.nextLine();
        String DOB = scanner.nextLine();
        float GPA = Float.parseFloat(scanner.nextLine());
        SV sv = new SV(Name, Class, DOB, GPA);
        sv.print();
    }
}
