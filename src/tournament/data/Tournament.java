package tournament.data;

public abstract class Tournament {
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

    @Override
    public String toString() {
        return "Tournament - " + name + " (" + associatedGame + ") "  + " - Prize " + prize + "€";
    }
}
