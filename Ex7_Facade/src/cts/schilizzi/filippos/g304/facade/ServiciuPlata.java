package cts.schilizzi.filippos.g304.facade;

public class ServiciuPlata {
    public boolean plateste(String nume, double suma) {
        System.out.println(nume + " a plătit " + suma + " lei.");
        return true;
    }
}
