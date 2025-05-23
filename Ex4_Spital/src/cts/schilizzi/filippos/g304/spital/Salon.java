package cts.schilizzi.filippos.g304.spital;

public class Salon {
    private int nrPaturiLibere;

    public Salon(int nrPaturiLibere) {
        this.nrPaturiLibere = nrPaturiLibere;
    }

    public boolean arePatLiber() {
        return nrPaturiLibere > 0;
    }

    public void ocupaPat() {
        if (nrPaturiLibere > 0) {
            nrPaturiLibere--;
            System.out.println("Un pat a fost ocupat. Paturi rămase: " + nrPaturiLibere);
        } else {
            System.out.println("Nu sunt paturi disponibile.");
        }
    }
}
