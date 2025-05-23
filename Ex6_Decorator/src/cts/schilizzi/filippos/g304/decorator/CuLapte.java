package cts.schilizzi.filippos.g304.decorator;

public class CuLapte extends DecoratorBautura {
    public CuLapte(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String descriere() {
        return bautura.descriere() + " + lapte";
    }

    @Override
    public double cost() {
        return bautura.cost() + 1.5;
    }
}
