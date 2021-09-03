import java.util.*;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        while (t-- > 0) {
            String name = scanner.nextLine();
            String[] store = name.trim().split("\\s+");
            int numOfWords = store.length;
            StringBuilder res = new StringBuilder();
            res.append(store[numOfWords - 1].toLowerCase());
            for (int i = 0; i < numOfWords - 1; i++) {
                res.append(Character.toLowerCase(store[i].charAt(0)));
            }
            list.add(res.toString());
            int count = 0;
            for (String i : list) {
                if (i.compareTo(String.valueOf(res)) == 0) {
                    count++;
                }
            }
            char add = (char) (count+'0');
            if (count != 1) {
                res.append(add);
            }
            res.append("@ptit.edu.vn");
            System.out.println(res);
        }
    }
}
