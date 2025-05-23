package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.chain.*;

public class MainChain {
    public static void main(String[] args) {
        HandlerCerere asistent = new AsistentContabil();
        HandlerCerere sef = new SefContabil();
        HandlerCerere director = new DirectorEconomic();

        asistent.setUrmator(sef);
        sef.setUrmator(director);

        double[] sume = {250, 1500, 5000};
        for (double suma : sume) {
            System.out.println("\nCerere pentru " + suma + " lei:");
            asistent.proceseazaCerere(suma);
        }
    }
}
