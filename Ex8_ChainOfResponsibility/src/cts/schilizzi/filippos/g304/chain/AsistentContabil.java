package cts.schilizzi.filippos.g304.chain;

public class AsistentContabil extends HandlerCerere {
    @Override
    public void proceseazaCerere(double suma) {
        if (suma <= 500) {
            System.out.println("Asistentul contabil a aprobat suma de " + suma + " lei.");
        } else if (urmator != null) {
            urmator.proceseazaCerere(suma);
        }
    }
}
