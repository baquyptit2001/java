import java.util.Scanner;

public class PhanTichNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();
            System.out.print("Test " + (i + 1) + ": ");
            for (int j = 2; j <= num; j++) {
                int count = 0;
                while (num % j == 0) {
                    num /= j;
                    count++;
                }
                if(count!=0){
                    System.out.printf("%d(%d) ", j, count);
                }
            }
            System.out.println();
        }
    }
}
