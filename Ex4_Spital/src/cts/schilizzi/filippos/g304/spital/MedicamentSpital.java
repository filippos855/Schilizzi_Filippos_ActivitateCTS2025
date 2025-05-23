package cts.schilizzi.filippos.g304.spital;

public class MedicamentSpital {
    private final String denumire;

    public MedicamentSpital(String denumire) {
        this.denumire = denumire;
    }

    public void prezintaReteta() {
        System.out.println("Se prezintă rețeta pentru: " + denumire);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul \"" + denumire + "\" a fost achiziționat prin sistemul spitalului.");
    }
}
