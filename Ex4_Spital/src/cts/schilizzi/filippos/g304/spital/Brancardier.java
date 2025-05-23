package cts.schilizzi.filippos.g304.spital;

public class Brancardier implements PersonalSpital {
    private final String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Brancardier: " + nume);
    }
}
