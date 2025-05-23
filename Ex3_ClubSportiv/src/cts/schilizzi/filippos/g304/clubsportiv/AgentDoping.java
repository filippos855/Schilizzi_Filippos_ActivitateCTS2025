package cts.schilizzi.filippos.g304.clubsportiv;

import java.util.ArrayList;
import java.util.List;

public class AgentDoping implements Subject {
    private final List<Observer> jucatori = new ArrayList<>();

    @Override
    public void aboneaza(Observer o) {
        jucatori.add(o);
    }

    @Override
    public void dezaboneaza(Observer o) {
        jucatori.remove(o);
    }

    @Override
    public void notifica(String medicament) {
        System.out.println("=== ALERTĂ: Medicament nou interzis - " + medicament + " ===");
        for (Observer o : jucatori) {
            o.actualizeazaListaMedicamente(medicament);
        }
    }
}
