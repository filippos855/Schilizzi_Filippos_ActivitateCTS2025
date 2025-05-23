package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital1 {
    public static void main(String[] args) {
        Pacient p1 = new PacientBuilder()
                .setNume("Ion Popescu")
                .cuPatRabatabil()
                .cuMicDejun()
                .build();

        Pacient p2 = new PacientBuilder()
                .setNume("Maria Georgescu")
                .cuHalat()
                .cuPapuci()
                .cuMicDejun()
                .build();

        Pacient p3 = new PacientBuilder()
                .setNume("Diana Vasilescu")
                .build(); // fără facilități

        System.out.println(p1);
        System.out.println("-------------");
        System.out.println(p2);
        System.out.println("-------------");
        System.out.println(p3);
    }
}
