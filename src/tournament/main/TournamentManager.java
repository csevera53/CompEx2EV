package tournament.main;

import tournament.data.*;
import tournament.comparator.*;

import java.util.*;

public class TournamentManager {

    private Player[] players;
    private Team[] teams;
    private Tournament[] tournaments;
    private Match[] matches;

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
        matches[11] = new Match(tournaments[2],teams[0],teams[2]);
    }
    public Player[] getPlayers(){
        return players;
    }
    public Team[] getTeams(){
        return teams;
    }
    public Tournament[] getTournaments(){
        return tournaments;
    }

    public Player findPlayer(String username){
        boolean found = false;
        String normalizedName = username.trim().toLowerCase();

        for (Player player : players)
        {
            if (player.getName().toLowerCase().contains(normalizedName))
            {
                System.out.println(player);
                found = true;
            }
        }
        return null;
    }

    public Team findTeam(String teamName) {

        Team foundTeam = null;

        for (Team t : teams)
        {
            if (t.getName().equals(teamName))
            {
                System.out.println("Team's name found");
                System.out.println(t);
                return t;
            }

            else {
                System.out.println("Team's name not found");
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
        Arrays.sort(players,new PlayerComparatorByRanking());
        for(Player player : players){
            System.out.println(player);
        }
    }

    public void showTeamRanking(){
        Arrays.sort(teams,new TeamComparatorByRanking());
        for(Team t:teams){
            System.out.println(t);
        }
    }

    public void OrderedPlayerInformationByRankigAndName()
    {
        Arrays.sort(players, new PlayerComparatorByRanking());
        for (Player p : players)
        {
            System.out.println(p.toString());
        }
    }

    public void MatchedOrderedByTournamentName()
    {
        Arrays.sort(matches, new Comparator<Match>() {
            @Override
            public int compare(Match m1, Match m2) {
                return m1.getAt().getName().compareTo(m2.getAt().getName());
            }
        });

        System.out.println("Matched ordered");

        for (int i = 0; i < matches.length; i++)
        {
            System.out.println(matches[i].toString());
        }
    }
    public void OrderTournamentsByName(){
        Arrays.sort(tournaments, new TournamentComparatorByName());
        for(Tournament t : tournaments){
            System.out.println(t);
        }
    }
    public void inputResult()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matches.length; i++)
        {
            if ("Pending".equals(matches[i].getResult()))
            {
                System.out.println((i + 1) +".-"+  matches[i].toString());
            }
        }

        int matchNumber = 0;

        while(matchNumber < 1 || matchNumber > matches.length)
        {
            System.out.println("Select a match to update the result: ");
            String matchS = sc.nextLine();
            matchNumber = Integer.parseInt(matchS);

            if (matchNumber < 1 || matchNumber > matches.length)
            {
                System.out.println("Wrong number");
            }
        }

        System.out.println("Enter the result of the match: ");
        String result = sc.nextLine();


        matches[matchNumber - 1].setResult(result);

        System.out.println("Updated");
    }

    public void ExpressionLambdaOption1(){
        Arrays.sort(tournaments, (t1,t2)->{
            return t1.getName().compareTo(t2.getName());
        });
        for(Tournament tournament : tournaments){
            System.out.println(tournament);
        }
    }
    public void ExpressionLambdaOption2()
    {
        Arrays.sort(players, (p1, p2) -> {
            int ranking = Float.compare(p1.getRanking(), p2.getRanking());
            return ranking != 0 ? ranking : p1.getName().compareTo(p2.getName());
        });

        for (Player player : players)
        {
            System.out.println(player);
        }
    }
    public void ExpressionLambdaOption3(){
        Arrays.sort(teams,(t1,t2)->
                Float.compare(t2.getTotalRanking(), t1.getTotalRanking()));
        for(Team team : teams){
            System.out.println(team);
        }
    }

    public void ExpressionLambdaOption8()
    {
        Arrays.sort(matches, new Comparator<Match>() {
            @Override
            public int compare(Match m1, Match m2) {
                return m1.getAt().getName().compareTo(m2.getAt().getName());
            }
        });

        for (Match match : matches)
        {
            System.out.println(match);
        }
    }
    public void AnonymousClassOption1(){
        Arrays.sort(tournaments, new Comparator<Tournament>() {
            @Override
            public int compare(Tournament t1, Tournament t2) {
                return t1.getName().compareTo(t2.getName());
            }

        });
        for(Tournament tour:tournaments){
            System.out.println(tour);
        }
    }
    public void AnonymousExpressionOption2()
    {
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                int ranking = Float.compare(p1.getRanking(), p2.getRanking());
                return ranking != 0 ? ranking : p1.getName().compareTo(p2.getName());
            }
        });

        for (Player player : players)
        {
            System.out.println(player);
        }
    }
    public void AnonymousClassOption3(){
        Arrays.sort(teams,new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2) {
                return Float.compare(t2.getTotalRanking(), t1.getTotalRanking());
            }
        });
        for(Team team : teams){
            System.out.println(team);
        }
    }
    public void AnonymousClassOption8()
    {
        Arrays.sort(matches, new Comparator<Match>() {
            @Override
            public int compare(Match m1, Match m2) {
                return m1.getAt().getName().compareTo(m2.getAt().getName());
            }
        });

        for (Match match : matches)
        {
            System.out.println(match);
        }
    }



}
