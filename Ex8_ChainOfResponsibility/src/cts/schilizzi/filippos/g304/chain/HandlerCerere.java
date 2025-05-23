package cts.schilizzi.filippos.g304.chain;

public abstract class HandlerCerere {
    protected HandlerCerere urmator;

    public void setUrmator(HandlerCerere urmator) {
        this.urmator = urmator;
    }

    public abstract void proceseazaCerere(double suma);
}
