import java.util.Scanner;

public class SapXepChon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[110];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 1;
        for(int i=0;i<n-1;i++){
            int  min=a[i], k=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<min){
                    min=a[j];
                    k=j;
                }
            }
            int tmp = a[i];
            a[i] =  a[k];
            a[k] = tmp;
            System.out.print("Buoc "+count+": ");
            for(int j=0;j<n;j++)
                System.out.print(a[j]+" ");
            count++;
            System.out.println();
        }
    }
}
