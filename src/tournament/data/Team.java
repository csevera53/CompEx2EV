package tournament.data;

import tournament.exceptions.FullTeamException;
import java.util.Scanner;

public class Team extends Participant {
    Player [] players;
    int playersInTeam;

    public Team(String name, Player[] players) {
        super(name);
        players = new Player[4];
        playersInTeam = 0;
    }

    public Team() {
        super();
        name = " ";
        players = new Player[4];
    }
    public Player[] getPlayers()
    {
        return players;
    }
    public void setP(Player[] players)
    {
        this.players = players;
    }

    public void addPlayer(Player p) throws FullTeamException
    {
        Scanner sc = new Scanner(System.in);

        if (playersInTeam > 5) {

            throw new FullTeamException("The team is full");
        }
        else {
            for (int i = 0; i < players.length; i++) {

                System.out.println("Enter player " + (i + 1));

                System.out.println("Enter the name :");
                String name = sc.nextLine();

                System.out.println("Enter the level :");
                int level = sc.nextInt();

                System.out.println("Enter the ranking :");
                float ranking = sc.nextFloat();

                players[i] = new Player(name, level, ranking);
            }
        }
    }

    //Total ranking para el team Comparator
    public float getTotalRanking(){
        float total = 0;
        for(Player player : getPlayers()){
            total += player.getRanking();
        }
        return total;
    }

    @Override
    public String toString() {

        String result = "Team " + name +  " - " + "Members: " + playersInTeam + "/5 - ";

        for (int i = 0; i < playersInTeam; i++)
        {
            result += "-" + players[i].toString() + "\n";
        }

        return result;
    }
}
