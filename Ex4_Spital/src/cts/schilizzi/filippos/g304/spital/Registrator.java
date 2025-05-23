package cts.schilizzi.filippos.g304.spital;

public class Registrator implements PersonalSpital {
    private final String nume;

    public Registrator(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Registrator: " + nume);
    }
}
