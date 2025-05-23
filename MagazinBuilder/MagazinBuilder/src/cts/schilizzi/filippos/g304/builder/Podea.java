package cts.schilizzi.filippos.g304.builder;

public class Podea {
    private String tip;
    private int duritate;

    public Podea(String tip, int duritate) {
        this.tip = tip;
        this.duritate = duritate;
    }

    public int getDuritate() {
        return duritate;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return tip + " (duritate " + duritate + ")";
    }
}