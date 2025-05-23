package cts.schilizzi.filippos.g304.spital;

public class Pacient {
    private final String nume;
    private final boolean stareGrava;

    public Pacient(String nume, boolean stareGrava) {
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
