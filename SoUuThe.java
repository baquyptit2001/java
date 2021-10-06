import java.util.Scanner;

public class SoUuThe {
    public static String uuThe(String s) {
        int noOdd = 0, noEven = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return "INVALID";
            }
            if (Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 1) {
                noOdd++;
            } else {
                noEven++;
            }
        }
        if (noEven != noOdd) {
            int l = s.length();
            if (((l % 2 == 0) && noEven > noOdd) || (l % 2 == 1) && noEven < noOdd) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String str = scanner.nextLine();
            System.out.println(uuThe(str));
        }
    }
}
