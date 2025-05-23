package cts.schilizzi.filippos.g304.spital;

public class ManagerStareRezultat {
    private RezultatMemento stareSalvata;

    public void salveazaStare(RezultatMemento memento) {
        this.stareSalvata = memento;
    }

    public RezultatMemento getStareSalvata() {
        return stareSalvata;
    }
}
