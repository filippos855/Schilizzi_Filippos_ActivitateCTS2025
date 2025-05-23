package cts.schilizzi.filippos.g304.spital;

public class RezultatAnaliza {
    private String formaAfișare; // ex: "printat", "online"

    public RezultatAnaliza(String formaAfișare) {
        this.formaAfișare = formaAfișare;
    }

    public void afiseaza() {
        System.out.println("Rezultatul este afișat în format: " + formaAfișare);
    }

    public void setFormaAfisare(String formaAfișare) {
        this.formaAfișare = formaAfișare;
    }

    public RezultatMemento salvareStare() {
        return new RezultatMemento(this.formaAfișare);
    }

    public void restaurareStare(RezultatMemento memento) {
        this.formaAfișare = memento.getStareSalvata();
    }
}
