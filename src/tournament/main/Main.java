package tournament.main;
import tournament.comparator.PlayerComparatorByRanking;
import tournament.data.Match;
import tournament.data.Player;
import tournament.data.Team;
import tournament.exceptions.FullTeamException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
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
        Player p = new Player();
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
                    break;
                case "2":
                   // p.OrderedPlayerInformationByRankigAndName();
                    break;
                case "3":
                    break;
                case "4":
                    t.addPlayer(p);
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
                    tournamentManager.UpdateMatchedPending();
                    break;
                case "10":
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect option, try again : ");
                    break;
            }
        }
        //System.out.println(tournamentManager.findPlayer("Carlos Severá"));
        //System.out.println(tournamentManager.findTeam("G2"));
    }
}
