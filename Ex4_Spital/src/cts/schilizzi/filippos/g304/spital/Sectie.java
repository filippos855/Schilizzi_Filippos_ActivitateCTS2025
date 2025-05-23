package cts.schilizzi.filippos.g304.spital;

public class Sectie extends UnitateSpital {

    public Sectie(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaStructura(int indent) {
        System.out.println(" ".repeat(indent) + "- Secție: " + denumire);
    }
}
