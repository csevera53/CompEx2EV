package tournament.data;

import tournament.exceptions.*;

import java.util.Arrays;
import java.util.Comparator;

public class Team extends Participant {
    private Player [] players;
    private int playersInTeam;
    private static final int MAX_PLAYERS = 5;

    public Team(String name, Player[] players) {
        super(name);
        this.players = players;
        playersInTeam = 4;
    }


    public Team() {
        super();
        name = " ";
        players = new Player[5];
    }

    public Player[] getPlayers() {
        return players;
    }
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void addPlayer(Player p) throws FullTeamException {
        if(playersInTeam < MAX_PLAYERS){
            players[playersInTeam] = p;
            playersInTeam++;

        }
        else {
            throw new FullTeamException("Can't add player, the team is full");
        }
    }
    //Total ranking para el team Comparator
    public float getTotalRanking(){
        float total = 0;
        for(Player player : getPlayers()){
            if(player != null){
                total += player.getRanking();
            }
        }
        total /= players.length;
        return total;
    }
    @Override
    public String toString() {

        String result = "";

        for (int i = 0; i < playersInTeam; i++) {
            if(players[i] != null) {
                result += players[i].toString() + "\n";
            }
        }

        return "Team " + name +  " - " + "Members: " + playersInTeam + "/5 - " + result;
    }
}
