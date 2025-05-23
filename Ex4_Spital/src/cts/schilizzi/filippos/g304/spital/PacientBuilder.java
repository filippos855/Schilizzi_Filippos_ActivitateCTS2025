package cts.schilizzi.filippos.g304.spital;

public class PacientBuilder {
    private String nume;
    private boolean patRabatabil = false;
    private boolean micDejunInclus = false;
    private boolean papuciCamera = false;
    private boolean halatInterior = false;

    public PacientBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilder cuPatRabatabil() {
        this.patRabatabil = true;
        return this;
    }

    public PacientBuilder cuMicDejun() {
        this.micDejunInclus = true;
        return this;
    }

    public PacientBuilder cuPapuci() {
        this.papuciCamera = true;
        return this;
    }

    public PacientBuilder cuHalat() {
        this.halatInterior = true;
        return this;
    }

    public Pacient build() {
        return new Pacient(nume, patRabatabil, micDejunInclus, papuciCamera, halatInterior);
    }
}
