import java.util.Scanner;

public class DoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[110];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (a[i] > a[j]){
                    int tmp = a[i];
                    a[i] =  a[j];
                    a[j] = tmp;
                }
            System.out.print("Buoc "+count+": ");
            for (int j = 0; j < n; j++)
                System.out.print(a[j]+" ");;
            count++;
            System.out.println();
        }
    }
}
