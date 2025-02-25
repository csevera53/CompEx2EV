package tournament.main;

import tournament.data.Player;
import tournament.data.Team;
import tournament.exceptions.FullTeamException;

import java.util.Scanner;

public class Main
{
    public static void FindTeams(Team [] t)
    {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("Introduce a team name: ");
        String teamName = sc.nextLine();

        for (int i = 0; i < t.length; i++)
        {
            if (t[i].getName().equals(teamName))
            {
                found = true;
                System.out.println(t[i]);
            }

            else {
                found = false;
                System.out.println("Team's name not found");
            }
        }
    }
    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("""
                    1.- View available tournaments ordered by name
                    2.-View players information ordered by ranking and name
                    3.-View teams information ordered by ranking
                    4.-Add a new player to a team
                    5.-Find an exact player by name
                    6.-Find players
                    7.-Find teams
                    8.-Show all the matches ordered by tournament name
                    9.-Update the result of the matches pending
                    10.-Exit""");

            System.out.println("Enter an option : ");
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    //FindTeams(t);
                    break;
                case "8":
                    break;
                case "9":
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
    public static void main(String[] args) throws FullTeamException
    {
        Scanner sc = new Scanner(System.in);
        Menu();
        TournamentManager tournamentManager = new TournamentManager();
        tournamentManager.initialize();

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
