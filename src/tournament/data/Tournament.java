package tournament.data;

public abstract class Tournament
{
    protected String name;
    protected String associatedGame;
    protected double prize;

    public Tournament(String name, String associatedGame, double prize) {
        this.name = name;
        this.associatedGame = associatedGame;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public String getAssociatedGame() {
        return associatedGame;
    }

    public double getPrize() {
        return prize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssociatedGame(String associatedGame) {
        this.associatedGame = associatedGame;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Tournament -" + name + " (" + associatedGame + ") "  + "- Prize " + prize + "€";
    }
}
