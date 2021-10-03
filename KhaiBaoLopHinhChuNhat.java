import java.util.Scanner;

public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        String color = scanner.next();
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            color = color.toLowerCase();
            color = color.toUpperCase().charAt(0) + color.substring(1);
            System.out.printf("%d %d %s", (width + height) * 2, width * height, color);
        }
    }
}
