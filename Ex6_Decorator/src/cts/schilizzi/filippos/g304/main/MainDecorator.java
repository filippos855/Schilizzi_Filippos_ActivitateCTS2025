package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.decorator.*;

public class MainDecorator {
    public static void main(String[] args) {
        Bautura cafea = new Cafea();
        cafea = new CuLapte(cafea);
        cafea = new CuFrisca(cafea);

        System.out.println("Comandă: " + cafea.descriere());
        System.out.println("Preț total: " + cafea.cost() + " lei");
    }
}
