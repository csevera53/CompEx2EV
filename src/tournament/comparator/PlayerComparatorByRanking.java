package tournament.comparator;

import tournament.data.Player;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerComparatorByRanking implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2){
        return Float.compare(p2.getRanking(), p1.getRanking());
    }
    public static void sortByRanking(Player[] players) {
        Arrays.sort(players,new PlayerComparatorByRanking());
    }
}
