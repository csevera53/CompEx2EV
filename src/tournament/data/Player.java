package tournament.data;

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

    @Override
    public String toString() {
        return "Player:" + name + " - " + "Level: " + level + " - " + "Ranking: " + ranking;
    }
}
