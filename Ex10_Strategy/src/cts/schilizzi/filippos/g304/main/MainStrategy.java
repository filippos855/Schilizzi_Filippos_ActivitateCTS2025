package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.strategy.*;

public class MainStrategy {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategie(new Adunare());
        System.out.println("Adunare: " + calculator.executaStrategie(10, 5));

        calculator.setStrategie(new Inmultire());
        System.out.println("Înmulțire: " + calculator.executaStrategie(10, 5));
    }
}
