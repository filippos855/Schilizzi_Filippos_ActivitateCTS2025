package cts.schilizzi.filippos.g304.spital;

public class Pacient {
    private final String nume;
    private final boolean patRabatabil;
    private final boolean micDejunInclus;
    private final boolean papuciCamera;
    private final boolean halatInterior;

    Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient: " + nume +
                "\n - Pat rabatabil: " + patRabatabil +
                "\n - Mic dejun inclus: " + micDejunInclus +
                "\n - Papuci cameră: " + papuciCamera +
                "\n - Halat interior: " + halatInterior;
    }
}
