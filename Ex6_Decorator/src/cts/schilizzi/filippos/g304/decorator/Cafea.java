package cts.schilizzi.filippos.g304.decorator;

public class Cafea implements Bautura {
    @Override
    public String descriere() {
        return "Cafea simplă";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
