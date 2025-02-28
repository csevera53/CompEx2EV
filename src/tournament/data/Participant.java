package tournament.data;

public abstract class Participant {
    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public Participant() {
        name = " ";
    }

    public String getName() {
        return name;
    }
}