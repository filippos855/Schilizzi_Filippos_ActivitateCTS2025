package cts.schilizzi.filippos.g304.decorator;

public abstract class DecoratorBautura implements Bautura {
    protected final Bautura bautura;

    public DecoratorBautura(Bautura bautura) {
        this.bautura = bautura;
    }
}
