package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital4 {
    public static void main(String[] args) {
        RetetaMedicament original = new RetetaMedicament("Solutie Calmanta");
        original.adaugaSolutie("Apa distilata", 100.0);
        original.adaugaSolutie("Extract de musetel", 20.5);

        System.out.println("Original: " + original);

        RetetaMedicament copie1 = original.cloneaza();
        RetetaMedicament copie2 = original.cloneaza();

        System.out.println("Copie 1: " + copie1);
        System.out.println("Copie 2: " + copie2);
    }
}
