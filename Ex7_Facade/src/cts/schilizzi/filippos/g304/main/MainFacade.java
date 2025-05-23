package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.facade.FacadeRezervareBilet;

public class MainFacade {
    public static void main(String[] args) {
        FacadeRezervareBilet sistem = new FacadeRezervareBilet();
        sistem.rezerva("Filippos Schilizzi", "Atena", 350.0);
    }
}
