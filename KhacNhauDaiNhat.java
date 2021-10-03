import java.util.Scanner;

public class KhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            int l1 = s1.length(), l2 = s2.length();
            if(s1.compareTo(s2)==0){
                System.out.println("-1");
            }else{
                System.out.println(Math.max(l1, l2));
            }
        }
    }
}
