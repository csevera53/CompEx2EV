package tournament.main;

import tournament.data.*;
import tournament.exceptions.*;
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
                        public int compare(Tournament t1, Tournament t2) {
                            return t1.getName().compareTo(t2.getName());
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

                    //Comparator
                    tournamentManager.showTeamRanking();

                    //Lambda expression
                    Arrays.sort(tournamentManager.getTeams(),(t1,t2)->
                            Float.compare(t2.getTotalRanking(), t1.getTotalRanking()));
                    for(Team team : tournamentManager.getTeams()){
                        System.out.println(team);
                    }

                    //Anonymous class
                    Arrays.sort(tournamentManager.getTeams(),new Comparator<Team>() {
                        @Override
                        public int compare(Team t1, Team t2) {
                            return Float.compare(t2.getTotalRanking(), t1.getTotalRanking());
                        }
                    });
                    for(Team team : tournamentManager.getTeams()){
                        System.out.println(team);
                    }
                    break;
                case "4":

                    try {
                        t.addPlayer(p);

                    } catch (FullTeamException e) {
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
