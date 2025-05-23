package cts.schilizzi.filippos.g304.clubsportiv;

public interface Subject {
    void aboneaza(Observer o);
    void dezaboneaza(Observer o);
    void notifica(String medicament);
}
