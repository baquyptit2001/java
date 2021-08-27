import java.util.*;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a <= 0 || b<=0){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(((a + b) * 2) + " " + (a * b));
    }
}
