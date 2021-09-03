import java.util.Scanner;

public class ChuanHoaTen1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String name = scanner.nextLine();
            String[] store = name.trim().split("\\s+");
            for (String i : store) {
                i = i.toLowerCase();
                char first = i.charAt(0);
                first = Character.toUpperCase(first);
                System.out.print(first + i.substring(1) + ' ');
            }
            System.out.println();
        }
    }
}
