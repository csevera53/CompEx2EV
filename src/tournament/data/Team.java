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

    //Total ranking para el team Comparator
    public float getTotalRanking(){
        float total = 0;
        for(Player player : getPlayers()){
            total += player.getRanking();
        }
        total /= players.length;
        return total;
    }

    public Player[] getPlayers() {
        return players;
    }
    public void setP(Player[] players) {
        this.players = players;
    }

    public void addPlayer(Player p) throws FullTeamException {

        Scanner sc = new Scanner(System.in);

        if(playersInTeam > 5)
        {
            throw new FullTeamException("Can't add player, it's full");
        }
        else {
            System.out.println("Enter the name :");
            String name = sc.next();

            System.out.println("Enter the level :");
            int level = sc.nextInt();

            System.out.println("Enter the ranking :");
            float ranking = sc.nextFloat();

            p = new Player(name,level,ranking);

            System.out.println("Enter the name of the player's team : ");
            String team = sc.next();

            if(team.equals(getName()))
            {
                players[playersInTeam] = p;
                playersInTeam++;
                System.out.println("Player added correctly to the team");
            }
            else {
                System.out.println("Incorrect team name");
            }
        }
    }

    @Override
    public String toString() {

        String result = "";

        for (int i = 0; i < playersInTeam; i++) {
            result += players[i].toString() + "\n";
        }

        return "Team " + name +  " - " + "Members: " + playersInTeam + "/5 - " + result;
    }
}
