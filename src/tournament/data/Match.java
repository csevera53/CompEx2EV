package tournament.data;

public class Match
{
    Tournament at;
    Participant participant1;
    Participant participant2;

    String result;

    public Match(Tournament at, Participant participant1, Participant participant2, String result)
    {
        this.at = at;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.result = "Pending";
    }

    public Tournament getAt()
    {
        return at;
    }

    public void setAt(Tournament at)
    {
        this.at = at;
    }

    public Participant getParticipant1() {
        return participant1;
    }

    public void setParticipant1(Participant participant1) {
        this.participant1 = participant1;
    }

    public Participant getParticipant2() {
        return participant2;
    }

    public void setParticipant2(Participant participant2) {
        this.participant2 = participant2;
    }

    public String getResult() {
        return result;
    }

    public String setResult(String result)
    {
        return "Match in " + at + " - " + participant1 + "vs. " + participant2 + " - " + "Result: " + result;
    }
}
