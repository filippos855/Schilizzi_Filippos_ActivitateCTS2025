package cts.schilizzi.filippos.g304.chain;

public class SefContabil extends HandlerCerere {
    @Override
    public void proceseazaCerere(double suma) {
        if (suma <= 2000) {
            System.out.println("Șeful contabil a aprobat suma de " + suma + " lei.");
        } else if (urmator != null) {
            urmator.proceseazaCerere(suma);
        }
    }
}
