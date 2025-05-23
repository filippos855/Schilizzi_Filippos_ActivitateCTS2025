package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital7 {
    public static void main(String[] args) {
        RezultatAnaliza rezultat = new RezultatAnaliza("printat");
        rezultat.afiseaza();

        ManagerStareRezultat manager = new ManagerStareRezultat();
        manager.salveazaStare(rezultat.salvareStare());

        // Se trece la afișare online
        rezultat.setFormaAfisare("online");
        rezultat.afiseaza();

        // Se revine la forma inițială
        rezultat.restaurareStare(manager.getStareSalvata());
        rezultat.afiseaza();
    }
}
