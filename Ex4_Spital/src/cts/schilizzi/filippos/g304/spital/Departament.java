package cts.schilizzi.filippos.g304.spital;

import java.util.ArrayList;
import java.util.List;

public class Departament extends UnitateSpital {
    private final List<UnitateSpital> subunitati = new ArrayList<>();

    public Departament(String denumire) {
        super(denumire);
    }

    public void adauga(UnitateSpital unitate) {
        subunitati.add(unitate);
    }

    public void sterge(UnitateSpital unitate) {
        subunitati.remove(unitate);
    }

    @Override
    public void afiseazaStructura(int indent) {
        System.out.println(" ".repeat(indent) + "+ Departament: " + denumire);
        for (UnitateSpital u : subunitati) {
            u.afiseazaStructura(indent + 4);
        }
    }
}
