package cts.schilizzi.filippos.g304.builder;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder {
    private String denumire;
    private int suprafata;
    private int numarIntrari = 1;
    private Podea podea = null;
    private List<Decoratiune> decoratiuni = new ArrayList<>();

    public MagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    public MagazinBuilder setSuprafata(int suprafata) {
        this.suprafata = suprafata;
        return this;
    }

    public MagazinBuilder setNumarIntrari(int numarIntrari) {
        this.numarIntrari = numarIntrari;
        return this;
    }

    public MagazinBuilder setPodea(Podea podea) {
        this.podea = podea;
        return this;
    }

    public MagazinBuilder adaugaDecoratiune(Decoratiune decoratiune) {
        this.decoratiuni.add(decoratiune);
        return this;
    }

    public Magazin build() throws ExceptieMagazin {
        if (denumire == null || suprafata <= 0) {
            throw new ExceptieMagazin("Denumirea și suprafața trebuie specificate.");
        }

        if (numarIntrari < suprafata / 100) {
            throw new ExceptieMagazin("Număr insuficient de intrări pentru suprafață.");
        }

        if (podea != null && podea.getDuritate() < 2) {
            for (Decoratiune d : decoratiuni) {
                if (d.getMaterial().equalsIgnoreCase("Sticla")) {
                    throw new ExceptieMagazin("Podeaua moale nu permite decoratiuni din sticla.");
                }
            }
        }

        return new Magazin(denumire, suprafata, numarIntrari, podea, decoratiuni);
    }
}
