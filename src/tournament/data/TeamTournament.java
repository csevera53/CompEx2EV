package tournament.data;

public class TeamTournament extends Tournament {
    int playersPerTeam;

    public TeamTournament(String name, String associatedGame,
                          double prize,int playersPerTeam) {
        super(name, associatedGame, prize);
        this.playersPerTeam = playersPerTeam;
    }
    @Override
    public String toString() {
         return  " Team" + super.toString()  + "playersPerTeam: " + playersPerTeam + "/5";
    }
}
