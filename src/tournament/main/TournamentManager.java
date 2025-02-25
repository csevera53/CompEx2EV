package tournament.main;
import tournament.comparator.PlayerComparatorByRanking;
//import tournament.comparator.TeamComparatorByRanking;
import tournament.data.*;
import tournament.comparator.TournamentComparatorByName;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class TournamentManager {

    Player[] players;
    Team[] teams;
    Tournament[] tournaments;
    Match[] matches;

    public TournamentManager() {
        initialize();
    }
    public void initialize(){
         players = new Player[]{

            new Player("Sheila Rodríguez", 87, 1400.90f),
            new Player("Inés Pérez", 89, 1350.70f),
            new Player("Carlos Severá", 88, 3304.70f),
            new Player("Mari Chelo", 90, 3905.65f),
            new Player("Nacho Cabanes", 99, 3000f),
            new Player("José Manuel Fuster", 94, 2050f),
            new Player("Virginia Checa", 98, 3207.95f),
            new Player("Roberto Carvalho", 94, 4100.80f),
            new Player("Carmela Souza", 94, 1560f),
            new Player("Giovanna Dos Santos", 100, 1875.50f),
            new Player("Yoshida Ramen", 89, 1900f),
            new Player("Kawasaki Reguetunin", 97, 2390.25f),
            new Player("Aleksandr Petrov", 97, 4500.50f),
            new Player("Hiroshi Tanaka", 99, 4800.70f),
            new Player("Santiago Fernández", 95, 4272.25f),
            new Player("Elena Dimitrova", 97, 4900f),
            new Player("Jonathan O'Connor", 96, 4650.40f),
            new Player("Fatima Al-Mansouri", 100, 4750.70f),
            new Player("Kwame Mensah", 90, 4300.50f),
            new Player("Isabella Conti", 94, 4425.30f)
        };

        teams = new Team[]{
                new Team("G2", new Player[]{players[0], players[1], players[2], players[3]}),
                new Team("Heretics", new Player[]{players[4], players[5], players[6], players[7]}),
                new Team("T1", new Player[]{players[8], players[9], players[10], players[11]}),
                new Team("Koi", new Player[]{players[12], players[13], players[14], players[15]}),
        };

        tournaments = new Tournament[3];
        tournaments[0] = new MixedTournament("Stardew RAW", "Stardew Valley",
                10000,"1V1");
        tournaments[1] = new IndividualTournament("Rocket Premier",
                "Rocket League",15000);
        tournaments[2] = new TeamTournament("Rocketfeller","Rocket",
                12050,4);

        matches = new Match[12];

        matches[0] = new Match(tournaments[0],players[16],players[17]);
        matches[1] = new Match(tournaments[0],players[18],players[19]);
        matches[2] = new Match(tournaments[0],players[16],players[19]);
        matches[3] = new Match(tournaments[0],players[18],players[17]);
        matches[4] = new Match(tournaments[1],players[0],players[8]);
        matches[5] = new Match(tournaments[1],players[15],players[12]);
        matches[6] = new Match(tournaments[1],players[4],players[10]);
        matches[7] = new Match(tournaments[1],players[11],players[13]);
        matches[8] = new Match(tournaments[2],teams[0],teams[1]);
        matches[9] = new Match(tournaments[2],teams[2],teams[3]);
        matches[10] = new Match(tournaments[2],teams[2],teams[1]);
        matches[11] = new Match(tournaments[2],teams[0],players[2]);
    }
    public Player findPlayer(String username){
        /*Player foundPlayer = null;
        for(Player p : players){
            if(players.equals(username)){
                foundPlayer = new Player(p.getName(),p.getLevel(),p.getRanking());
            }
        }
        return foundPlayer;*/

        //OTRA FORMA
        Player foundPlayer = null;

        for (Player p : players)
        {
            if (p.getName().equals(username))
            {
                return p;
            }
        }

        return foundPlayer;
    }
    //No funciona :)
    public Team findTeam(String teamName)
    {
       /* Team foundTeam = null;
        for(Team t : teams){
            if(teams.equals(teamName)){
                foundTeam = new Team(t.getName(),t.getPlayers());
            }
        }
        return foundTeam;*/

        //OTRA FORMA
        Team foundTeam = null;

        for (Team t : teams)
        {
            if (t.getName().equals(teamName))
            {
                return t;
            }
        }
        return foundTeam;
    }
    public void showTournaments(){
        for(Tournament t : tournaments){
            System.out.println(t);
        }
    }
    public void showPlayerRanking(){
        PlayerComparatorByRanking Pc = new PlayerComparatorByRanking();
        Pc.sortByRanking(players);
        for(Player player : players){
            System.out.println(player);
        }
    }

    /*public void showTeamRanking(){
        TeamComparatorByRanking Tc = new TeamComparatorByRanking();

        Tc.sortByRanking(teams);
        for(Team t:teams){
            System.out.println(t);
        }
    }*/
}
