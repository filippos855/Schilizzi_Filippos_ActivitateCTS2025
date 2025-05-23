package cts.schilizzi.filippos.g304.adapter;

public class AdapterMicroUsbToUsbC implements IncarcatorUsbC {
    private final IncarcatorMicroUsb incarcareVeche;

    public AdapterMicroUsbToUsbC(IncarcatorMicroUsb incarcareVeche) {
        this.incarcareVeche = incarcareVeche;
    }

    @Override
    public void incarca() {
        System.out.println("<< Adapter activat >>");
        incarcareVeche.incarcaTelefon();
    }
}
