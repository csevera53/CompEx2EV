package tournament.data;

import tournament.comparator.PlayerComparatorByRanking;

import java.util.Arrays;

public class Player extends Participant
{
    protected int level;
    protected float ranking;

    public Player(String name, int level, float ranking)
    {
        super(name);
        this.level = level;
        this.ranking = ranking;
    }

    public Player()
    {
        super();
        name = " ";
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public float getRanking()
    {
        return ranking;
    }

    public void setRanking(float ranking)
    {
        this.ranking = ranking;
    }

    public static void OrderedPlayerInformationByRankigAndName(Player [] players)
    {
        Arrays.sort(players, new PlayerComparatorByRanking());
        for (Player p : players)
        {
            System.out.println(p.toString());
        }
    }
    @Override
    public String toString() {
        return "Player:" + getName() + " - " + "Level: " + level + " - " + "Ranking: " + ranking;
    }
}
