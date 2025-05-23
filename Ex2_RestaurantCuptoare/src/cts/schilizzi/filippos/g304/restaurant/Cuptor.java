package cts.schilizzi.filippos.g304.restaurant;

import java.util.LinkedList;
import java.util.Queue;

public class Cuptor {
    private final int id;
    private final Queue<Preparat> queue = new LinkedList<>();

    public Cuptor(int id) {
        this.id = id;
    }

    public void adaugaPreparat(Preparat preparat) {
        queue.add(preparat);
        System.out.println("Preparatul " + preparat.getNume() + " a fost adăugat în cuptorul #" + id);
    }

    public void proceseaza() {
        if (!queue.isEmpty()) {
            Preparat p = queue.poll();
            System.out.println("Gătim " + p + " în cuptorul #" + id + "...");
            try {
                Thread.sleep(p.getTimpGatire() * 100L); // simulare
            } catch (InterruptedException e) {
                System.out.println("Gătirea a fost întreruptă.");
            }
            System.out.println("Preparatul " + p.getNume() + " este gata din cuptorul #" + id);
        }
    }

    public boolean arePreparat() {
        return !queue.isEmpty();
    }
}
