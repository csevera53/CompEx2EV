package tournament.exceptions;

public class Level1to100 extends Exception {
    public Level1to100(String message) {
        super("The level of the player must be among 1 and 100, and has to be an integer");
    }
}
