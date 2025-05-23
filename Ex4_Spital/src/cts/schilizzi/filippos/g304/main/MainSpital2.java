package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital2 {
    public static void main(String[] args) {
        PersonalSpital p1 = FactoryPersonal.creeazaPersonal(TipPersonal.MEDIC, "Dr. Vasilescu");
        PersonalSpital p2 = FactoryPersonal.creeazaPersonal(TipPersonal.BRANCARDIER, "Ionel Popa");
        PersonalSpital p3 = FactoryPersonal.creeazaPersonal(TipPersonal.ASISTENT, "Cristina Dima");

        p1.descriere();
        p2.descriere();
        p3.descriere();
    }
}
