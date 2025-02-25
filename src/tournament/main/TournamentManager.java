package tournament.main;
import tournament.data.*;

public class TournamentManager {

    public void initialize(){
        Player[] players = new Player[20];

        players[0] = new Player("Sheila Rodríguez",200,14f);
        players[1] = new Player("Inés Pérez",210,13f);
        players[2] = new Player("Carlos Severá",198,53f);
        players[3] = new Player("Mari Chelo",203,39f);
        players[4] = new Player("Nacho Cabanes",207,3f);
        players[5] = new Player("José Manuel Fuster",195,20f);
        players[6] = new Player("Virginia Checa",190,32f);
        players[7] = new Player("Roberto Carvalho",193,41f);
        players[8] = new Player("Carmela Souza",202,15f);
        players[9] = new Player("Giovanna Dos Santos",200,18f);
        players[10] = new Player("Yoshida Ramen",190,19f);
        players[11] = new Player("Kawasaki Reguetunin",201,2f);
        players[12] = new Player("Aleksandr Petrov", 198, 45f);
        players[13] = new Player("Hiroshi Tanaka", 202, 48f);
        players[14] = new Player("Santiago Fernández", 195, 42f);
        players[15] = new Player("Elena Dimitrova", 210, 49f);
        players[16] = new Player("Jonathan O'Connor", 205, 46f);
        players[17] = new Player("Fatima Al-Mansouri", 200, 47f);
        players[18] = new Player("Kwame Mensah", 197, 43f);
        players[19] = new Player("Isabella Conti", 203, 44f);


        Player[] playersG2 = new Player[4];
        playersG2[0] = players[0];
        playersG2[1] = players[1];
        playersG2[2] = players[2];
        playersG2[3] = players[3];

        Player[] playersHeretics = new Player[4];
        playersHeretics[0] = players[4];
        playersHeretics[1] = players[5];
        playersHeretics[2] = players[6];
        playersHeretics[3] = players[7];

        Player[] playersT1 = new Player[4];
        playersT1[0] = players[8];
        playersT1[1] = players[9];
        playersT1[2] = players[10];
        playersT1[3] = players[11];

        Player[] playersKoi = new Player[4];
        playersKoi[0] = players[12];
        playersKoi[1] = players[13];
        playersKoi[2] = players[14];
        playersKoi[3] = players[15];

        Team[] teams = new Team[4];
        teams[0] = new Team("G2",playersG2);
        teams[1] = new Team("Heretics",playersHeretics);
        teams[2] = new Team("T1",playersT1);
        teams [3] = new Team("Koi",playersKoi);

        Tournament[] tournaments = new Tournament[3];
        tournaments[0] = new MixedTournament("Stardew RAW", "Stardew Valley",
                10000,"1V1");
        tournaments[1] = new IndividualTournament("Rocket Premier",
                "Rocket League",15000);
        tournaments[2] = new TeamTournament("Rocketfeller","Rocket",
                12050,4);

        Match[] matches = new Match[12];
        matches[0] = new Match(tournaments[0],players[16],players[17],"");
        matches[1] = new Match(tournaments[0],players[18],players[19],"");
        matches[2] = new Match(tournaments[0],players[16],players[19],"");
        matches[3] = new Match(tournaments[0],players[18],players[17],"");
        matches[4] = new Match(tournaments[1],players[0],players[8],"");
        matches[5] = new Match(tournaments[1],players[15],players[12],"");
        matches[6] = new Match(tournaments[1],players[4],players[10],"");
        matches[7] = new Match(tournaments[1],players[11],players[13],"");
        matches[8] = new Match(tournaments[2],teams[0],teams[1],"");
        matches[9] = new Match(tournaments[2],teams[2],teams[3],"");
        matches[10] = new Match(tournaments[2],teams[2],teams[1],"");
        matches[11] = new Match(tournaments[2],teams[0],players[2],"");
    }
}
