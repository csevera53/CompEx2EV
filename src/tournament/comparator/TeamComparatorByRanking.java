package tournament.comparator;

import tournament.data.Team;

import java.util.Comparator;

public class TeamComparatorByRanking implements Comparator<Team>{
    @Override
    public int compare(Team t1, Team t2) {

        return Float.compare(t2.getTotalRanking(), t1.getTotalRanking());
    }
}
