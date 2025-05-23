package cts.schilizzi.filippos.g304.restaurant;

import java.util.ArrayList;
import java.util.List;

public class ManagerCuptoare {
    private final List<Cuptor> cuptoare;

    public ManagerCuptoare(int nrCuptoare) {
        cuptoare = new ArrayList<>();
        for (int i = 0; i < nrCuptoare; i++) {
            cuptoare.add(new Cuptor(i + 1));
        }
    }

    public void distribuiePreparat(Preparat p) {
        Cuptor cuptorDisponibil = cuptoare.stream()
                .min((c1, c2) -> Integer.compare(c1.arePreparat() ? 1 : 0, c2.arePreparat() ? 1 : 0))
                .orElse(cuptoare.get(0));
        cuptorDisponibil.adaugaPreparat(p);
    }

    public void proceseazaToate() {
        for (Cuptor cuptor : cuptoare) {
            cuptor.proceseaza();
        }
    }
}
