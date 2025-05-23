package cts.schilizzi.filippos.g304.spital;

public class MedicVerificator {
    public boolean confirmaInternare(Pacient pacient) {
        System.out.println("Medicul verifică pacientul " + pacient.getNume());
        return pacient.areStareGrava();
    }
}
