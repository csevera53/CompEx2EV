package tournament.data;

public class MixedTournament extends Tournament
{
    String gameMode;

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public MixedTournament(String name, String associatedGame,
                           double prize,String gameMode) {
        super(name, associatedGame, prize);
        this.gameMode = gameMode;
    }

    @Override
    public String toString() {
        return "- Mixed " + super.toString() + "gameMode " + gameMode;
    }
}
