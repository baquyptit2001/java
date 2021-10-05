import java.util.*;

public class GiaoHaiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        for (int i = 0; i < a; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < b; i++) {
            B[i] = scanner.nextInt();
        }
        int i = 0, j = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Set<Integer> store = new LinkedHashSet<>();
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                i++;
                continue;
            } else if (A[i] > B[j]) {
                j++;
                continue;
            }
            if (A[i] == B[j]) {
                store.add(A[i]);
                i++;
                j++;
            }
        }
        for(Integer k:store){
            System.out.printf("%d ", k);
        }
    }
}
