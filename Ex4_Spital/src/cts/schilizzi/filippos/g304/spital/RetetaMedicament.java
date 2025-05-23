package cts.schilizzi.filippos.g304.spital;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements Reteta {
    private String denumire;
    private Map<String, Double> compozitie = new HashMap<>();

    public RetetaMedicament(String denumire) {
        this.denumire = denumire;
    }

    public void adaugaSolutie(String solutie, double cantitate) {
        compozitie.put(solutie, cantitate);
    }

    @Override
    public RetetaMedicament cloneaza() {
        RetetaMedicament copie = new RetetaMedicament(this.denumire + " - COPIE");
        copie.compozitie = new HashMap<>(this.compozitie);
        return copie;
    }

    @Override
    public String toString() {
        return "Rețetă: " + denumire + ", compoziție: " + compozitie;
    }
}
