package cts.schilizzi.filippos.g304.spital;

public class Secretar implements PersonalSpital {
    private final String nume;

    public Secretar(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Secretar: " + nume);
    }
}
