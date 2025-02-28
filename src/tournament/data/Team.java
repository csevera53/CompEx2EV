package tournament.data;

import tournament.exceptions.*;

public class Team extends Participant {
    private Player [] players;
    private int playersInTeam;
    private static final int MAX_PLAYERS = 5;

    public Team(String name, Player[] players) {
        super(name);

        this.players = new Player[MAX_PLAYERS];
        playersInTeam = 0;

        if (players != null)
        {
            for (Player player : players)
            {
                try{
                    addPlayer(player);
                }catch (FullTeamException e){
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    //Add player to the team
    public void addPlayer(Player p) throws FullTeamException {

        if (playersInTeam >= MAX_PLAYERS)
        {
            throw new FullTeamException("Team is full");
        }

        players[playersInTeam++] = p;
    }

    //Total ranking for the team Comparator
    public float getTotalRanking(){

        float total = 0;

        for(Player player : getPlayers()){
            if(player != null){
                total += player.getRanking();
            }
        }

        total /= players.length;

        System.out.println(name + " average ranking = " + total);
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
