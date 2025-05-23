package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.adapter.*;

public class MainAdapter {
    public static void main(String[] args) {
        IncarcatorMicroUsb microUsb = new IncarcatorMicroUsb();
        IncarcatorUsbC incarcareAdaptata = new AdapterMicroUsbToUsbC(microUsb);

        incarcareAdaptata.incarca();
    }
}
