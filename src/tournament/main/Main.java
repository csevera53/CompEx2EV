package tournament.main;

import tournament.data.Player;
import tournament.data.Team;
import tournament.exceptions.FullTeamException;

public class Main
{
    public static void main(String[] args) throws FullTeamException
    {
        Player p = new Player();
        Team t = new Team();

        try
        {
            t.addPlayer(p);
        }
        catch (FullTeamException f)
        {
            throw new FullTeamException("The team is full !");
        }
    }
}
