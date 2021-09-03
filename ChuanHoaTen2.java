import java.util.Scanner;

public class ChuanHoaTen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String name = scanner.nextLine();
            String[] store = name.trim().split("\\s+");
            int numOfWords = store.length;
            for (int i = 1; i < numOfWords; i++) {
                String delim = " ";
                if(i==numOfWords-1){
                    delim = ", ";
                }
                store[i] = store[i].toLowerCase();
                char first = store[i].charAt(0);
                first = Character.toUpperCase(first);
                System.out.print(first + store[i].substring(1) + delim);
            }
            System.out.println(store[0].toUpperCase());
        }
    }
}
