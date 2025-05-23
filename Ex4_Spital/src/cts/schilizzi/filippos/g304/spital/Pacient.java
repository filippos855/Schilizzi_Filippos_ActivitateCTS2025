package cts.schilizzi.filippos.g304.spital;

public class Pacient {
    private final String nume;
    private final boolean patRabatabil;
    private final boolean micDejunInclus;
    private final boolean papuciCamera;
    private final boolean halatInterior;
    private final boolean areAsigurare; // 🆕 pentru A.9

    public Pacient(String nume, boolean patRabatabil, boolean micDejunInclus,
                   boolean papuciCamera, boolean halatInterior, boolean areAsigurare) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
        this.areAsigurare = areAsigurare;
    }

    // Constructor folosit de Builder pentru retrocompatibilitate
    Pacient(String nume, boolean patRabatabil, boolean micDejunInclus,
            boolean papuciCamera, boolean halatInterior) {
        this(nume, patRabatabil, micDejunInclus, papuciCamera, halatInterior, true);
    }

    public String getNume() {
        return nume;
    }

    public boolean areAsigurare() {
        return areAsigurare;
    }

    @Override
    public String toString() {
        return "Pacient: " + nume +
                "\n - Pat rabatabil: " + patRabatabil +
                "\n - Mic dejun inclus: " + micDejunInclus +
                "\n - Papuci cameră: " + papuciCamera +
                "\n - Halat interior: " + halatInterior +
                "\n - Asigurare medicală: " + areAsigurare;
    }
}
