import java.util.*;

public class TapTuRieng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String sentence1 = scanner.nextLine();
            String sentence2 = scanner.nextLine();
            String[] store1;
            String[] store2;
            store1 = sentence1.trim().split("\\s+");
            store2 = sentence2.trim().split("\\s+");
            ArrayList<String> sen1 = new ArrayList<>(Arrays.asList(store1));
            ArrayList<String> sen2 = new ArrayList<>(Arrays.asList(store2));
            Set<String> res = new HashSet<>();
            for (String i:sen1){
                if (! sen2.contains(i)){
                    res.add(i);
                }
            }
            for (String result:res){
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
