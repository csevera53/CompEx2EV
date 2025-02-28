package tournament.data;

public class Match {
    Tournament at;
    Participant participant1;
    Participant participant2;
    String result;

    public Match(Tournament at, Participant participant1, Participant participant2) {
        this.at = at;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.result = "Pending";
    }

    public Tournament getAt() {
        return at;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match in " + at.getName() + " - " + participant1.getName() + "vs. " + participant2.getName()
                + " - " + "Result: " + result;
    }
}
