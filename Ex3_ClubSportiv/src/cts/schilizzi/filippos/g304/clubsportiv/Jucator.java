package cts.schilizzi.filippos.g304.clubsportiv;

import java.util.ArrayList;
import java.util.List;

public abstract class Jucator implements Observer {
    protected String nume;
    protected List<String> antrenamente = new ArrayList<>();
    protected List<String> medicamenteInterzise = new ArrayList<>();

    public Jucator(String nume) {
        this.nume = nume;
    }

    public abstract void initializareAntrenamente();

    public void adaugaAntrenament(String antrenament) {
        antrenamente.add(antrenament);
        System.out.println(nume + " a adăugat antrenamentul: " + antrenament);
    }

    public void incepeAntrenament() {
        System.out.println("=== Antrenament pentru " + nume + " ===");
        for (String a : antrenamente) {
            System.out.println("- " + a);
        }
    }

    public void testDoping() {
        System.out.println(nume + " este testat anti-doping pentru: " + medicamenteInterzise);
    }

    @Override
    public void actualizeazaListaMedicamente(String medicament) {
        medicamenteInterzise.add(medicament);
        System.out.println("[" + nume + "] a fost informat despre noul medicament interzis: " + medicament);
    }
}
