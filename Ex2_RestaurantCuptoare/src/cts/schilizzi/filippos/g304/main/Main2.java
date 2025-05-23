package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.restaurant.*;

public class Main2 {
    public static void main(String[] args) {
        ManagerCuptoare manager = new ManagerCuptoare(4);

        Preparat p1 = new Preparat("Pizza Margherita", 220, 5);
        Preparat p2 = new Preparat("Lasagna", 180, 7);
        Preparat p3 = new Preparat("Coaste BBQ", 200, 10);
        Preparat p4 = new Preparat("Pui la cuptor", 190, 6);
        Preparat p5 = new Preparat("Briose", 170, 4);

        manager.distribuiePreparat(p1);
        manager.distribuiePreparat(p2);
        manager.distribuiePreparat(p3);
        manager.distribuiePreparat(p4);
        manager.distribuiePreparat(p5);

        for (int i = 0; i < 5; i++) {
            manager.proceseazaToate();
        }
    }
}
