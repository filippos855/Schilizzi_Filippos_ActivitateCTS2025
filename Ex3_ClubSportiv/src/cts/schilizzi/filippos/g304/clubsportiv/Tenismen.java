package cts.schilizzi.filippos.g304.clubsportiv;

public class Tenismen extends Jucator {
    public Tenismen(String nume) {
        super(nume);
        initializareAntrenamente();
    }

    @Override
    public void initializareAntrenamente() {
        antrenamente.add("Servicii");
        antrenamente.add("Backhand");
    }
}
