package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital8 {
    public static void main(String[] args) {
        Departament spital = new Departament("Spital General");

        Departament chirurgie = new Departament("Chirurgie");
        chirurgie.adauga(new Sectie("Chirurgie generală"));
        chirurgie.adauga(new Sectie("Ortopedie"));

        Departament medicina = new Departament("Medicină Internă");
        medicina.adauga(new Sectie("Cardiologie"));
        medicina.adauga(new Sectie("Gastroenterologie"));

        spital.adauga(chirurgie);
        spital.adauga(medicina);
        spital.adauga(new Sectie("Pediatrie"));

        spital.afiseazaStructura(0);
    }
}
