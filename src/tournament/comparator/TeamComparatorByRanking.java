package tournament.comparator;

import tournament.data.Team;


import java.util.Arrays;
import java.util.Comparator;

public class TeamComparatorByRanking implements Comparator<Team>{
    @Override
    public int compare(Team t1, Team t2) {

        return Float.compare(t1.getTotalRanking(), t2.getTotalRanking());
    }
    public static void sortByRanking(Team[] teams) {
        Arrays.sort(teams,new TeamComparatorByRanking());
    }

}
