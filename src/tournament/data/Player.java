package tournament.data;

public class Player extends Participant {
    protected int level;
    protected float ranking;

    public Player(String name, int level, float ranking) {
        super(name);
        this.level = level;
        this.ranking = ranking;
    }

    public float getRanking()
    {
        return ranking;
    }

    @Override
    public String toString() {
        return "Player:" + name + " - " + "Level: " + level + " - " + "Ranking: " + ranking;
    }
}
