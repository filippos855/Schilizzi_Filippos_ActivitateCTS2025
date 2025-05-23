package cts.schilizzi.filippos.g304.spital;

public class Asistent implements PersonalSpital {
    private final String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Asistent: " + nume);
    }
}
