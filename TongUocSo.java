import java.util.*;

public class TongUocSo {
    public static int[] Snt(int n) {
        boolean[] a = new boolean[n + 1];
        for (int i = 0; i <= n; i++) a[i] = true;
        a[0] = a[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (a[i])
                for (int j = 2 * i; j <= n; j += i)
                    a[j] = false;
        }
        int k = 0;
        for (int i = 2; i < n; i++) {
            if (a[i]) {
                k++;
            }
        }
        int[] ans = new int[k];
        int j = 0;
        for (int i = 2; i < n; i++) {
            if (a[i]) {
                ans[j] = i;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        int[] tmp = Snt(1500);

        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int i = 0, cnt = 0;

            while (n != 1 && tmp[i] * tmp[i] <= n) {
                if (n % tmp[i] == 0) {
                    cnt++;
                    n /= tmp[i];
                } else {
                    if (cnt != 0) res = res + (long) cnt * tmp[i];
                    cnt = 0;
                    i++;
                }
            }
            if (cnt != 0) res = res + (long) cnt * tmp[i];
            if (n != 1) res = res + n;
        }
        System.out.println(res);
        sc.close();
    }
}
