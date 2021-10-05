import java.util.Scanner;

public class CatDoi {
    static String res(String number) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1')
                res.append("1");
            else if (number.charAt(i) == '0' || number.charAt(i) == '9' || number.charAt(i) == '8')
                res.append("0");
            else
                return "INVALID";
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String number = scanner.nextLine();
            number = res(number).replaceAll("^0+", "");
            if(number.equals(""))
                number = "INVALID";
            System.out.println(number);
        }
    }
}
