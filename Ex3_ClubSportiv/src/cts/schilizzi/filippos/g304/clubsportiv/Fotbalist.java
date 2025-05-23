package cts.schilizzi.filippos.g304.clubsportiv;

public class Fotbalist extends Jucator {
    public Fotbalist(String nume) {
        super(nume);
        initializareAntrenamente();
    }

    @Override
    public void initializareAntrenamente() {
        antrenamente.add("Sprinturi");
        antrenamente.add("Lovituri libere");
    }
}
