package cts.schilizzi.filippos.g304.restaurant;

public class Preparat {
    private String nume;
    private int temperatura;
    private int timpGatire; // în secunde

    public Preparat(String nume, int temperatura, int timpGatire) {
        this.nume = nume;
        this.temperatura = temperatura;
        this.timpGatire = timpGatire;
    }

    public String getNume() {
        return nume;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getTimpGatire() {
        return timpGatire;
    }

    @Override
    public String toString() {
        return nume + " (temp: " + temperatura + "°C, timp: " + timpGatire + "s)";
    }
}
