package cts.schilizzi.filippos.g304.spital;

public class Medic implements PersonalSpital {
    private final String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Medic: " + nume);
    }
}
