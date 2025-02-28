package tournament.exceptions;

public class MustBeFloat extends RuntimeException {
    public MustBeFloat(String message) {
        super("The ranking must be a float");
    }
}
