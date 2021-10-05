import java.util.*;

public class SinhVienTheoKhoa {
    public static class SV {
        String Name, Lop, Email, MSV;

        public SV(String MSV, String name, String aClass, String emal) {
            Name = name;
            Lop = aClass;
            Email = emal;
            this.MSV = MSV;
        }

        public String getLop(){
            return Lop;
        }

        public void print() {
            System.out.printf("%s %s %s %s", this.MSV, this.Name, this.Lop, this.Email);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SV> sv = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            String msv = scanner.nextLine();
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            sv.add(new SV(msv,ten, lop, email));
        }
        t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String Year = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+Year+":");
            for (SV i : sv) {
                if(Objects.equals(i.getLop().substring(1, 3), Year.substring(2))){
                    i.print();
                }
            }
        }
    }
}
