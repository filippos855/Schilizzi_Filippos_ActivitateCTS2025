package cts.schilizzi.filippos.g304.builder;

import java.util.List;

public class Magazin {
    private final String denumire;
    private final int suprafata;
    private final int numarIntrari;
    private final Podea podea;
    private final List<Decoratiune> decoratiuni;

    Magazin(String denumire, int suprafata, int numarIntrari, Podea podea, List<Decoratiune> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.numarIntrari = numarIntrari;
        this.podea = podea;
        this.decoratiuni = decoratiuni;
    }

    public double calculGradIncendiu() {
        int duritate = (podea != null) ? podea.getDuritate() : 5;
        long nrInflamabile = decoratiuni.stream()
                .filter(d -> d.getMaterial().equalsIgnoreCase("Textil") || d.getMaterial().equalsIgnoreCase("Plastic"))
                .count();
        return nrInflamabile * (10 - duritate) * 1.5;
    }

    @Override
    public String toString() {
        return "Magazin: " + denumire + ", suprafata: " + suprafata + ", intrari: " + numarIntrari +
                ", podea: " + (podea != null ? podea : "standard") +
                ", decoratiuni: " + decoratiuni + ", grad incendiu: " + calculGradIncendiu();
    }
}
