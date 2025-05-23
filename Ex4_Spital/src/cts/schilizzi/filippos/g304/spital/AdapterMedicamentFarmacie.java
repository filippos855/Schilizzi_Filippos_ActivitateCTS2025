package cts.schilizzi.filippos.g304.spital;

public class AdapterMedicamentFarmacie implements MedicamentFarmacie {
    private final MedicamentSpital medicamentSpital;

    public AdapterMedicamentFarmacie(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("<< Integrare farmacie → spital >>");
        medicamentSpital.achizitioneazaMedicament();
    }
}
