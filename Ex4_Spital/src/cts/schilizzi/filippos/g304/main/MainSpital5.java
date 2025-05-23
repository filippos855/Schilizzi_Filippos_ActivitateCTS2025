package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.spital.*;

public class MainSpital5 {
    public static void main(String[] args) {
        MedicamentSpital mSpital = new MedicamentSpital("Ibuprofen");

        // Folosit normal în spital
        mSpital.achizitioneazaMedicament();

        System.out.println("==========");

        // Folosit în farmacie prin Adapter
        MedicamentFarmacie mFarmacie = new AdapterMedicamentFarmacie(mSpital);
        mFarmacie.cumparaMedicament();
    }
}
