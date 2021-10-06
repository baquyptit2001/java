import java.util.Scanner;

public class SoTamPhan {
    public static String isTamPhan(int number) {
        while (number > 0) {
            if (number % 10 != 0 && number % 10 != 1 && number % 10 != 2) {
                return "NO";
            }
            number = (int) (number / 10);
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(isTamPhan(n));
        }
    }
}
