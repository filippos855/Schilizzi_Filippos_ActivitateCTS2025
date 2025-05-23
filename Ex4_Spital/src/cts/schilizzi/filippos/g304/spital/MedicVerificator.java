package cts.schilizzi.filippos.g304.spital;

public class MedicVerificator {
    public boolean confirmaInternare(PacientInternare pacientInternare) {
        System.out.println("Medicul verifică pacientul " + pacientInternare.getNume());
        return pacientInternare.areStareGrava();
    }
}
