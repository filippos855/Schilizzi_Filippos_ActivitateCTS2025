package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital9 {
    public static void main(String[] args) {
        Internabil spital = new Spital();
        Internabil proxy = new ProxyInternare(spital);

        Pacient p1 = new PacientBuilder()
                .setNume("Ion")
                .cuPatRabatabil()
                .build();
        Pacient p2 = new Pacient("Maria", false, false, false, false, false); // fără asigurare
        Pacient p3 = new Pacient("Vlad", true, true, false, false, true);     // cu asigurare

        proxy.interneaza(p1); // dacă builderul include asigurare: true
        proxy.interneaza(p2);
        proxy.interneaza(p3);
    }
}
