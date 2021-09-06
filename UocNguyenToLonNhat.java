import java.util.Scanner;

public class UocNguyenToLonNhat {
    static long maxPrimeFactors(long n) {
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n >>= 1;
        }
        while (n % 3 == 0) {
            maxPrime = 3;
            n = n / 3;
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                maxPrime = i + 2;
                n = n / (i + 2);
            }
        }
        if (n > 4)
            maxPrime = n;
        return maxPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(maxPrimeFactors(n));
        }
    }
}
