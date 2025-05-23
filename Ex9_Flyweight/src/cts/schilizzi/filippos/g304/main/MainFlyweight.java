package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.flyweight.*;

public class MainFlyweight {
    public static void main(String[] args) {
        FactoryCaracter factory = new FactoryCaracter();
        String text = "banana";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            CaracterFlyweight caracter = factory.getCaracter(c);
            caracter.afiseaza(i);
        }

        System.out.println("S-au folosit " + text.chars().distinct().count() + " obiecte flyweight.");
    }
}
