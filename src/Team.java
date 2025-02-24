import java.util.Arrays;

public class Team extends Participant
{
    Player [] players;
    int playersInTeam = 0;

    public Team(String name, Player[] player)
    {
        super(name);
        this.players = new Player[4];
    }

    public Player[] getPlayers()
    {
        return players;
    }

    public void setP(Player[] players)
    {
        this.players = players;
    }

    public void AddPlayer(Player p) throws FullTeamException
    {
        if (playersInTeam > 5)
        {
            System.out.println("Team full");
        }

        else
        {
            players[playersInTeam] = p;
            playersInTeam++;
        }
    }
    @Override
    public String toString() {
        return "Team" + name +  " - " + "Members: " + playersInTeam + " - " + "Player: " + name +
                " - " + "Level: " + level + " - " + "Ranking: " + ranking;
    }
}
