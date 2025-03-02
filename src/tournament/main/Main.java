package tournament.main;

import tournament.exceptions.*;
import java.util.Scanner;
//Inés Perez, Carlos Severá, Sheila Rodríguez. 1ºDAW.
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        TournamentManager tournamentManager = new TournamentManager();
        tournamentManager.initialize();

        String username;
        String option;

        boolean exit = false;

        while(!exit) {
            Menu();

            System.out.println("Enter an option : ");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    //Comparator
                    tournamentManager.OrderTournamentsByName();
                    System.out.println();
                    //Lambda expression
                    tournamentManager.ExpressionLambdaOption1();
                    System.out.println();
                    //Anonymous Class
                    tournamentManager.AnonymousClassOption1();
                    System.out.println();
                    break;
                case "2":
                    //Comparator
                    tournamentManager.orderedPlayerInformationByRankigAndName();
                    System.out.println();
                     //Lambda expression
                    tournamentManager.expressionLambdaOption2();
                    System.out.println();
                    //Anonymous Class
                    tournamentManager.anonymousExpressionOption2();
                    System.out.println();
                    break;
                case "3":
                    //Comparator
                    tournamentManager.showTeamRanking();
                    System.out.println();
                    //Lambda expression
                    tournamentManager.ExpressionLambdaOption3();
                    System.out.println();
                    //Anonymous class
                    tournamentManager.AnonymousClassOption3();
                    System.out.println();
                    break;
                case "4":
                    tournamentManager.addNewPlayer();
                    break;
                case "5":
                    System.out.println("Select a name to search: ");
                    username = sc.nextLine();
                    tournamentManager.findPlayer(username);
                    break;
                case "6":
                    System.out.println("Select a coincidence to search: ");
                    username = sc.nextLine();
                    tournamentManager.findPlayer(username);
                    break;
                case "7":
                    System.out.println("Enter the name of a team: ");
                    String teamName = sc.nextLine();

                    tournamentManager.findTeam(teamName);
                    break;
                case "8":
                    //Comparator
                    tournamentManager.matchedOrderedByTournamentName();
                    System.out.println();
                    //Lambda expression
                    tournamentManager.expressionLambdaOption8();
                    System.out.println();
                    //Anonymoys class
                    tournamentManager.anonymousClassOption8();
                    break;
                case "9":
                    tournamentManager.inputResult();
                    break;
                case "10":
                    exit = true;
                    System.out.println("Exit, bye!");
                    break;
                default:
                    System.out.println("Incorrect option, try again : ");
                    break;
            }
        }
    }
}
