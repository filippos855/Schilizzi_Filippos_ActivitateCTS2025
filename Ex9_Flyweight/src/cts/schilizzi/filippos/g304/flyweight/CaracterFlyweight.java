package cts.schilizzi.filippos.g304.flyweight;

public class CaracterFlyweight {
    private final char caracter;

    public CaracterFlyweight(char caracter) {
        this.caracter = caracter;
    }

    public void afiseaza(int pozitie) {
        System.out.println("Caracter '" + caracter + "' la poziția " + pozitie);
    }
}
