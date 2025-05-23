package cts.schilizzi.filippos.g304.decorator;

public class CuFrisca extends DecoratorBautura {
    public CuFrisca(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String descriere() {
        return bautura.descriere() + " + frișcă";
    }

    @Override
    public double cost() {
        return bautura.cost() + 2.0;
    }
}
