import java.util.Scanner;

public class PhanSo {

    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long tuSo = scanner.nextLong();
        long mauSo = scanner.nextLong();
        while (true){
            long tmp = gcd(tuSo, mauSo);
            if (tmp == 1){
                break;
            }
            else {
                tuSo /= tmp;
                mauSo /= tmp;
            }
        }
        System.out.println(tuSo +"/"+ mauSo);
    }
}