import java.util.Scanner;

public class KhaiBaoLopThiSinh {
    public static class ThiSinh {
        String Name, DOB;
        float GPA;

        public ThiSinh(String Name, String DOB, float diem1, float diem2, float diem3) {
            this.Name = Name;
            this.DOB = DOB;
            this.GPA = diem1 + diem2 + diem3;
        }

        public void print() {
            System.out.printf("%s %s %.1f", this.Name, this.DOB, this.GPA);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        String DOB = scanner.nextLine();
        float diem1 = Float.parseFloat(scanner.nextLine());
        float diem2 = Float.parseFloat(scanner.nextLine());
        float diem3 = Float.parseFloat(scanner.nextLine());
        ThiSinh sv = new ThiSinh(Name, DOB, diem1, diem2, diem3);
        sv.print();
    }
}
