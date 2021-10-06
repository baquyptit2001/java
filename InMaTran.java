import java.util.Scanner;

public class InMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] store = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    store[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i%2==1){
                        System.out.print(store[i][n-1-j]+" ");
                    }else{
                        System.out.print(store[i][j]+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
