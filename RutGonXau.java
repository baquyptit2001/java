import java.util.Scanner;

public class RutGonXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String tmp = sb.toString();
        while(tmp.length()>0){
            boolean flag = false;
            for (int i = 0; i < tmp.length()-1; i++) {
                if(tmp.charAt(i) == tmp.charAt(i+1)){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    flag = true;
                    break;
                }
            }
            if(!flag)
                break;
            tmp = sb.toString();
        }
        if (sb.length()==0){
            System.out.println("Empty String");
        }else{
            System.out.println(sb);
        }
    }
}
