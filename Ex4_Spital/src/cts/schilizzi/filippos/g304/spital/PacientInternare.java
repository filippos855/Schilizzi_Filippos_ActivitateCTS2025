package cts.schilizzi.filippos.g304.spital;

public class PacientInternare {
    private final String nume;
    private final boolean stareGrava;

    public PacientInternare(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public boolean areStareGrava() {
        return stareGrava;
    }

    public String getNume() {
        return nume;
    }
}
