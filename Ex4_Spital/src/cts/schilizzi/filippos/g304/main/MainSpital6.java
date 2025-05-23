package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital6 {
    public static void main(String[] args) {
        MedicVerificator medic = new MedicVerificator();
        Salon salon = new Salon(2);
        InternareFacade internare = new InternareFacade(medic, salon);

        PacientInternare p1 = new PacientInternare("Ionel", true);
        PacientInternare p2 = new PacientInternare("Mihai", false);
        PacientInternare p3 = new PacientInternare("Maria", true);

        internare.verificaSiInterneaza(p1);
        internare.verificaSiInterneaza(p2);
        internare.verificaSiInterneaza(p3);
    }
}
