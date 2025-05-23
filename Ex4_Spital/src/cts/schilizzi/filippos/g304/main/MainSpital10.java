package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital10 {
    public static void main(String[] args) {
        PacientFactory factory = new PacientFactory();

        PacientFlyweight p1 = factory.getPacient("Andrei Popescu", 30, "A+");
        PacientFlyweight p2 = factory.getPacient("Andrei Popescu", 30, "A+"); // același obiect
        PacientFlyweight p3 = factory.getPacient("Maria Georgescu", 25, "O-");

        p1.afiseazaInternare("Salon 101", "2025-05-22");
        p2.afiseazaInternare("Salon 201", "2025-05-23");
        p3.afiseazaInternare("Salon 301", "2025-05-24");

        System.out.println("p1 == p2 ? " + (p1 == p2)); // true – partajare reală
    }
}
