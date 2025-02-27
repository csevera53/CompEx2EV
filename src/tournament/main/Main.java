package tournament.main;
import tournament.comparator.PlayerComparatorByRanking;
import tournament.data.Match;
import tournament.data.Player;
import tournament.data.Team;
import tournament.data.Tournament;
import tournament.exceptions.FullTeamException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
    public static void fullTeam(Player [] players) throws FullTeamException {
        Team t = new Team();
        Player p  = new Player();

        if(players.length >= 5)
        {
            throw new FullTeamException("The team is full !");
        }
    }
    public static void showTeam(Team team)
    {
        for(Player p : team.getPlayers())
        {
            System.out.println(p);
        }
    }
    public static void Menu()
    {
        System.out.println("""
                    1.-View available tournaments ordered by name
                    2.-View players information ordered by ranking and name
                    3.-View teams information ordered by ranking
                    4.-Add a new player to a team
                    5.-Find an exact player by name
                    6.-Find players
                    7.-Find teams
                    8.-Show all the matches ordered by tournament name
                    9.-Update the result of the matches pending
                    10.-Exit""");
    }
    public static void main(String[] args) throws FullTeamException
    {
        Team t = new Team();
        Player p  = new Player();
        TournamentManager tournamentManager = new TournamentManager();
        tournamentManager.initialize();
        String username = " ";
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit)
        {
            Menu();
            System.out.println("Enter an option : ");
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    //Comparator
                    tournamentManager.OrderTournamentsByName();

                    //Lambda expression
                    Arrays.sort(tournamentManager.getTournaments(), Comparator.comparing(Tournament::getName));
                    for(Tournament tournament : tournamentManager.getTournaments()){
                        System.out.println(tournament);
                    }

                    //Anonymous Class
                    Arrays.sort(tournamentManager.getTournaments(), new Comparator<Tournament>() {
                        @Override
                        public int compare(Tournament o1, Tournament o2) {
                            return o1.getName().compareTo(o2.getName());
                        }

                    });
                    for(Tournament tour:tournamentManager.getTournaments()){
                        System.out.println(tour);
                    }

                    break;
                case "2":
                     tournamentManager.OrderedPlayerInformationByRankigAndName();
                    break;
                case "3":

                    break;
                case "4":
                    fullTeam(t.getPlayers());
                    try{
                        t.addPlayer(p);
                        showTeam(t);
                    }
                    catch (FullTeamException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "5":
                    tournamentManager.findPlayer(username);
                    break;
                case "6":
                    tournamentManager.findTeam(username);
                    break;
                case "7":
                    System.out.println("Enter the name of a team: ");
                    String teamName = sc.nextLine();

                    tournamentManager.findTeam(teamName);
                    break;
                case "8":
                    tournamentManager.MatchedOrderedByTournamentName();
                    break;
                case "9":
                    tournamentManager.inputResult();
                    break;
                case "10":
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect option, try again : ");
                    break;
            }
        }
    }
}
