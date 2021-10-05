import java.util.*;

public class TinhGio {
    public static class Player {
        String code;
        String name;
        int time;

        public Player(String code, String name, String timein, String timeout) {
            this.code = code;
            this.name = name;
            this.time = Integer.parseInt(timeout.split(":")[0]) * 60 + Integer.parseInt(timeout.split(":")[1]);
            this.time -= (Integer.parseInt(timein.split(":")[0]) * 60 + Integer.parseInt(timein.split(":")[1]));
        }

        public int getTime() {
            return time;
        }

        public void print(){
            System.out.printf("%s %s %d gio %d phut", code, name, (int)(time/60), time%60);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<Player> players = new ArrayList<Player>();
        while (t-- > 0) {
            players.add(new Player(
                    scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()
            ));
        }
        players.sort(Comparator.comparing(Player::getTime).reversed());
        for(Player i : players)
            i.print();
    }
}
