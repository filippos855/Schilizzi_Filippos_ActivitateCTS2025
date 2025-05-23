package cts.schilizzi.filippos.g304.spital;

public class ProxyInternare implements Internabil {
    private final Internabil spital;

    public ProxyInternare(Internabil spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.areAsigurare()) {
            spital.interneaza(pacient);
        } else {
            System.out.println("Internare refuzată pentru " + pacient.getNume() + ": nu are asigurare de sănătate.");
        }
    }
}
