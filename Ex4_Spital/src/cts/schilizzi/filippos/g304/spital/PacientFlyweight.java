package cts.schilizzi.filippos.g304.spital;

public class PacientFlyweight {
    private final String nume;
    private final int varsta;
    private final String grupaSanguina;

    public PacientFlyweight(String nume, int varsta, String grupaSanguina) {
        this.nume = nume;
        this.varsta = varsta;
        this.grupaSanguina = grupaSanguina;
    }

    public void afiseazaInternare(String salon, String data) {
        System.out.println("Pacient: " + nume + " (" + varsta + " ani, grupa: " + grupaSanguina + ") internat în salonul "
                + salon + " la data " + data);
    }
}
