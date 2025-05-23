package cts.schilizzi.filippos.g304.spital;

public abstract class UnitateSpital {
    protected String denumire;

    public UnitateSpital(String denumire) {
        this.denumire = denumire;
    }

    public abstract void afiseazaStructura(int indent);
}
