import java.util.Scanner;

public class ChiaHet11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String number = scanner.nextLine();
            int sum_odd = 0, sum_even = 0;
            for (int i = 0; i < number.length(); i += 2) {
                sum_even += Character.getNumericValue(number.charAt(i));
            }
            for (int i = 1; i < number.length(); i += 2) {
                sum_odd += Character.getNumericValue(number.charAt(i));
            }
            if (Math.abs(sum_even - sum_odd) % 11 == 0){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
