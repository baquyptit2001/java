import java.util.Scanner;

public class Fibonacci {

    static long[] fibo = new long[96];

    static void init() {
        fibo[0] = 0L;
        fibo[1] = 1L;
        for (int i = 2; i < 93; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
