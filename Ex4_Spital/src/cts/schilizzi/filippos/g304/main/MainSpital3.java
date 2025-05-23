package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital3 {
    public static void main(String[] args) {
        AbstractFactoryPersonal factoryMedical = new FactoryPersonalMedical();
        AbstractFactoryPersonal factoryNonMedical = new FactoryPersonalNonMedical();

        PersonalSpital p1 = factoryMedical.createPersonal("medic", "Dr. Alexa");
        PersonalSpital p2 = factoryMedical.createPersonal("asistent", "Ioana");
        PersonalSpital p3 = factoryNonMedical.createPersonal("registrator", "Mihai");
        PersonalSpital p4 = factoryNonMedical.createPersonal("secretar", "Elena");

        p1.descriere();
        p2.descriere();
        p3.descriere();
        p4.descriere();
    }
}
