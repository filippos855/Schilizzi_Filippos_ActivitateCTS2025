package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.builder.*;

public class Main {
    public static void main(String[] args) {
        try {
            Magazin m1 = new MagazinBuilder()
                    .setDenumire("Zara")
                    .setSuprafata(300)
                    .setNumarIntrari(3)
                    .adaugaDecoratiune(new Decoratiune("Plastic"))
                    .build();

            Magazin m2 = new MagazinBuilder()
                    .setDenumire("Ikea")
                    .setSuprafata(500)
                    .setNumarIntrari(5)
                    .setPodea(new Podea("Lemn", 3))
                    .adaugaDecoratiune(new Decoratiune("Sticla"))
                    .build();

            Magazin m3 = new MagazinBuilder()
                    .setDenumire("C&A")
                    .setSuprafata(150)
                    .setPodea(new Podea("Vinil", 1))
                    .adaugaDecoratiune(new Decoratiune("Textil"))
                    .build();

            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m3);
        } catch (ExceptieMagazin e) {
            System.err.println("Eroare la creare magazin: " + e.getMessage());
        }
    }
}
